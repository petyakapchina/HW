import java.util.Scanner;

public class Zadacha10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String text = sc.nextLine();
		for(int index=0; index<text.length(); index++){
			char letter = (char) (text.charAt(index)+5);
			System.out.print(letter);			
		}
	}
}
