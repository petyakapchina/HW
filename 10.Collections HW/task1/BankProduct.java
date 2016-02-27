package task1;

import java.util.HashSet;
import java.util.Set;

public abstract class BankProduct {
	private static final int NUM_OF_FIG_IN_IBAN = 4;
	private static final int MAX_NUM_OF_MONTHS = 60;
	private static final int MIN_NUM_OF_MONTHS = 1;
	double fixedIterest;

	private String IBAN = "BGBNBG";
	private double amount;
	private int periodInMonths;
	private static Set<String> IBANBase = new HashSet<String>();

	public BankProduct(double amount, int period, double interest) {
		this.setPeriodInMonths(period);
		this.setAmount(amount);
		this.IBAN = this.generateIBAN();
		this.setInterest(interest);
	}

	public String getIBAN() {
		return IBAN;
	}

	private String generateIBAN() {
		do {
			for (int index = 0; index < NUM_OF_FIG_IN_IBAN; index++) {
				this.IBAN += (int) (Math.random() * 10);
				;
			}
		} while (!this.checkIBAN(this.IBAN));
		return this.IBAN;
	}

	private boolean checkIBAN(String IBAN) {
		for (String i : IBANBase) {
			if (IBAN.equals(i)) {
				return false;
			}
		}
		return true;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void addMoneyToAccount(double money) {
		this.amount += money;
	}

	public int getPeriodInMonths() {
		return periodInMonths;
	}

	private void setPeriodInMonths(int periodInMonths) {
		if (periodInMonths >= MIN_NUM_OF_MONTHS && periodInMonths <= MAX_NUM_OF_MONTHS) {
			this.periodInMonths = periodInMonths;
		}
	}

	private void setInterest(double i) {
		if (i > 0) {
			this.fixedIterest = i;
		}
	}

	public double getInterest() {
		return this.fixedIterest;
	}
	
	
	public abstract double getFee();
	public abstract double getRealCost();

}
