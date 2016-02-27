import java.util.Scanner;

public class Zadacha4 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter two name: ");
	String text = sc.nextLine();
	String [] names = text.split(",");
	String firstName = names[0];
	String secondName = names[1];
	int countFirst=0;
	int countSecond=0;
	for (int index=0; index<firstName.length(); index++) {
		char letter = firstName.charAt(index);
		countFirst += (int) letter;
	}
	for (int index=0; index<secondName.length(); index++){
		char letter = secondName.charAt(index);
		countSecond+= (int) letter;
	}
	if (countFirst>countSecond){
		System.out.println(firstName);
	}
	else{
		System.out.println(secondName);
	}
}
}
