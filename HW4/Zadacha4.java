import java.lang.reflect.Array;

public class Zadacha4 {
	public static void main(String[] args) {
		int [] [] array2 = { {10, 25, 89, 63, 35},
	                         {55, 23, 129, 87, 100},
	                         {222, 48, 26, 81, 36},
	                         {258, 69, 30, 73, 29},
	                         {2, 59, 36, 111, 40},
	                         {3, 58, 31, 85, 35}
                           };
		int cols=array2.length;
		int rows=array2[0].length;
		int [] [] rotate = new int [rows][cols];
		for (int row = 0; row <array2[0].length; row++) {
			for (int col =0; col<array2.length; col++) {
			   rotate[row][col]=array2[cols-col-1][row];
			  }
		}
		for (int row = 0; row <rotate.length; row++) {
			for (int col =0; col<rotate[0].length; col++) {
			    System.out.print(rotate[row][col]+" ");
			}
			System.out.println();
		}
	}

}
