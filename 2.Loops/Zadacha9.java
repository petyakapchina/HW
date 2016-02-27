import java.util.Scanner;

public class Zadacha9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Insert A: ");
		int a = sc.nextInt();
		System.out.print("Insert B: ");
		int b = sc.nextInt();
		int sum = 0;
		if (a < b) {
			int i = a;
		  while (i <= b) {
			int product = (i*i);
			if ((i % 3) == 0) {
				System.out.print("skip " + i + ", ");
				sum+=product;
				if (sum >= 200) {
					break;
				}
				
			}
			else {
				System.out.print(product + ", ");
				sum+=product;
				if (sum >= 200) {
					break;
				}
			}				
			i++;
			}
		}
	}
}


