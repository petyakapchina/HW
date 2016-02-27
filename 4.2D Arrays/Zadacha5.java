
public class Zadacha5 {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int sumRow = 0;
		int sumCol = 0;
		int maxSumRow = 0;
		int maxSumCol = 0;
		for (int index1 = 0; index1 < array.length; index1++) {
			for (int index = 0; index < array.length; index++) {
				sumRow += array[index1][index];
			}
			if (sumRow > maxSumRow) {
				maxSumRow = sumRow;
				sumRow = 0;

			}
		}
		for (int index1 = 0; index1 < array[0].length; index1++) {
			for (int index = 0; index < array[0].length; index++) {
				sumCol += array[index][index1];
			}
			if (sumCol > maxSumCol) {
				maxSumCol = sumCol;
				sumCol = 0;

			}
		}
		
		System.out.println("The biggest sum among the rows: "+maxSumRow);
		System.out.println("The biggest sum among the colums: "+maxSumCol);
		if (maxSumRow>maxSumCol) {
			System.out.println("Max sum by rows is bigger than max sum by colums!");
		}
		else {
			System.out.println("Max sum by rows is bigger than max sum by colums!");
		}
	}

}


