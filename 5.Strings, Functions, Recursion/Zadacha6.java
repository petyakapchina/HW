import java.util.Scanner;

public class Zadacha6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String text = sc.nextLine();
		String [] words = text.split(" ");
		for(int index=0; index<words.length; index++){
			String change = words[index];
			String letter=change.substring(0, 1);
			String word=change.substring(1, (change.length()));
			String newLetter = letter.toUpperCase();
			String newWord = word.toLowerCase();
			String finalWord = newLetter+newWord;
			words[index]=finalWord;
		}
		String finalText = String.join(" ", words);
		System.out.println(finalText);
		sc.close();
			
	}

}
