package task1;

public class Credit extends BankProduct {
	private double monthlyFee;
	
	public Credit(double accountAmount, int period, double interest) {
		super(accountAmount, period, interest);
		this.monthlyFee = (accountAmount * fixedIterest) / period;
	}

	@Override
	public double getFee() {
		return monthlyFee;
	}

	@Override
	public double getRealCost() {
		return this.monthlyFee*this.getPeriodInMonths()+this.getAmount();
	}
	
	
	
	

}
