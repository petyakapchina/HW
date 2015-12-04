import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.next();
		boolean isPolindrom=true;
		char [] stringToChar = word.toCharArray();
		int last = stringToChar.length-1;
		int end = stringToChar.length-1;
		if(stringToChar.length%2==0){
			for(int index=0; index<stringToChar.length/2; index++){
				if (stringToChar[index]==stringToChar[last]){
					isPolindrom=true;
				}
				else{
					isPolindrom=false;
					break;
				}
				last--;
			}
		}
		if(stringToChar.length%2!=0){
			for(int index=0; index<stringToChar.length/2; index++){
				if (stringToChar[index]==stringToChar[end]){
					isPolindrom=true;
				}
				else{
					isPolindrom=false;
					break;
				}
				end--;
			}
		}
		if(isPolindrom){
			System.out.println("Yes.");
		}
		else{
			System.out.println("No.");
		}
	}

}
