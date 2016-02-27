import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input a numebr from 1000 to 9999: ");
		int num = sc.nextInt();
		int a = (num/1000);
		int b = ((num - (a*1000))/100);
		int c = ((num - (a*1000) - b*100) / 10);
		int d = (num % 10);
		int num1 = (a*10 + d);
		int num2 = (b*10 + c);
		if ((num < 1000) || (num > 9999)) {
			System.out.println("Incorrect number!");
		}
		if (num1 > num2) {
			System.out.println("Bigger " + num1 + " > " + num2);
		}
		if (num1 == num2) {
			System.out.println("Equale " + num1 + " = " + num2);
		}
		if (num1 < num2) {
			System.out.println("Smaller " + num1 + " < " + num2);
		}
	}

}
