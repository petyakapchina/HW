package task1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bank implements IBank {
	private static Bank theOnlyOne = null;

	private String name;
	private String address;
	private Map<Client, List<BankProduct>> portfolio;
	private double moneyAvailable;
	private double bankReserve;

	private Bank(String name, String address) {
		this.setAddress(address);
		this.setName(name);
		this.portfolio = new TreeMap<Client, List<BankProduct>>();
	}

	public static Bank createTheBank(String name, String address) {
		if (theOnlyOne == null) {
			theOnlyOne = new Bank(name, address);
		}
		return theOnlyOne;
	}

	@Override
	public void takeDeposit(Deposit d, Client fromWho) {
		if (d != null && fromWho != null) {
			this.moneyAvailable += (d.getAmount() * 0.9);
			this.bankReserve += (d.getAmount() * 0.1);
			if (!this.portfolio.containsKey(fromWho)) {
				List<BankProduct> list = new LinkedList<BankProduct>();
				list.add(d);
				this.portfolio.put(fromWho, list);
			} else {
				List<BankProduct> list = this.portfolio.get(fromWho);
				list.add(d);
				this.portfolio.put(fromWho, list);
			}
			fromWho.openDeposit(d);

		}
	}

	@Override
	public void payIntrestToAllDeposits() {
		for (Client c : this.portfolio.keySet()) {
			for (BankProduct p : c.getMyProducts()) {
				if (p instanceof Deposit) {
					c.addMoneyToAccount(((Deposit) p).getFee());
					this.moneyAvailable -= ((Deposit) p).getFee();
				}
			}
		}
	}

	@Override
	public Credit giveCredit(Client who, Credit c) {
		if (who != null && c != null) {
			double sumOfFees = 0;
			for (BankProduct r : who.getMyProducts()) {
				if (r instanceof Credit) {
					sumOfFees += r.getFee();
				}
				if ((who.getSalary() * 0.5) >= sumOfFees && (this.moneyAvailable - c.getAmount() >= this.bankReserve)) {
					who.addNewProduct(c);
					this.portfolio.put(who, who.getMyProducts());
					who.requestCredit(c);
					this.moneyAvailable -= c.getAmount();
					return (Credit) c;
				}
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address != null && address.length() > 0) {
			this.address = address;
		}
	}

	public Map<Client, List<BankProduct>> getPortfolio() {
		return Collections.unmodifiableMap(this.portfolio);
	}

	double getMoneyAvailable() {
		return moneyAvailable;
	}

	double getBankReserve() {
		return this.bankReserve;
	}

	void addMoneyAvailable(double m) {
		if (m > 0) {
			this.moneyAvailable += m;
		}
	}

	void recieveCreditFee(){
		for(Client c:this.portfolio.keySet())
			for(BankProduct b:c.getMyProducts()){
				if(b instanceof Credit){
					this.moneyAvailable+=b.getFee();
				}
			}
		}
	
	
	public void addToPortFlio(Client c, List<BankProduct> bp){
		if(c!=null && bp!=null){
			this.portfolio.put(c, bp);
		}
		
	}
}
