import java.util.Scanner;

public class Zadacha11 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Input number from 100 to 999:");
	int num = sc.nextInt();
	if ((num < 100) || (num > 999)) {
		System.out.println("Invalid number!!!");
		}
	else {
		int a = (num / 100);
		int b = ((num - (a*100))/10);
		int c = (num % 10);
		if ((a==0) || (b==0) || (c==0)) {
			System.out.println("Insert a number without 0!");
		}
		else {
			if ((num % a) == 0) {
				System.out.println("The number breaks up into " + a);
			}
			else {
				System.out.println("The number do not break up into " + a);
			}
			if ((num % b) == 0) {
				System.out.println("The number breaks up into " + b);
			}
			else {
				System.out.println("The number do not break up into " + b);
			}
			if ((num % c) == 0) {
				System.out.println("The number breaks up into " + c);
			}
			else {
				System.out.println("The number do not break up into " + c);
			}
		}
	}
}
}
