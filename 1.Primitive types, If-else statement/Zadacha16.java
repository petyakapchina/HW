import java.util.Scanner;

public class Zadacha16 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Input number from 100 to 999: ");
	int num = sc.nextInt();
	if ((num < 100) || (num > 999)) {
	 System.out.println("Invalid number!");
	}
	
	int a = (num / 100);
	int b = ((num - a*100)/10);
	int c = (num % 10);
	
	if ((a==b) && (b==c)) {
		System.out.println(num);
		System.out.println("Equals figures!");
	}
	  if ((a>b) && (b>c)) {
		System.out.println(num);
		System.out.println("Figures are descending!");
	  }
		if ((a<b) && (b<c)) {
		System.out.println(num);
		System.out.println("Figures are ascending!");
		}
		
	if (((a>b)&&(b<c)) || ((a<b)&&(b>c))) {
		System.out.println("Non available!");
	}
	if (((a==b)&&(b!=c)) || ((a==c)&&(c!=b)) || ((b==c)&&(c!=a))) {
		System.out.println("Non available!");
	}
	
	}
} 

	
 

