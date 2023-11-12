package javaBasics;

import java.util.Scanner;

public class FindFibbo {

	
	Scanner s= new Scanner(System.in);
	int i = s.nextInt();
	
	static int fib(int i)
	{
		
		if (i==0) {
			return 0; 
		}
		else if (i==1 || i==2)
		{
			return 1; 
		}
		else {
		return fib(i-1) + fib(i-2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number to find fib series");
		FindFibbo f= new FindFibbo();
		
		System.out.println(fib(f.i));
	}

}
