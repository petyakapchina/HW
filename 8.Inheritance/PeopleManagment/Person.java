package PeopleManagment;

public class Person {
	private static final int AGE_MIN = 0;
	private String name;
	private int age;
	private boolean isMale;

	Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.setGender(isMale);
	}

	void showPersonInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Years: " + this.age);
		if (this.isMale == true) {
			System.out.println("Gender: male");
		}
		if (this.isMale == false) {
			System.out.println("Gender: female");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= AGE_MIN) {
			this.age = age;
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public void setGender(boolean isMale) {
		this.isMale = isMale;
	}

}
