import java.util.Scanner;

public class Zadacha13 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
    System.out.print("Input number: ");
    int sum = sc.nextInt();
    int num = 100;
    int a, b, c;
    if ((sum <2) && (sum > 27)) {
    	System.out.println("Please input a number between 2 and 27!");
    }
    else {
       	while (num<=999){
    	a = num /100;
    	b = (num - a*100)/10;
    	c = num % 10;
    	if  (sum == (a+b+c)) {
    	System.out.print(num +" ");
    	}
    	num++;
    }
    }
    }
}

    


