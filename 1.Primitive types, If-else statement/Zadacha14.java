import java.util.Scanner;

public class Zadacha14 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Input first combination:");
	int pos1 = sc.nextInt();
	int pos2 = sc.nextInt();
	System.out.print("Input second combination:");
	int pos3 = sc.nextInt();
	int pos4 = sc.nextInt();
	int sum1 = pos1 + pos2;
	int sum2 = pos3 + pos4;
	if ((((sum1 % 2) == 0) || ((sum2 % 2) ==1)) || (((sum1 % 2) == 1) || ((sum2 % 2) == 0)) ){
		
		System.out.println("Different colors!!!");
	}
	else {
		System.out.println("Matching colors!!!");
	}
	}
}

