package PeopleManagment;
public class Employee extends Person {
	private static final int MIN_OVERTIME_HOURS = 0;
	private static final int AGE_LIMIT = 18;
	private static final double COEF_OVERTIME = 1.5;
	private double daySalary;
	
	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}

	double calculateOvertime(double hours) {
		if (this.getAge() < AGE_LIMIT) {
			return 0;
		} else {
			return this.daySalary * hours * COEF_OVERTIME;
		}
	}
	
	void showPersonInfo() {
		super.showPersonInfo();
		System.out.println("Amaount of salary per day: " + this.daySalary);
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary > MIN_OVERTIME_HOURS) {
			this.daySalary = daySalary;
		}
	}
}
