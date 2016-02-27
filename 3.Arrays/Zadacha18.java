import java.util.Scanner;

public class Zadacha18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the first array: ");
		int numOfEl = sc.nextInt();
		System.out.print("Enter the length of the second array: ");
		int numOfEl1 = sc.nextInt();
		int [] array = new int [numOfEl];
		int [] array1 = new int [numOfEl1];
		int numOfEl2;
		if (numOfEl > numOfEl1) {
			numOfEl2=numOfEl;
		}
		else {
			numOfEl2=numOfEl;
		}
		int [] newArray = new int [numOfEl2];
		System.out.print("Enter the lements of the first array: ");
		for (int index=0; index<array.length; index++) {
			array[index] = sc.nextInt();
		}
		System.out.print("Enter the elemets of the second array: ");
		for (int index=0; index<array1.length; index++) {
			array1[index] = sc.nextInt();
		}
		if (numOfEl > numOfEl1) {
			for (int index = 0; index<numOfEl1; index++) { 
				    if (array[index]>array1[index]) {
						newArray[index]=array[index];
					}
				
				     else {
						newArray[index]=array1[index];
					}
				}
			}
			
		else {
			for (int index = 0; index<numOfEl; index++) {
				   if (array[index]>array1[index]) {
						newArray[index]=array[index];
					}
				
				  else {
						newArray[index]=array1[index];
					}
				}
			}
		
	
for (int index=0; index<newArray.length; index++) {
	System.out.print(newArray[index] + " ");
}
}
}
