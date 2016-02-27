import java.util.Scanner;

public class Zadacha5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input number 1: ");
		int num = sc.nextInt();
		System.out.print("Input number 2: ");
		int num2 = sc.nextInt();
		System.out.print("Input number 3: ");
		int num3 = sc.nextInt();
		if ((num > num2) && (num > num3)) {
			if (num2 > num3) {
				System.out.println(num + " " +num2 + " " +num3);
			}
			if (num2 < num3) {
				System.out.println(num + " " + num3 + " " + num2);
			}
		}
		if ((num2 > num) && (num2 > num3)) {
			if (num > num3) {
					System.out.println(num2 + " " + num  + " " + num3);
				}
			if (num < num3) {
					System.out.println(num2 + " " + num3 + " "+ num);
				}
		}
		if ((num3 > num2) && (num3 > num)) {
					if (num2 > num) {
						System.out.println(num3 + " " + num2 + " " + num);
					}
					if (num2 < num) {
						System.out.println(num3 + " " + num + " " + num2);
					}	
			
		}
	
	}
}

	