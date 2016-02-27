import java.util.Scanner;

public class Zadacha11 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Insert a numebr:");
	int num = sc.nextInt();
	for (int row = 0; row < num; row++) {
		for (int colum = 0; colum < num-row; colum++) {
			System.out.print(" ");
		}
			for(int star = 0; star <= row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

