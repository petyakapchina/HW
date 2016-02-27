import java.util.Scanner;

public class Zadacha15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Insetr a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		do  {
			sum += num;
			num--;
			}
		while (num >= 1);
		System.out.println(sum);
	}

}
