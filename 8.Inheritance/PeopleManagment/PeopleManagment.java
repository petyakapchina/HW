package PeopleManagment;

public class PeopleManagment {
	public static void main(String[] args) {
		Person man = new Person("Ivan", 23, true);
		Person woman = new Person("Mariya", 30, false);

		Student student = new Student("Georgi", 19, true, 4.75);
		Student studentka = new Student("Kalina", 20, false, 5.93);

		Employee kolega = new Employee("Andrey", 38, true, 100);
		Employee kolejka = new Employee("Daniela", 26, false, 58);
		
		Person [] people = new Person [10];

		people[0] = man;
		people[1] = woman;
		people[2] = student;
		people[3] = studentka;
		people[4] = kolega;
		people[5] = kolejka;

		for (int index = 0; people[index] != null; index++) {
			people[index].showPersonInfo();
			System.out.println();
		}

		for (int index = 0; people[index] != null; index++) {
			if (people[index].equals(kolega)) {
				System.out.println(kolega.getName()+" was paid for overtime "+kolega.calculateOvertime(2));
			}
			if (people[index].equals(kolejka)) {
				System.out.println(kolejka.getName()+" was paid for overtime "+kolejka.calculateOvertime(2));
			}
		}

	}

}
