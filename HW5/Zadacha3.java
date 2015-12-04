import java.util.Scanner;

public class Zadacha3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a word: ");
		String firstWord = sc.next();
		System.out.print("Enter a second word: ");
		String secondWord = sc.next();
		boolean areSame=true;
		if (firstWord.length()>secondWord.length()){
			System.out.println("The first word is longer - "+ firstWord.length() + " symbols.");
			for (int index=0; index<secondWord.length(); index++){
				char letter = firstWord.charAt(index);
				char letter2= secondWord.charAt(index);
				if (letter!=letter2){
					System.out.println((index+1)+" "+letter+"-"+letter2);
					areSame=false;
				}
				else {
					areSame=true;
					}
			}
			if (areSame){
				System.out.println("All symbols are the same.");
			}
		}	
		if (firstWord.length()<secondWord.length()){
			System.out.println("The second word is longer - "+ secondWord.length() + " symbols.");
			for (int index=0; index<firstWord.length(); index++){
				char letter = firstWord.charAt(index);
				char letter2= secondWord.charAt(index);
				if (letter!=letter2){
					System.out.println((index+1)+" "+letter+"-"+letter2);
					areSame=false;
				}
				else {
					areSame=true;
				}
			}
			if (areSame){
				System.out.println("All symbols are the same.");
			}
		}
		if (firstWord.length()==secondWord.length()){
			System.out.println("The words are equal - "+firstWord.length()+" symbols.");
			for (int index=0; index<secondWord.length(); index++){
				char letter = firstWord.charAt(index);
				char letter2= secondWord.charAt(index);
				if (letter!=letter2){
					System.out.println((index+1)+" "+letter+"-"+letter2);
					areSame=false;
				}
				else {
					areSame=true;
				}
			}
			if (areSame){
				System.out.println("All symbols are the same.");
			}
		}
		
	
	}

}
