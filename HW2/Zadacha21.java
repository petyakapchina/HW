import java.util.Scanner;

public class Zadacha21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 52: ");
		int num = sc.nextInt();
		for(int card = num; card <= 52; card++) {
		int cardNumber = (card-1)/4+1;
		int cardColor = card%4;
		switch(cardNumber){
		case 1: System.out.print("2 "); break;
		case 2: System.out.print("3 "); break;
		case 3: System.out.print("4 ");break;
		case 4: System.out.print("5 "); break;
		case 5: System.out.print("6 "); break;
		case 6: System.out.print("7 "); break;
		case 7: System.out.print("8 "); break;
		case 8: System.out.print("9 "); break;
		case 9: System.out.print("10 "); break;
		case 10: System.out.print("Vale "); break;
		case 11: System.out.print("Dama "); break;
		case 12: System.out.print("Pop "); break;
		case 13: System.out.print("Aso "); break;
		}
		switch(cardColor) {
		case 1: System.out.print("spatiya"); break;
		case 2: System.out.print("karo"); break;
		case 3: System.out.print("kupa"); break;
		case 0: System.out.print("pika"); break;
		}
		if(card < 52){
		System.out.print(", ");
		}
		}
		}

}
