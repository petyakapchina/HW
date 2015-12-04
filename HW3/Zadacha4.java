import java.util.Scanner;

public class Zadacha4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the arry: ");
		int numOfEl = sc.nextInt();
		int [] array = new int [numOfEl];
		boolean isMirrored = true;
		int downCount=numOfEl-1;
		int midd = numOfEl/2;
		System.out.print("Enter the elements of the arry: ");
		for(int index=0; index<numOfEl; index++) {
			array[index]=sc.nextInt();
		}
		for (int index=0; index<midd; index++){
			if (array[index]==array[downCount]) {
				isMirrored=true;
				downCount--;
				continue;
			}
			else {
				isMirrored=false;
			}
						
		}
		if (isMirrored) {
			System.out.println("Ogledalen e!");
		}
		else {
			System.out.println("Ne e ogledalen!");
		}
	}

}