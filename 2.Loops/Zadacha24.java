import java.util.Scanner;
class Zadacha24{ 
     public static void main(String args[]){ 
       System.out.print("Enter Number: ");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int n = num;
       int rev=0;
       int ostatuk; 
       if (num <=10 || num >= 30000) {
    	System.out.println("Please, enter a number between 10 and 30000!");   
       }
       else {
       while((num >= 10) && (num <= 30000)) { 
         ostatuk = num % 10; 
         rev = rev * 10 + ostatuk; 
         num = num / 10; 
       } 
       if(rev == n) 
         System.out.println(n+" is a Palindrome Number!"); 
       else
         System.out.println(n+" is not a Palindrome Number!"); 
     } 
}
}
