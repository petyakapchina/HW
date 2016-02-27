import java.util.Scanner;

public class Zadacha6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the first arry: ");
		int numOfEl = sc.nextInt();
		System.out.print("Enter the length of the second arry: ");
		int numOfEl2 = sc.nextInt();
		int [] arry = new int [numOfEl];
		int [] arry2 = new int [numOfEl2];
		boolean isEquales = true;
		System.out.print("Enter the elements of the first arry: ");
		for(int index=0; index<numOfEl; index++) {
			arry[index]=sc.nextInt();
		}
		System.out.print("Enter the elements of the second arry: ");
		for(int index=0; index<numOfEl2; index++) {
			arry2[index]=sc.nextInt();
		}
		if (numOfEl==numOfEl2) {
			System.out.println("The arrys are with the same length!");
			for(int index=0; index<numOfEl; index++) {
				for (int index2=0; index2<numOfEl2; index2++) {
					if (arry[index]==arry2[index2]) {
						isEquales = true;
					}
					else {
						isEquales=false;
					}
				}
			}
			if (isEquales) {
				System.out.println("The arrys have the same elemets!");
			}
			else {
				System.out.println("The arrys have different elements!");
			}
		}
		if (numOfEl>numOfEl2) {
			System.out.println("The arrys have different length");
			for(int index=0; index<numOfEl2; index++) {
				for (int index2=0; index2<numOfEl2; index2++) {
					if (arry[index]==arry2[index2]) {
						isEquales = true;
					}
					else {
						isEquales=false;
					}
				}
			}
			if (isEquales) {
				System.out.println("The arrys have the same elemets till the " + numOfEl2 +
						" elemet!");
			}
			else {
				System.out.println("The arrys have different elements!");
			}
		}
		if (numOfEl<numOfEl2) {
			System.out.println("The arrys have different length");
			for(int index=0; index<numOfEl; index++) {
				for (int index2=0; index2<numOfEl; index2++) {
					if (arry[index]==arry2[index2]) {
						isEquales = true;
					}
					else {
						isEquales=false;
					}
				}
			}
			if (isEquales) {
				System.out.println("The arrys have the same elemets till the " + numOfEl +
						" elemet!");
			}
			else {
				System.out.println("The arrys have different elements!");
			}
		}
			
			
		
	}

}
