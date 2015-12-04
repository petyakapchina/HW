import java.util.Scanner;

public class Zadacha4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input number 1: ");
		int num = sc.nextInt();
		System.out.print("Input number 2: ");
		int num2 = sc.nextInt();
		if (num > num2) {
			System.out.println(num2 + "  " + num);
		}
		else {
			System.out.println(num + "  " + num2);
		}
	}

}
