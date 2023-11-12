package javaBasics;

public class GetTheFactorial {
	
	
	static int factorial (int n)
	{
		
//		using recursion
//		if (n==0 || n==1)
//			return 1;
		
//		return n * factorial(n-1);
		
// using for loop		
		
		int res=1;

// Using Positive Operator		
//		for (int i = 2; i <= n; i++)

// Using Negative Operator
        for (int i=n; i>1;  i--)
		
        res *= i;
        return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// GetTheFactorial a=new GetTheFactorial();
		System.out.println(factorial(10));

	}

}
