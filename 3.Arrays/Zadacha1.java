import java.util.Scanner;

public class Zadacha1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the array: ");
		int numOfEl = sc.nextInt();
		int [] array = new int [numOfEl];
		System.out.print("Enter the elements of the array: ");
		for(int index=0; index<numOfEl; index++) {
			array[index]=sc.nextInt();
		}
		int min = array[0];
		boolean isNum = true;
		for(int index=0; index<numOfEl; index++) {
			if (array[index]%3==0) {
				isNum=true;
				if (min>array[index]) {
				   min=array[index];
			 }
			}	
			if (array[index]%3==1) {
				isNum=false;
				continue;
			}
		}
					
		if (isNum){
		System.out.println("The smallest number is " + min);
		}
		else {
			System.out.println("There is no such a number!");
		}
	}
}
