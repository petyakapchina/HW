
public class Zadacha6 {
	public static void main(String[] args) {
		int[][] array = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sum = 0;
		int sum2 = 0;
		for (int index = 1; index < array.length; index += 2) {
			for (int index1 = 0; index1 < array[0].length; index1++) {
				sum2 += array[index][index1];
				System.out.print(array[index][index1] + " ");
			}
			sum += sum2;
			System.out.print("sum: " + sum2);
			System.out.println();
			sum2 = 0;
		}
		System.out.println("Total sum is : " + sum);

	}
}
