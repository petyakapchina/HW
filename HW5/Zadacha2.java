import java.util.Scanner;

public class VtoraZadacha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String firstWord = sc.nextLine();
		System.out.print("Enter a second word: ");
		String secondWord = sc.nextLine();
		int length = 0;
		if (firstWord.length() > secondWord.length()) {
			length = firstWord.length();
			String beginning = secondWord.substring(0, 5);
			String end = firstWord.substring(5);
			String newWord = beginning + end;
			System.out.println(length + " " + newWord);
		} else {
			length = secondWord.length();
			String beginning = firstWord.substring(0, 5);
			String end = secondWord.substring(5);
			String newWord = beginning + end;
			System.out.println(length + " " + newWord);
		}

	}
}
