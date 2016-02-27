import java.util.Scanner;

public class Zadacha7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		int i = 3;
		int num = 0;
		while (num < n) {
			if (i % 3 == 0) {
				System.out.print( i + ", ");
				}
			i+=3;
			num++;
			
			}
	}

}
