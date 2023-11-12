package javaBasics;

import org.testng.annotations.Test;

public class ExeptionExample {

	@Test
	void test() {
		
	
		 int i=0;
			try
			{
			int data=50/i; //may throw exception 
	      // if exception occurs, the remaining statement will not exceute
			System.out.println(data);
			}
	             // handling the exception 
			catch(ArithmeticException e)
			{
				System.out.println(e);
				
			}
		
			System.out.println("rest of the code");
	}


}