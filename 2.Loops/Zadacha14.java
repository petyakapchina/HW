import java.util.Scanner;

public class Zadacha14 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Insetr a number between 10 and 200: ");
	int num = sc.nextInt();
	if ((num<10) || (num >200)) {
		System.out.println("Please, insetr a number between 10 and 200!");
	}
	else {
		int i = 200;
		while (i>=10) {
			if (i < num) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
			}
			i--;
		
		}
	}
}
}
