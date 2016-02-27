import java.util.Scanner;

public class Zadacha12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input day: ");
		int day = sc.nextInt();
		System.out.print("Input month: ");
		int month = sc.nextInt();
		System.out.print("Input year: ");
		int year = sc.nextInt();
		boolean typeYear = true; //ne e visokosna
		if ((year % 4 == 0) || ((year % 100 != 0) && (year % 400 == 0))) {
			typeYear = false;
		}
		if ((day < 0) || (day > 31)) {
			System.out.println("Incorrect date!");
		}
		if ((month < 0) || (month > 12)) {
			System.out.println("Incorrect date!");
		}
		if ((typeYear) && (month==2) && (day>=29)) {
			System.out.println("Incorrect date!");
		}
		if ((day == 28) && (month == 2)) {
			if (typeYear) {
				day=1;
				month++;
			}
			else {
				day++;
			}
		}
		if ((day==29) && (month == 2) && (!typeYear)) {
			day=1;
			month++;
		}
		else {
		if (day==30) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day++;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day=1;
				month++;
				break;
			}
			}
		if (day==31) {
			day=1;
			if (month == 12) {
				month = 1;
				year++;
			}
			else {
				month++;
			}
		}
		else {
				day++;
			}
		}
		
			System.out.println("The next date is:");
			System.out.println(day + " " + month + " " +year);
		}
		
		
	}

	
		
		