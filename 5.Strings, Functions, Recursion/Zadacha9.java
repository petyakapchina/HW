
import java.util.Scanner;

public class Zadacha9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string with figures, letter and the element '-': ");
		String  a = sc.next();
		int sum=0;
		int lengthOfNumber=0;
		 for (int i=0; i<a.length();i+=lengthOfNumber){
			for (int index=i; index<a.length();index++){
			String help="";
			char letter = a.charAt(index);
			if (letter>64){
				lengthOfNumber=1;
				break;
			}
			if (letter>='1'&&letter<='9'){
				lengthOfNumber=1; 
				help+=letter;
				for (int j=index+1; j<a.length();j++){
				char nextLetter=a.charAt(j);
				if (nextLetter>='0'&&nextLetter<='9') {
					help+=nextLetter;
					lengthOfNumber++;
				}
				else{
					break;
				}
				}
				 int chislo = Integer.parseInt(help);
				 sum+=chislo;
				 System.out.println(chislo);
				 break;
			}
			if (letter=='-'){
				lengthOfNumber=1;
				for (int j=index+1; j<a.length();j++){
					char nextLetter=a.charAt(j);
					if (nextLetter>='0'&&nextLetter<='9') {
						help+=nextLetter;
						lengthOfNumber++;
					}
					else{
						break;
					}
					}
					 int chislo = Integer.parseInt(help);
					 sum-=chislo;
					 System.out.println("-"+chislo);
					 break;
				
			}
			}
			
		 }
		System.out.println("The sum is: "+sum);
		sc.close();
	}
}
