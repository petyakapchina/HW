import java.util.Scanner;

public class Zadacha9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number from 10 to 99:");
		int number = sc.nextInt();
		System.out.print("Input second number from 10 to 99:");
		int number1 = sc.nextInt();
		int product;
		product = (number * number1);
		int lastFigure;
		lastFigure = (product % 10);
		if (((number >= 10) && (number <= 99)) && ((number1 >= 10) && (number1 <= 99))) {
			if ((lastFigure % 2) == 0) {
				System.out.println(product + " " + lastFigure + " " + "Even");
			} else {
				System.out.println(product + " " + lastFigure + " " + "Odd");
			}
		if (((number < 10) || (number > 99)) && ((number1 < 10) || (number1 > 99))) {
				System.out.println("The input number are incorrect!");

			}
		}
	}
}
