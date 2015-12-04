

public class Zadacha14 {
	public static void main(String[] args) {
		int count = 0;
		int index2=0;
		float [] array = {7.1f,8.5f,0.2f,3.7f,0.99f,1.4f,-3.5f,-110f,212f,341f,1.2f};
		for(int index=0; index<array.length; index++) {
			if ((array[index]>=-2.99) && (array[index]<=2.99)) {
				count++;
			}
		}
		float [] newArray = new float [count];
		for(int index=0; index<array.length; index++) {
			if ((array[index]>=-2.99) && (array[index]<=2.99)) {
				newArray[index2]=array[index];
				index2++;
					}
			}
		for(int index=0; index<count; index++) {
			System.out.print(newArray[index]+ " ");
		}
	}
}
