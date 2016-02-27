import java.util.Scanner;

public class Zadacha11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] array = new int [7];
		int count = 0;
		System.out.println("Enter the elements of the array: ");
		for(int index=0; index<array.length; index++) {
			array[index]=sc.nextInt();
		}
		for(int index=0; index<array.length; index++) {
			if ((array[index]%5==0)&&(array[index]>5)) {
				System.out.print(array[index]+ " ");
				count++;
			}
		}
		System.out.println(count  + " numbers");
	}

}
