import java.util.Scanner;

public class Zadacha7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the array: ");
		int numOfEl = sc.nextInt();
		int [] array = new int [numOfEl];
		System.out.print("Enter the elements of the array: ");
		for(int index=0; index<numOfEl; index++) {
			array[index]=sc.nextInt();
		}
		int [] newArray = new int [array.length];
		int j= 1;
		for (int index = 0; index < 1; index++) {
			 newArray[index]=array[index+1];
			 }
		for (int index = 1; index < array.length-1; index++) {
			 newArray[index]=array[index-1]+array[index+1];
			 }
		for (int index = numOfEl-1; index == array.length-1; index++) {
			 newArray[index]=array[index-1];
			 }
		System.out.println("The new arry is: ");
		for (int index = 0; index < array.length; index++) {
			System.out.print( newArray[index]+" ");
		}
	}

}
