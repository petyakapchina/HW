package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		sc.close();

		text = text.toLowerCase();

		List<Character> letters = new ArrayList<Character>();

		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) >= 'a' && text.charAt(index) <= 'z') {
				letters.add(text.charAt(index));
			}
		}

		Map<Character, Integer> letterCount = new TreeMap<Character, Integer>();
		for (Character c : letters) {
			if (!(letterCount.containsKey(c))) {
				letterCount.put(c, 1);
			} else {
				letterCount.put(c, ((Integer) letterCount.get(c) + 1));
			}
		}

		List<Character> ordered = new ArrayList<Character>();
		ordered.addAll(letterCount.keySet());
		Collections.sort(ordered, (letter1, letter2) -> letterCount.get(letter1) - letterCount.get(letter2));

		double maxFreq = 0;
		for (Character c : letterCount.keySet()) {
			if (letterCount.get(c) > maxFreq) {
				maxFreq = letterCount.get(c);
			}
		}

		for (Iterator<Character> it = ordered.iterator(); it.hasNext();) {
			Character key = it.next();
			Integer value = letterCount.get(key);
			double howManyD = (value / maxFreq) * 20;
			String dies = "";
			while (howManyD > 0) {
				dies += "#";
				howManyD--;
			}
			System.out.println(Character.toUpperCase(key) + ": " + value + " " + dies);
		}

		// vsichki dumi, koito se sreshtat n na broi puti
		// Map<Integer, List<Character>> howManyTimes = new TreeMap<Integer,
		// List<Character>>();
		// for (Character c : letterCount.keySet()) {
		// if(!(howManyTimes.containsKey(letterCount.get(c)))){
		// List<Character> list = new LinkedList<Character>();
		// list.add(c);
		// howManyTimes.put(letterCount.get(c), list);
		// }
		// howManyTimes.get(letterCount.get(c)).add(c);
		// }
		//
		// for(Integer i:howManyTimes.keySet()){
		// System.out.println(i+" "+howManyTimes.get(i));
		// }

	}
}
