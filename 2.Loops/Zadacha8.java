import java.util.Scanner;

public class Zadacha8 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Insert n: ");
	int n = sc.nextInt();
	int i = 1;
	int chislo = (n-1);
	while (i <= n) {
		int sum = chislo;
		int k = 1;
		while (k<n ){
		sum*=10;
		sum+=chislo;
		k++;
	}
		System.out.println(sum);
		i++;
		chislo+=2;
		
		
		
	}
	}
}

