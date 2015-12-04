
public class Zadacha12 {
	public static void main(String[] args) {
		int num = 100;
		int a, b, c;
		while (num <= 999) {
			a = num / 100;
			b= (num - a*100)/10;
			c = num % 10;
		
			if ((a!=b) && (b!=c) && (a!=c)) {
				System.out.println(num);
			}
		num++;
		
	
		
	}
	}
}
