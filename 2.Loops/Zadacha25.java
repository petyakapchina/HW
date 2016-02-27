import java.util.Scanner;

public class Zadacha25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Insert a number: ");
		int n = sc.nextInt();
		int i=1;
		int product = 1;
		do {
			product*=i;
			i++;			
		}
		while (i<=n);
		System.out.println(product);
	}

}
