import java.util.Scanner;

public class Zadacha19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if ((num<10) || (num>99)) {
			System.out.println("Please, enter a number between 10 and 99!");
		}
		else {
		while (num>=1){
		  if (num%2==0) {
				 num = num/2;
			     System.out.print(num + ",");
		  }
		  if (num%2==1) {
			    num = 3*num+1;
			    System.out.print(num + ",");
		  }
		   if (num == 1) {
		       	System.out.print(num);
		       	break;
		       	} 
		}
			}
	
	} }
