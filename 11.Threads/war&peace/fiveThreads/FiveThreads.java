package fiveThreads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FiveThreads {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Scanner sc = new Scanner(new File("war&peace.txt"));
		StringBuilder sb = new StringBuilder();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();

		sb.toString();

		long timeCase2 = 0;
		int allCommas = 0;
		int lengthDivider = sb.length() / 5;

		String part1 = sb.substring(0, lengthDivider);
		String part2 = sb.substring(lengthDivider+1, 2 * lengthDivider);
		String part3 = sb.substring(2 * lengthDivider+1, 3 * lengthDivider);
		String part4 = sb.substring(3 * lengthDivider+1, 4 * lengthDivider);
		String part5 = sb.substring(4 * lengthDivider+1);

		CommasRegister c1 = new CommasRegister(part1);
		CommasRegister c2 = new CommasRegister(part2);
		CommasRegister c3 = new CommasRegister(part3);
		CommasRegister c4 = new CommasRegister(part4);
		CommasRegister c5 = new CommasRegister(part5);

		long time = System.currentTimeMillis();

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		Thread t4 = new Thread(c4);
		Thread t5 = new Thread(c5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		timeCase2 = System.currentTimeMillis() - time;

		allCommas = c1.getNumber() + c2.getNumber() + c3.getNumber() + c4.getNumber() + c5.getNumber();

		System.out.println("Time in case 2: " + timeCase2);
		System.out.println("All commas: " + allCommas);

	}
}
