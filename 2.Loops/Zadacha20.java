import java.util.Scanner;

public class Zadacha20 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the side of the square: ");
		//int side = sc.nextInt();
		//int i;
		for (int row=0; row<10;row++) {
			for (int colum=row+1 ; colum<(row+11); colum++) {
				if (colum>=10) {
					int k=colum;
					k=k%10;
					System.out.print(k);
					continue;
				}
				System.out.print(colum);
			} 
			System.out.println();
		}
				
	}		
			
	}


