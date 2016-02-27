
public class Zadacha16 {
	public static void main(String[] args) {
	float [] array = {-1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, - 7.5f, 8.6f, 9.1f, -4f};	
	for (int index=0; index<array.length; index++) {
		System.out.print(array[index]+" ");
	}
	System.out.println();
	for (int index=0; index<array.length; index++) {
		if (array[index]<-0.231){
			array[index]=(index+1)*(index+1)+41.25f;
		}
		else {
			array[index]=(index+1)*array[index];
		}
	}
	for (int index=0; index<array.length; index++) {
		System.out.print(array[index]+" ");
	}
	int count=0;
	int sum=0;
	for (int index=0; index<array.length; index++) {
		if (array[index]!=0){
			count++;
			sum+=array[index];
		}
	}
	int average = sum/count;
	System.out.println();
	System.out.println("The average sum is: "+average);
	}
}
