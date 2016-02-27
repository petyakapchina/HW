import java.util.Scanner;

public class Zadacha1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter text: ");
		String text=sc.nextLine();
		System.out.print("Enter text: ");
		String text1=sc.nextLine();
		if ((text.length()<=40)&&(text1.length()<=40)){
			System.out.println(text.toUpperCase()+" "+text.toLowerCase());
		    System.out.println(text1.toUpperCase()+" "+text1.toLowerCase());
		}
		else {
			System.out.println("Please, enter maximum 40 charectars!");
		}
	}

}
