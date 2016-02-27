import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {
		int change1, change2, change3;
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Въведи а1:");
        int a1= sn.nextInt();
        System.out.print("Въведи а2:");
        int a2 = sn.nextInt();
        System.out.print("Въведи а3:");
        int a3 = sn.nextInt();
        
        System.out.println("Числата преди размяната:" + a1 + " " + a2 + " " + a3);
        change1=a1;
        change2=a2;
        change3=a3;
        a2=change1;
        a3=change2;
        a1=change3;
        
        System.out.println("Числата след размяната:" + a1 + " " + a2 + " " + a3);
        
        
	}

}
