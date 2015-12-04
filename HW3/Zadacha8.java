import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the length of the array: ");
	int numOfEl = sc.nextInt();
	int [] array = new int [numOfEl];
	int element=0;
	int count = 1;
	int i=0;
	System.out.print ("Enter the elements of the array: ");
	for (int index=0; index<numOfEl; index++) {
		array[index]=sc.nextInt();
	}
	for (int index=0; index<numOfEl-1; index++) {
		if (array[index]==array[index+1]){
			element=array[index];
			count++;
		}
		else {
			count=1;
		}
		
	}
	int [] longest = new int [count];
	for (int index=0; index<count; index++) {
		longest[index]=element;
			}
	System.out.println("The longest string of same elements is: ");
	for (int index=0; index<count; index++) {
		System.out.print(longest[index] + " ");
			}
		

}
}
