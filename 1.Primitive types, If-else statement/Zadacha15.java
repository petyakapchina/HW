import java.util.Scanner;

public class Zadacha15 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Insert a numebr from 0 to 24: ");
	int time = sc.nextInt();
	if (((time >= 18) && (time <= 24)) || ((time >= 0) && (time <= 4))) {
		System.out.println("Good evening!");
	}
	if ((time > 4) && (time <= 9)) {
		System.out.println("Good morning!");
	}
	if ((time > 9) && (time < 18)) {
		System.out.println("Good afternoon!");
	}
	if ((time < 0) || (time > 24)) {
		System.out.println("Not applicabe!");
	}
}
}
