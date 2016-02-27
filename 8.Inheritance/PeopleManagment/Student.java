package PeopleManagment;

public class Student extends Person {
	private static final double MAX_GRADE = 6.0;
	private static final double MIN_GRADE = 2.0;
	
	private double score;

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}

	@Override
	void showPersonInfo() {
		super.showPersonInfo();
		System.out.println("Grade: " + this.score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= MIN_GRADE && score <= MAX_GRADE) {
			this.score = score;
		}
	}

}
