import java.util.Scanner;

public class Zdacha13 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Input temperature:");
		int temp = sc.nextInt();
		if (temp <= -20) {
			System.out.println("Freezing cold");
		}
		if ((temp > -20) && (temp <= 0)) {
			System.out.println("Cold");
		}
		if ((temp > 0) && (temp <= 15)) {
			System.out.println("Cool");
		}
		if ((temp > 15) && (temp < 25)) {
			System.out.println("Warm");
		}
		if (temp >= 25) {
			System.out.println("Hot");
		}
	}

}
