import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		int number1, number2, change;
	    Scanner in = new Scanner(System.in);
	    System.out.print("Въведи първото число:");
	    number1 = in.nextInt();
	    System.out.print("Въведи второто число:"); 
	    number2=in.nextInt();
	 
	    System.out.println("Преди размяната:" + number1 + " "+ number2);
	 
	    change=number1;
	    number1=number2;
	    number2=change;
	    System.out.println("След размяната:" + number1 + " "+ number2);
		
		

	}

}
