
public class Zadacha13 {
	static int[] combinedArray (int[]a, int[]b){
		int [] newArray = new int [a.length+b.length];
		for (int index=0; index<a.length; index++){
			newArray[index]=a[index];
		}
		int i=0;
		for (int index=a.length; index<newArray.length; index++){
			newArray[index]=b[i];
			i++;
		}
		return newArray;
	}
	public static void main(String[] args) {
		int [] array1 = {1, 0, 3, 5, 9};
		int [] array2 = {0, 15, 28, -987, 3};
		int [] newArray = combinedArray(array1, array2);
		for (int index=0; index<newArray.length; index++){
			System.out.print(newArray[index]+" ");
		}
	}
}
