import java.util.Scanner;

public class Zadacha17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input the lengh of the side: ");
		int side = sc.nextInt();
		System.out.print("Input a preferable sign: ");
		char sign = sc.next().charAt(0);
		for(int a=1;a<=side;a++) {
			for (int b=1; b<=side; b++) {
					if (a==1 || a==side || b==1 || b==side) {
						System.out.print("*");
					}
					else {
					System.out.print(sign);
					}
					}
				
			System.out.println();
		}
			
			
	}
			}
		
	
	
	

