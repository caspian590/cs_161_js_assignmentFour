
package edu.cgcc.cs161;

/* PSEUDOCODE
 * Create limit of 10 with integer naturaln
 * Create sum int of 0
 * Create int i and set equal to 1
 * Create loop
 * Create what to print out
 * Program end
 */

public class exerciseThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int naturaln = 10, sum = 0;

	        for(int i = 1; i <= naturaln; ++i)
	        {
	            // sum = sum + i;
	            sum += i;
	        }

	        System.out.println("Sum = " + sum);
	    }

	}


