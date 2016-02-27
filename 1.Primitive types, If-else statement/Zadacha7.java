import java.util.Scanner;

public class Zadacha7 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Input time:");
	int time = sc.nextInt();
	System.out.print("Input money amount:");
	float money = sc.nextFloat();
	System.out.print("Input health status ('true' for healthy/ 'false' for sick):");
	boolean status = sc.nextBoolean();
	if ((time < 0) && (time > 25)) {
		System.out.println("Incorrect time!!!!!");
	}
	if (status == true) {
		System.out.println("I will go to cinema!");
		}
	
	else {
		System.out.println("I will not go out :( ");
	}
	if (money <= 0) {
		System.out.println("I will stay at home, drinking tea.");
	}
	if ((money > 0) && (money < 10)) {
		System.out.println("I will go to a cafe.");
    }
	if (money >= 10) {
		System.out.println("I will buy some medecins!");
	}
}
}