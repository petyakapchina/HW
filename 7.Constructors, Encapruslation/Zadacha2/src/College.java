
public class College {
	public static void main(String[] args) {
		Student petya = new Student("Petya", "Maths", 23);
		petya.grade=6.00;
		
		Student boryana = new Student("Boryana", "Law", 26);
		boryana.grade=6.00;
		
		Student ivan = new Student("Ivan", "Maths", 23);
		ivan.grade = 4.52;
		
		Student kalin = new Student("Kalin", "Maths", 23);
		kalin.grade = 5.12;
		
		Student yavor = new Student("Yavor", "Law", 27);
		yavor.grade=4.69;
		
		boryana.upYear();
		ivan.upYear();
		
		petya.receiveScholarship(5.69, 450);
		boryana.receiveScholarship(5.50, 450);
		
		StudentGroup law = new StudentGroup("Law");
		StudentGroup maths = new StudentGroup("Maths");
		
		law.addStudent(petya);
		law.addStudent(boryana);
		law.addStudent(ivan);
		law.addStudent(kalin);
		law.addStudent(yavor);
		
		maths.addStudent(petya);
		maths.addStudent(boryana);
		maths.addStudent(ivan);
		maths.addStudent(kalin);
		maths.addStudent(yavor);
		
		System.out.println("Best student in group "+law.groupSubject+" is "+ law.bestStudent());
		System.out.println("Best student in group "+maths.groupSubject+" is "+ maths.bestStudent());
		
		law.printStudentsInGroup();
		maths.printStudentsInGroup();
		
	}

}
