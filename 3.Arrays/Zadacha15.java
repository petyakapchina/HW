import java.util.Scanner;

public class Zadacha15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the array: ");
		int numOfEl = sc.nextInt();
		System.out.print("Enter the elemets of the array: ");
		float [] array =new float [numOfEl];
		float max=array[0];
		float max1=array[0];
		float max2=array[0];
		for (int index=0; index<array.length; index++) {
			array[index]=sc.nextFloat();
		}
		for (int index=0; index<array.length; index++) {
			if (array[index]<0) {
			array[index]*=-1;
		}
			if (array[index]>max) {
				max=array[index];
			}
		}
		for (int index=0; index<array.length; index++) {
			if (array[index]==max) {
			array[index]=0;
			}
		}
		for (int index=0; index<array.length; index++) {
			if (array[index]<0) {
			array[index]*=-1;
		}
			if (array[index]>max1) {
				max1=array[index];
			}
		}
			for (int index=0; index<array.length; index++) {
			if (array[index]==max1) {
				array[index]=0;
				}
			}
		for (int index=0; index<array.length; index++) {
			if (array[index]<0) {
			array[index]*=-1;
		}
			if (array[index]>max2) {
				max2=array[index];
			}
		}
		
		System.out.println(max2 + " " + max1 + " " + max);
	}

}
