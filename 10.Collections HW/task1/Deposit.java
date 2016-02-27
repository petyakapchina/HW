package task1;

public class Deposit extends BankProduct {
	private double paymentToClient;

	public Deposit(double d, int period, double e) {
		super(d, period, e);
		this.paymentToClient = d * fixedIterest;
	}

	@Override
	public double getRealCost() {
		return this.paymentToClient * this.getPeriodInMonths()+this.getAmount();
	}

	@Override
	public void setAmount(double amount) {
		if (amount > 0) {
			super.setAmount(amount);
		}
	}

	@Override
	public double getFee() {
		return this.paymentToClient;
	}

}
