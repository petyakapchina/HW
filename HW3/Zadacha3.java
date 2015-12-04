import java.util.Scanner;

public class Zadacha3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	int [] arry = new int [10];
	for (int i = 0; i<arry.length; i++) {
		switch (i) {
		case 0:
		case 1:
			arry[i] = number;
			break;
		case 2: 
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			arry[i]=arry[i-1]+arry[i-2];
			break;
		}
	}
	System.out.println("The arry is: ");
	for (int i = 0; i<arry.length; i++) {
		System.out.print(arry[i]+ " ");
	}
}
	}
