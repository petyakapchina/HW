import java.util.Scanner;

public class Zadacha12 {
	static int[] returnArray (int num) {
		int [] array = new int [num];
		int element = 1;
		for (int index=0; index<array.length; index++){
			array[index]=element;
			element++;
		}
		return array;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		if (number<=0){
			System.out.println("Please, enter a positive number!");
		}
		else{
		int [] array = returnArray(number);
		for (int index=0; index<number; index++){
			System.out.print(array[index]+" ");
		}
		}
		sc.close();
	}

}
