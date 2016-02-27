import java.util.Scanner;

public class zadacha13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int [] array = new int [32];
		int count=0;
		for (int index=0; number>0; index++) {
			array[index]=number%2;
			number=number/2;
			count++;
		}
		for (int index=count-1; index>=0; index--) {
			System.out.print(array[index]+" ");
		}
		
	}

}
