import java.util.Scanner;

public class Zadacha7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String text = sc.nextLine();
		int count=1;
		int max=0;
		for(int index=0; index<text.length(); index++){
			if (text.charAt(index)==' '){
			count++;	
			}
		}
		String [] words = text.split(" ");
		for (int index=0; index<count; index++){
			if(words[index].length()>max){
				max=words[index].length();
			}
		}
		System.out.println("The text has "+count+" words.");
		System.out.println("The longest word has "+max+" letters.");
	}

}
