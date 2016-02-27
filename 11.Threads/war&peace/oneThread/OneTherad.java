package oneThread;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class OneTherad {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("war&peace.txt"));
		StringBuilder sb = new StringBuilder();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();
		long timeCase1 = 0;

		sb.toString();
		int numberOfCommas = 0;

		long time = System.currentTimeMillis();
		for (int index = 0; index < sb.length(); index++) {
			if (sb.charAt(index) == ',') {
				numberOfCommas++;
			}
		}
		System.out.println("Case 1 - Number of commas is: " + numberOfCommas);
		timeCase1 = System.currentTimeMillis() - time;
		System.out.println("Time in case 1: " + timeCase1);
		
	}
}
