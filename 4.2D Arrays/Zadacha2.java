import java.util.Scanner;

public class Zadacha2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of the array: ");
		int side=sc.nextInt();
		int [][] array2 = new int [side][side];
		for (int row = 0; row <array2.length; row++) {
			System.out.println("Enter the elements of the "+ row + " row(s)");
			for (int col =0; col<array2[0].length; col++) {
			    array2[row][col]=sc.nextInt();
			}
		}
		for (int row = 0; row <array2.length; row++) {
			for (int col =0; col<array2[0].length; col++) {
				System.out.print(array2[row][col] + " ");
			}
			System.out.println();
			}
		System.out.println("First diagonal:");
		for (int row = 0; row <array2.length; row++) {
			for (int col =0; col<array2[0].length; col++) {
				if (row==col) {
					System.out.print(array2[row][col]+" ");
			}
		}
		}
		System.out.println();
		System.out.println("Second diagonal:");
		for (int row = 0; row <array2.length; row++) {
			for (int col =0; col<array2[0].length; col++) {
				if (row+col==(side-1)) {
					System.out.print(array2[row][col]+" ");
			}
		}
		}
	}

}
