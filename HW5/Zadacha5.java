import java.util.Scanner;

public class zadachaPet {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a word: ");
		String firstWord = sc.next();
		System.out.print("Enter second word: ");
		String secondWord = sc.next();
		boolean isMatch = true;
		int space = 0;
		int position=0;
		for (int index=0; index<firstWord.length(); index++){
			char letter = firstWord.charAt(index);
			space = secondWord.indexOf(letter);
			if (space>=0){
				position=index;
				isMatch = true;
				break;
			}
			else{
				isMatch=false;
			}
		}
		if (isMatch){
		for (int index=0; index<firstWord.length(); index++){
			char letter = firstWord.charAt(index);
			if (index<position){
				for (int spc=0; spc<space; spc++){
					System.out.print(" ");
				}
				System.out.println(letter);
			}
			if (index==position){
				System.out.println(secondWord);
			}
			if(index>position){
				for (int spc=0; spc<space; spc++){
					System.out.print(" ");
				}
				System.out.println(letter);
			}
		}
		}
		if(!isMatch){
			System.out.println("There are no matching letters!");
		}
		sc.close();
	}

}
