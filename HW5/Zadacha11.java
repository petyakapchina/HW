import java.util.Scanner;

public class Zadacha11 {
	static void printArray(int [] array){
		for(int index=0; index<array.length; index++){
			System.out.print(array[index]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the array: ");
		int length = sc.nextInt();
		int [] array = new int [length];
		System.out.print("Enter the element of the array: ");
		for(int index=0; index<array.length; index++){
			array[index]=sc.nextInt();
		}
		printArray(array);
		sc.close();
		
	}

}
