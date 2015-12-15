

public class Demo {
	public static void main(String[] args) {
		Task designDress = new Task("Design a dress", 4.50);
		Task chooseModels = new Task("Select models for the fashion show", 8.00);
		
		Employee designer = new Employee("Jordjo");	
		designer.hoursLeft=8;
		designer.currentTask=designDress;
		
		designer.work();
		designer.showReport();
		System.out.println();
		
		designer.currentTask=chooseModels;
		designer.work();
		designer.showReport();
		
		
		
	}

}
