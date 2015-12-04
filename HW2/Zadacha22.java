import java.util.Scanner;

public class Zadacha22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int k = num+1;
		if (num<0 || num >1000) {
			System.out.println("Please, enter a number between 1 and 999!");
		}
		else {
			int index=1;
			while (index<=10) {
				if ((k%2==0)||(k%3==0)||(k%5==0)) {
					System.out.print(index + ":" + k + " ");
					index++;
				}
				k++;
				}
		}
	}
	

}
