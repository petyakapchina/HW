package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client implements IClient, Comparable<Client> {
	private String name;
	private String address;
	private double salary;
	private double accountAmount;
	private List<BankProduct> myProducts;

	public Client(String name, String Address, double salary, double money) {
		this.setName(name);
		this.setAddress(Address);
		this.setSalary(salary);
		this.setAccountAmount(salary);
		this.myProducts = new ArrayList<BankProduct>();
	}

	@Override
	public void openDeposit(Deposit d) {
		if (d != null)
			;
		this.myProducts.add(d);
		this.accountAmount -= d.getAmount();
	}

	@Override
	public void requestCredit(Credit c) {
		if (c != null) {
			this.myProducts.add(c);
			this.accountAmount += c.getAmount();
		}
	}

	@Override
	public void payCreditFee() {
		double all = 0;
		for (BankProduct c : this.myProducts) {
			if (c instanceof Credit) {
				this.accountAmount -= ((Credit) c).getFee();
				all += ((Credit) c).getFee();
			}
		}
		System.out.println(this.name + " has paid " + all + " LEVS monthly fees on credits.");

	}

	public String getName() {
		return this.name;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public double getAccountAmount() {
		return accountAmount;
	}

	private void setAccountAmount(double accountAmount) {
		if (accountAmount > 0) {
			this.accountAmount = accountAmount;
		}
	}

	public void addMoneyToAccount(double money) {
		this.accountAmount += money;
	}

	public List<BankProduct> getMyProducts() {
		return Collections.unmodifiableList(this.myProducts);
	}

	public void addNewProduct(BankProduct b) {
		if (b != null) {
			this.myProducts.add(b);
		}
	}

	public void removeProduct(BankProduct b) {
		if (b != null && this.myProducts.contains(b)) {
			this.myProducts.remove(b);
		}
	}

	@Override
	public int compareTo(Client c) {
		if (this.name.equals(c.name) && this.salary==c.salary && this.address.equals(c.address)) {
			return 0;
		}
		return -1;
	}

}
