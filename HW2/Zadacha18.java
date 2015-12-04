import java.util.Scanner;

public class Zadacha18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the first number between 1 and 9: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number between 1 and 9: ");
		int num2 = sc.nextInt();
		if (((num1<1)||(num1>9)) && ((num2<1)||(num2>9))) {
			System.out.println("Please, enter a number between 1 and 9!");
		}
		else {
			int a=1;
			int b=1;
			while (a*b <= num1*num2) {
				for (a=1; a<=num1;a++) {
					for (b=1; b<=num2; b++) {
					System.out.println(a + "*" + b + " "+ "=" + (b*a));
				}
			}
		}
		}
		
	} }

