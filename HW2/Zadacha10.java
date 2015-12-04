import java.util.Scanner;

public class Zadacha10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input a number: ");
		int num = sc.nextInt();
		boolean isPrimer=true;
		for (int i=2; i <= (num/2); i++) {
			if (num % i == 0) {
				System.out.println("Not a primer!");
				isPrimer=false;
				break;
			}
			}
								
		if (isPrimer==true) {
			System.out.println("Primer!");
		}
	}
	}


