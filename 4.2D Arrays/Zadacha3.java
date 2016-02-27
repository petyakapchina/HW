import java.util.Scanner;

public class Zadacha3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the rows of the array: ");
		int numRows=sc.nextInt();
		System.out.println("Enter the colums of the array: ");
		int numCols=sc.nextInt();
		int sum =0;
		int average = 0;
		int [][] array2 = new int [numRows][numCols];
		for (int row = 0; row <array2.length; row++) {
			System.out.println("Enter the elements of the "+ row + " row(s)");
			for (int col =0; col<array2[0].length; col++) {
			    array2[row][col]=sc.nextInt();
			}
		}
		for (int row = 0; row <array2.length; row++) {
			for (int col =0; col<array2[0].length; col++) {
			    sum+=array2[row][col];
			}
		}
		average=(sum/(numRows*numCols));
		System.out.println("The sum of the elements: " +sum);
		System.out.println("The average value is: " +average);
}
}
