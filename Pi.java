/* Assignment 1 by Ryan Winter for COP3252*/
import java.util.Scanner;
public class Pi{
	public static void main(String args[]){
		 Scanner scanner = new Scanner(System.in);
		 System.out.printf("Compute to how many terms of the series? ");
		 int number = scanner.nextInt(); /* Get user input for how many terms to solve for */
		 System.out.printf("terms PI approximation\n");
		 float pi=4;
		 float denom=1;
		 boolean add=false;
		 
		 /* needs to add 2 to denom and flip sign every time..*/
		 for(int i=1; i<=number; i++){	/* Loop to run as many times as user requested */
			
			if(i==1){ /* default case */
				System.out.print(i + "	4.000000 \n");
			}
			else if(add==false){ /* handles subtraction */
				denom=denom+2;
				pi=pi-(4/denom);
				add = true;
				System.out.printf(i + "	" + pi + "\n");
			}	
			else if(add==true){ /* handles addition */
				denom=denom+2;
				pi=pi+(4/denom);
				add = false;
				System.out.printf(i + "	" + pi + "\n");
			}	
		}
	}
}
