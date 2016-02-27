package task3;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
	private static Queue<ITask> allTasks = new LinkedList<ITask>();

	public void push(ITask task) {
		if (task != null) {
			allTasks.add(task);
		}

	}

	public static void main(String[] args) {
		ITask task1 = new Task("Read the condition!");
		ITask task2 = new Task("Make a class-diagram.");
		ITask task3 = new Task("Make classes and intefaces.");
		ITask task4 = new Task("Write the mothods of every class.");
		ITask task5 = new Task("Test it!");

		Scheduler s = new Scheduler();
		s.push(task1);
		s.push(task2);
		s.push(task3);
		s.push(task4);
		s.push(task5);

		for (ITask t : Scheduler.allTasks) {
			t.doWork();
		}
	}

}
