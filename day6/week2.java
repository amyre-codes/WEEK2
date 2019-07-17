package day6;

import java.util.Scanner;

public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner man = new Scanner(System.in);
		   
		   int blue = 14;
		   int money = 200;
		   int bill = 50;
		   
		   double apple = 2.5;
		   double cake = 1.5;
		   double like = 1.7; 
		   
		   System.out.println("Welcome To Amyre's Calculator!");
		   System.out.println("enter a number");
		   blue = man.nextInt();
		   
		   System.out.println("enter a number");
		   money = man.nextInt();
		  
		  bill = blue + money; 
		  
		  System.out.println(bill);
		  
		   System.out.println("this is the difference");
           money = blue - bill;
           
		  System.out.println(money);
		  
		  System.out.println("this is the product");
		   blue = money * bill;
		   System.out.println(blue);
		   
		   
		   System.out.println("this is the quotient");
		   bill = money / blue; 
		   System.out.println(bill);
		   
		   System.out.println("Welcome to a different calculator");
		   System.out.println("enter a number");
		  apple = man.nextDouble();
		  
		  System.out.println("enter a number");
		  like = man.nextDouble();
		  
		  System.out.println("this is the sum");
		    cake = like + apple;
		    System.out.println(cake);
		     
		    System.out.println("this is the difference");
		    apple = cake - like;
		    System.out.println(apple);
		    
		    System.out.println("this is the product");
		    like = apple * cake;
		    System.out.println(like);
		    
		    System.out.println("this is the quotient");
		    cake = apple + like;
		    System.out.println(cake);
		    
		    man.close();
		    
		    
		    
		    
		    
		    
		    
		  
		  
		  
		   
		   
		   
		  
		  
		  
		  
				   
	}

}
