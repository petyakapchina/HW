
public class Zadacha1 {
	public static void main(String[] args) {
		int [] [] array2 = { {10, 25, 89, 63, 35},
				             {55, 23, 129, 87, 100},
				             {222, 48, 26, 81, 36},
				             {258, 69, 30, 73, 29},
				             {2, 59, 36, 111, 40},
				             {3, 58, 31, 85, 35}
		                   };
		int min=array2[0][0];
		int max=array2[0][0];
		for (int row=0; row<array2.length; row++) {
			for (int col=0; col<array2[0].length; col++) {
				if (array2[row][col]<min) {
					min=array2[row][col];
					}
				if (array2[row][col]>max) {
					max=array2[row][col];
				}
			}
		}
		System.out.println("The smallest elemnt is: "+min);
		System.out.println("The biggest element is: "+max);
	}

}
