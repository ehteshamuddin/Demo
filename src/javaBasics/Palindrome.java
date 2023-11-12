package javaBasics;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String statement = "addaa";
		String SecStatement="Java is not Easy";
		
		String reverse="";
		
		String a[]=statement.split("");
		String b[]=SecStatement.split("not");
		
		for(int i=statement.length()-1; i>=0;i--)
		
		{
			reverse = reverse.concat(a[i]);
		}
			
		System.out.println(reverse);
		
		if(statement.equals(reverse))
		{
			System.out.println("Wow! we found that string is Palindrome");
		}
		else {
			System.out.println("Alas, How good it is, if Given String would be Palindrome");
		}
		
		for (String s : b)
		{
//			if (!s.equals("not"))
//			{
				System.out.print(s);
//			}
		//	System.out.println();
		}
		
	}

}
