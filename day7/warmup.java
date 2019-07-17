package day7;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner egg = new Scanner(System.in);
		
		int dry = 10;
		int make = 15;
		int color = 5;
		String apple = "";
		
		
		
		System.out.println("Hello Welcome To Amyre's Calculator");
		
		
System.out.println("enter your name");
		apple = egg.next();
		System.out.println("enter a number");
		   dry = egg.nextInt();
		     System.out.println("enter another number ");
		     color = egg.nextInt();
		   
		     System.out.println("the sum is");
		     make = color + dry;
		       System.out.println(make);
		     
		   System.out.println("the difference is");
		     make = dry - color;
		     System.out.println(make);
             
		     System.out.println("the product is");
		     make = dry * color;
		     System.out.println(make);
		     
		     System.out.println("the quotient is");
		     make = dry / color;
		     System.out.println(make);
		    		 
		     System.out.println("Thank You For Your Participation " + apple );
            
		     
       egg.close();
       
       
       
       
		     
		     
		     
	}

}
