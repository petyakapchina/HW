import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {
		float a, b, c;
		Scanner sn = new Scanner(System.in);
		System.out.print("Input A:");
		a = sn.nextFloat();
		System.out.print("Input B:");
		b = sn.nextFloat();
		System.out.print("Input C:");
		c= sn.nextFloat();
		if (( a < c ) && (b > c )) {
			System.out.println("The inputed number " + c + " is between " + a + " and " + b);
		}
		if (( a > c ) && (b < c )) {
			System.out.println("The inputed number " + c + " is between " + a + " and " + b);
		}
		else {		
			System.out.println("The inputed number " + c + " is not between " + a + " and " + b);
		}

}
} 