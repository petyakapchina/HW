import java.util.Scanner;

public class Zadacha2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the arry: ");
		int numOfEl = sc.nextInt();
		int [] array = new int [numOfEl];
		System.out.print("Enter the elements of the arry: ");
		for(int index=0; index<numOfEl; index++) {
			array[index]=sc.nextInt();
		}
		int [] newArray = new int [array.length];
		for (int index=0; index<array.length/2; index++) {
			newArray[index]=array[index];
		}
		int indexChange=array.length/2;
		for (int i = array.length-1;i>=array.length/2;i--) {
			newArray[indexChange]=array[i];
			indexChange++;
		}
		System.out.print("The new arry is: ");
		for(int index=0; index<numOfEl; index++) {
			System.out.print(newArray[index]+" ");
		}
		
	}

}
