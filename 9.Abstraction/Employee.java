
public class Employee {
	private final int END_OF_WORKING_DAY = 0;
	private final int BEGINNING_OF_WORKING_DAY = 8;

	private String name;
	private Task currentTask;
	private double hoursLeft;
	private static AllTasks allWork = new AllTasks();;

	Employee(String newName) {
		setName(newName);
	}

	public void startWorkingDay() {
		this.hoursLeft = BEGINNING_OF_WORKING_DAY;
	}

	public void work() {
		if (this.currentTask == null) {
			this.setCurrentTask(allWork.getNextTask());
		}
		if (this.currentTask.getWorkingHours() == 0) {
			System.out.println("There is no task left for " + this.name + " to get.");
			this.setCurrentTask(null);
		} else {
			if (this.hoursLeft > this.currentTask.getWorkingHours()) {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setHours(END_OF_WORKING_DAY);
				System.out.println(this.getName() + " has finished " + this.currentTask.getName());
				this.setCurrentTask(allWork.getNextTask());
				System.out.println(this.getName() + " has started " + this.currentTask.getName());
			}
			if (this.hoursLeft < currentTask.getWorkingHours()) {
				this.currentTask.setHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = END_OF_WORKING_DAY;
				System.out.println(this.getName() + " is " + this.currentTask.getName());
			}
			if (this.hoursLeft == currentTask.getWorkingHours()) {
				this.hoursLeft = END_OF_WORKING_DAY;
				this.currentTask.setHours(END_OF_WORKING_DAY);
				System.out.println(this.getName() + " has finished " + this.currentTask.getName());
				this.setCurrentTask(null);

			}
		}

	}

	void showReport() {
		System.out.println("Name: " + this.getName());
		System.out.println("Task: " + currentTask.getName());
		System.out.println("Employee's left hours: " + this.hoursLeft);
		System.out.println("Hours left fot the task to be done: " + currentTask.getWorkingHours());
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setName(String newName) {
		if (newName != null && !newName.equals("")) {
			this.name = newName;
		}
	}

	public void setHoursLeft(double newHoursLeft) {
		if (newHoursLeft >= END_OF_WORKING_DAY && newHoursLeft <= BEGINNING_OF_WORKING_DAY) {
			this.hoursLeft = newHoursLeft;
		}
	}

	public String getName() {
		return this.name;
	}

	public void setAllWork(AllTasks newAllTasks) {
		if (newAllTasks != null) {
			allWork = newAllTasks;
		}
	}

	public AllTasks getAllWork() {
		return allWork;
	}
}
