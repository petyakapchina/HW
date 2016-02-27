
public class AllTasks {
	private Task[] tasks;
	private int freePlacesForTasks = 10;
	private int currentUnassignedTasks = 0;

	AllTasks() {
		this.tasks = new Task[freePlacesForTasks];
	}

	public void addTask(Task newTask) {
		if (newTask != null) {
			for (int index = 0; index < this.tasks.length; index++) {
				if (this.tasks[index] == null) {
					this.tasks[index] = newTask;
					return;
				}
			}
		}
		System.out.println("No free places!");
	}

	public Task getNextTask() {
		if (this.currentUnassignedTasks>=10){
			this.currentUnassignedTasks=0;
		}
		if (this.currentUnassignedTasks < 10) {
			return this.tasks[currentUnassignedTasks++];
		}
		return null;
	}

	public boolean isAllWorkDone() {
		boolean isWorkDone = false;
		for (int index = 0; index < this.tasks.length; index++) {
			if (this.tasks[index].getWorkingHours() == 0) {
				isWorkDone = true;
			} else {
				isWorkDone = false;
			}
		}
		return isWorkDone;
	}

	@Override
	public String toString() {
		for (int index = 0; index < this.tasks.length; index++) {
			System.out.println(this.tasks[index].getName() + " ");
		}
		return "";
	}

	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		if (tasks != null) {
			this.tasks = tasks;
		}
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		if (freePlacesForTasks > 0 && freePlacesForTasks <= 10) {
			this.freePlacesForTasks = freePlacesForTasks;
		}
	}

	public int getCurrentUnassignedTasks() {
		return currentUnassignedTasks;
	}

	public void setCurrentUnassignedTasks(int currentUnassignedTasks) {
		if (currentUnassignedTasks >= 0) {
			this.currentUnassignedTasks = currentUnassignedTasks;
		}
	}

}
