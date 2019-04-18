/* Assignment 1 by Ryan Winter for COP3252*/
import java.util.Scanner;
public class Reverse{
	  public static void reverseDigits(long number) {
       if (number<10) { /* Prints only one digit at a time, so if number is less than 10 print it, if not call function again */
	   System.out.printf(number + "\n"); /* Print out the reversed number */
	   return; /* Return to main */
       }
       else {
           System.out.print(number%10);
           reverseDigits(number/10); /* Calling itself(recursion) */
       }
      }
	public static void main(String args[]){
		 Scanner scanner = new Scanner(System.in);
		 long input=0;	
		 do {
		 System.out.printf("Please enter a long integer (0 to quit): ");
		 input = scanner.nextLong(); /* Get user input */
		 if(input==0){ /* If user selected quit, print bye message and terminate */
			 System.out.printf("Goodbye!");
			 break;
		 } 
		 System.out.printf("The number reversed is: ");
		 reverseDigits(input);	
		 }
		 while(input>0); 
	}
}