import java.util.Scanner;

public class Zadacha12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] array = new int [7];
		int change = 0;
		int differ = 0;
		int product = 1;
		System.out.println("Enter the elements of the array: ");
		for(int index=0; index<array.length; index++) {
			array[index]=sc.nextInt();
		}
		for(int index=0; index<array.length; index++) {
			switch (index) {
			case 0:
				change=array[0];
				break;
			case 1: 
				array[0]=array[1];
				array[1]=change;
			    break;
			case 2:
				differ = array[2]-array[3];
				break;
			case 3:
				array[3]=array[2];
				array[2]=array[2] - differ;
				break;
			case 4:
				product = array[4]*array[5];
				break;
			case 5:
				array[4]=array[5];
				array[5]=product/array[5];
				break;
			}
		}
		for(int index=0; index<array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

}
