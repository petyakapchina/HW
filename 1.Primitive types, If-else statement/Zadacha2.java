import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.print ("Въведи първото цяло число:");
		int x = sn.nextInt();
		System.out.print ("Въведи второто цяло число:");
		int y = sn.nextInt();
		System.out.println("Сбор:"+(x+y));
		System.out.println("Разлика:"+(x-y));
		System.out.println("Произведение:"+(x*y));
		System.out.println("Частно:"+(x/y));
		System.out.println("Остатък при деление:"+(x%y));
		
		Scanner sc= new Scanner(System.in);
		System.out.print ("Въведи първото десетично число:");
		double a = sc.nextDouble();
		System.out.print ("Въведи второто десетично число:");
		double b = sc.nextDouble();
		System.out.println("Сбор:"+(a+b));
		System.out.println("Разлика:"+(a-b));
		System.out.println("Произведение:"+(a*b));
		System.out.println("Частно:"+(a/b));
		System.out.println("Осатък при деление:"+(a%b));
		
	
		
	}

}
