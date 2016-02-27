import java.util.Scanner;

public class Zadacha5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input the second number: ");
		int num2 = sc.nextInt();
        if (num1<num2) {
	      while (num1 <= num2) {
	    	  System.out.print(num1 + " ");
	    	  num1++;
	    }
        }
	    else {
	    	while (num1 >= num2) {
		    	System.out.print(num2 + " ");
		    	num2++;
	    }
}
	}
}


