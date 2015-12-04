import java.util.Scanner;

public class Zadacha16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Insetra lower border:");
		int n = sc.nextInt();
		System.out.print("Insert upper border: ");
		int m = sc.nextInt();
		if (((n<10)&&(m>5555)) || ((n<10)&&(m<10))|| ((n>5555)&&(m>5555))) {
			System.out.println("Please, insert numbers from the range");
			System.out.println(" 10 <-> 5555");
		}
		else {
		for (; m>=n; m--) {
			if (m % 50 == 0) {	
			System.out.print(m + ",");
			}
		}
	}
}
}
