import java.util.Scanner;

public class Zadacha10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numOfEl = 7;
		int [] array = new int [numOfEl];
		int sum=0;
		int min = 100;
		int average = 0;
		boolean check = true;
		System.out.print("Enter the elements of the array: ");
		for(int index=0; index<numOfEl; index++) {
			array[index]=sc.nextInt();
		}
		for(int index=0; index<numOfEl; index++) {
			sum+=array[index];
		}
		average=sum/array.length;
		System.out.println("The average value is: "+average);
		for(int index=0; index<numOfEl; index++) {
			if (array[index]==average) {
				check=false;
				System.out.println("The closest value is: "+array[index]);
				break;
			}
			if (array[index]!=average) {
				int howClose=array[index]-average;
				    if (min>howClose) {
					  min=array[index];
					  check = true;
					  	}	} }
	
		 if (check) {
				  System.out.println("Closest value(s): "+ min);	
				  } 	
		else {
				  System.out.println();
			  }
	
		} 
		
}

