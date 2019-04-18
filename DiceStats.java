/* Assignment 1 by Ryan Winter for COP3252*/
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class DiceStats{
	public static void main(String args[]){
		 Scanner scanner = new Scanner(System.in);
		 System.out.printf("How many dice will constitute one roll? ");
		 int dice = scanner.nextInt(); /* Get user input for how many dice are used */
		 System.out.printf("How many rolls? ");
		 int rolls = scanner.nextInt(); /* Get user input for how many rolls are used */

		 int numrows=dice*6; /* there will be this many rows in table (used for loop) */
		 
		/* int[] myIntArray = new int[6*dice];   */
		 Random randomNumbers = new Random(); // random number generator
		 int frequency[] = new int[ 7 ]; // array of frequency counters
		
		 
		
		for(int j=0; j<rolls; j++){ /* loop that rolls the dice as many times as users request */
			 
			 ++frequency[ 1 + randomNumbers.nextInt( 6 ) ];  
			
		}
		
		
		
		 System.out.printf("Sum	# of times 	Percentage\n");
		 
		 for ( int face = 1; face < frequency.length; face++ ) // need to get it to run numrows number of times overall...
		 {
			 
			 float len = frequency.length;
			 float f = frequency[ face ];
			 float percent = (f/len)*100;
			 
			 System.out.print(face);
			 System.out.printf("	");
			 System.out.print(frequency[ face ]);
			 System.out.printf("		");
			 System.out.printf("%3.2f", percent);
			 System.out.print(" %\n");
		 }
			 //System.out.printf( "%4d%10d%2d\n", face, frequency[ face ], (frequency[ face ]/frequency.length));
		 
			 //System.out.print(face + frequency[ face ] + (frequency[ face ]/frequency.length) +"\n");
		 
		// for ( int face = 1; face < frequency.length; face++ )
		//	System.out.printf( "%4d%10d\n", face, frequency[ face ] );
		 
	/*	 for(int i=dice; i<=numrows; i++){	// Loop to run as many times as numrows declares */
	/*		System.out.printf(i + "	# of times 	Percentage \n"); // CHANGE/add variables to print statment */		
		
			
		//}
		
		
	}
}
