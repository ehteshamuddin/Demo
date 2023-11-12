package javaBasics;

public class WhyStringIsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "knowledge";
		 String s = str;     // assigns a new reference to the same string "knowledge"
		 
		 
		  str = str.concat(" base");
		  
		  System.out.println(str);
		  System.out.println(s);
		  
		  // Not Only String but all the Data Types are immutable
		  // We can use final keyword for
		  
		  int i=1;
		  int j=i;
		  
		  i=i+1;
		  
		  System.out.println(i);
		  System.out.println(j);
		  
		
	}

}
