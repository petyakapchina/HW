import java.util.Scanner;

public class Zadacha10 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Insert amount of water from 10 to 9999 liters: ");
	int amount = sc.nextInt();
	int times = (amount/5);
	if ((times % 2) == 0) {
		System.out.println(times + " 2 liters");
		System.out.println(times + " 3 liters");
	}
	else {
	int ostatuk = (amount % times);
	  if ((ostatuk % 2 == 0) || (ostatuk % 3 == 0)) {
	    int a = (ostatuk % 2);
	    int b = (ostatuk & 3);
	    System.out.println(times + " 2 liters");
	    System.out.println(times + " 3 liters");
	    if (a!=0) {
		System.out.println("Aditional " +  a + " times 2 liters");
	    }
		if (b!=0){
		System.out.println("Aditional " +  b + " times 3 liters");
	}
	  }
	  else {
			System.out.println("Cannot use a bucket half full!");
		}
	}
}
}

