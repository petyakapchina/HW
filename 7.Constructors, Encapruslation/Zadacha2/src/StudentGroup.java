
public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (s.subject.equalsIgnoreCase(this.groupSubject) && this.freePlaces > 0) {
			for (int index = 0; index < this.students.length; index++) {
				if (this.students[index] == null) {
					this.students[index] = s;
					this.freePlaces--;
					break;
				} else {
					continue;
				}
			}
		}
	}

	void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	String bestStudent() {
		String bestStudent = this.students[0].name;
		double maxGrade = this.students[0].grade;
		for (int index = 1; this.students[index]!=null; index++) {
			if (this.students[index].grade > maxGrade) {
				bestStudent = this.students[index].name;
				maxGrade = this.students[index].grade;
			}
		}
		return bestStudent;
	}

	void printStudentsInGroup() {
		System.out.println("Subject " + this.groupSubject);
		for (int index = 0; this.students[index]!=null; index++) {
			System.out.println("Name: " + this.students[index].name);
			System.out.println("Age: " + this.students[index].age);
			System.out.println("Year in college: " + this.students[index].yearInCollege);
			System.out.println("Grade: " + this.students[index].grade);
			System.out.println("Graduated: " + this.students[index].isDegree);
			System.out.println("Money from scholarships: " + this.students[index].money);
			System.out.println();
		}
	}

}
