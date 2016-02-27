import java.util.Scanner;

public class Zadacha17 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int numOfEl = sc.nextInt();
		System.out.print("Enter the elements of the array: ");
		int [] array = new int [numOfEl];
		for (int index=0; index<array.length; index++){
			array[index]=sc.nextInt();
		}
		boolean check=true;
		for (int index=1; index<array.length-1; index++) {
			if (((array[index]<array[index+1])&&(array[index]<array[index-1]))||
			   ((array[index]>array[index+1])&&(array[index]>array[index-1]))) {
				check=true; 
				break;
				} 
			else {
				check=false;
				}
		}
		if (check) {
			System.out.print("The array fulfill the requirements!!!");
		}
		if (!check) {
			System.out.print("The array does not fulfill the requirements!");
		}
	}

}
