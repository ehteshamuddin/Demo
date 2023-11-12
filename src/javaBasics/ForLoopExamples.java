package javaBasics;
import java.util.Scanner;

public class ForLoopExamples {
	
	
	
	
	
//	void pyramid ()
//	{
//		for(int i=1; i<=5; i++)
//		{
//			for (int j=1; j<=i; j++)
//			{
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println();
//		}
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter integer value");
		Scanner input=new Scanner(System.in);
		Integer k=input.nextInt();
		System.out.println("Entered integer value is "+k);
		
		
// To Print ODD or EVEN numbers and Their SUM		
		int j=0, sum=0;
		
		for(int i=0; i<k;i++)
		{
			j=i+2;
			System.out.println(j);
			i++;
			sum=sum+j;
		}
		
		System.out.println("Total is "+sum);
		
		
// To Print Pyramid
//		for(int i=1; i<=5; i++)
//			{
//				for (int j=1; j<=i; j++)
//				{
//					System.out.print(k+" ");
//					k++;
//				}
//				System.out.println();
//			}
		input.close();
//		ForLoopExamples a=new ForLoopExamples();
//		a.pyramid();
		
}
}