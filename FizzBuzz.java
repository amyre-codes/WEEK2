package day8;

public class  FizzBuzz { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x = 1; x<=100; x++) {
			
		 System.out.println(x);
		
	  if (x%3 == 0 && x%5 == 0) {
		System.out.println("FizzBuzz");	

	  }	else if ( x % 3 == 0) {
		System.out.println("Fizz");
    }
	
	else if (x % 5 == 0) {
	System.out.println("Buzz");	
	}
	
	
	
	
	
		
		}
		
	
		
	}


}


