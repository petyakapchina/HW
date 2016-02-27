
public class Zadacha23 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int product = a*b;
		while (a<10) {
			System.out.print("Multiplication with " + a + ": ");
			b=1;
			while (b<10) {
				if (a<=b) {
				System.out.print(a + "*" + b + "=" + a*b + " ");
				}
				b++;
				}
			a++;
			System.out.println();
			}
	}

} 
