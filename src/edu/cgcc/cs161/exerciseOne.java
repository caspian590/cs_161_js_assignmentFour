package edu.cgcc.cs161;

/* PSEUDOCODE
* Create integer i
* Use For method to print 1-10
* Create integer f
* Use While method to print 1-10
* Create integer num
* Use Do...While method to print 1-10
* Program end
*/

public class exerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("For:");
		   for(int i = 1; i <= 10; i++)
	        {
	            System.out.print(i+" ");
	    
	    }
		    int f=1;
	    System.out.println();
	   	System.out.println();
				
	   	System.out.println("While:");
 
			
			while(f<=10)	
		{
			System.out.print(f+" ");
		    	f++;
			 
		   
    	}
		   
		
		 System.out.println();  
		 System.out.println(); 
		 System.out.println("Do...While");  
		   int num = 0;
		   do
		   {       
		       num=num+1;
		       System.out.print(num+" ");
		   }
		   while (num<10);
		   System.out.println();
	    }

	}


