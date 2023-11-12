package javaBasics;

import java.util.Scanner;

public class SwapValue {

		
	Scanner s=new Scanner(System.in);
	 	 
	int a=s.nextInt();
	int b = s.nextInt();
	
	void Swap(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		a = a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("after swap values of a and b are "+a+" and "+b);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("enter value of a and b");
		
		SwapValue i=new SwapValue();
	    
	    i.Swap(i.a, i.b);
		
	}

}
