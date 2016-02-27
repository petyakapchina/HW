import java.util.Scanner;

public class Zadcha14 {
	static int faktorial (int num){
		if(num<0){
			return 0;
		}
		int result=1;
		for (int index=1; index<=num; index++){
			result *= index;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		System.out.println(faktorial(number));
		sc.close();
	}

}
