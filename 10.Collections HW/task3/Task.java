package task3;

public class Task implements ITask{
	private String work;

	Task(String work) {
		if (work != null && work.length() > 0) {
			this.work = work;
		}
	}

	@Override
	public void doWork() {
		System.out.println(work);
	}

}
