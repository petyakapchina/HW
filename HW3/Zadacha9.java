import java.util.Scanner;

public class Zadacha9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the array: ");
		int numOfEl = sc.nextInt();
		int [] array = new int [numOfEl];
		System.out.print("Enter the elements of the array: ");
		for(int index=0; index<numOfEl; index++) {
			array[index]=sc.nextInt();
		}
		int [] helpArray = new int [numOfEl];
		int k=array.length-1;
		int a=array[0];
		for (int index=0; index<array.length; index++) {
			helpArray[index]=array[k];
			k--;
			
		}
		for(int index=0; index<numOfEl; index++) {
			System.out.print(helpArray[index]+" ");
		}
	}

}
