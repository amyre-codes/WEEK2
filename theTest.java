package day9;

import java.util.Scanner;

public class theTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scam = new Scanner(System.in);
		
		String name = "";
		System.out.println("Enter your name ");
		name = scam.next();
	
		System.out.println("Hello " + name + " please answer the following questions ");
		
		System.out.println("What's your favorite sport?");
		scam.next();
		
		System.out.println("What's your favorite food?");
		scam.next();
		
		int color = 15;
		int red = 20;
		int pink = 4;
		
		System.out.println("Need a calculator " + name );
		
		System.out.println("enter a number");
		color = scam.nextInt();
		
		System.out.println("enter another number");
		red = scam.nextInt();
		
		
		
		System.out.println("This is the sum");
		 pink = red + color ;
		 System.out.println(pink);
		 
		 System.out.println("this is the difference");
		 pink = red - color;
		 System.out.println(pink);
		 
		 System.out.println("this is the product");
		 pink = color * red ;
		 System.out.println(pink);
		 
		 System.out.println("this is the quotient");
		 pink = red / color ;
		 System.out.println(pink);
		 
		 System.out.println("enter a number and watch what it can do ");
		 pink = scam.nextInt();
		 
		 for (int x = color ; color<=30; color++) {
				 System.out.println(color);
				 
		 }	 if ( red % 4 == 0) {
				System.out.println("Fizz");
		 
		 }
		
		
		
				
		
		
		
		

	}

}
