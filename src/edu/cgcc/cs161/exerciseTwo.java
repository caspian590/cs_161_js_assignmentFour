package edu.cgcc.cs161;

/* PSEUDOCODE
 * Create integer numfun
 * Use for method to count from 1-10
 * Create a continue if numfun = 4 or 7
 * Program end
 */

public class exerciseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for (int numfun = 1; numfun <= 10; numfun++)
		{
		    if (numfun  == 4 || numfun == 7)
		    {
		        continue;
		    }
		    System.out.print (numfun + " ");
		}
	}

}
