package threadPool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException, ExecutionException {
		Scanner sc = new Scanner(new File("war&peace.txt"));
		StringBuilder sb = new StringBuilder();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();

		long timeCase3 = 0;
		int lengthDivider = sb.length() / 5;
		
		String part1 = sb.substring(0, lengthDivider);
		String part2 = sb.substring(lengthDivider+1, 2 * lengthDivider);
		String part3 = sb.substring(2 * lengthDivider+1, 3 * lengthDivider);
		String part4 = sb.substring(3 * lengthDivider+1, 4 * lengthDivider);
		String part5 = sb.substring(4 * lengthDivider+1);
		
		long time = System.currentTimeMillis();

		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		List<Future<Integer>> result = new ArrayList<Future<Integer>>();
		
		result.add(pool.submit(new CommasCounter(part1)));
		result.add(pool.submit(new CommasCounter(part2)));
		result.add(pool.submit(new CommasCounter(part3)));
		result.add(pool.submit(new CommasCounter(part4)));
		result.add(pool.submit(new CommasCounter(part5)));
	
		pool.shutdown();
		timeCase3 = System.currentTimeMillis() - time;
		
		Integer allCommas = 0;
		for (Future<Integer> i : result) {
			allCommas += i.get();
		}

		System.out.println("Time in case 3: " + timeCase3);
		System.out.println("Total commas: " + allCommas);

	}

}
