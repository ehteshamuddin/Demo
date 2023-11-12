package javaBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateCount {

	List<String> cs= new ArrayList<String>();
	
	
	void CountOfDuplicate() {
		
	System.out.println("Enter statement value");
	Scanner input=new Scanner(System.in);
	String value=input.next();
	System.out.println("Entered integer value is "+value);

	char a[]=value.toCharArray();
	
	for(int i=0;i<value.length();i++)
	{
		if(duplicateChar(a[i]))
			continue;
			
		int count=1;
		for(int j=i+1;j<value.length();j++)
		{
			if (a[i]==a[j]&&a[i]!=' ')
			{
				count++;
			}
			
		}

		System.out.println("count of "+a[i]+" is : "+count);

	}
	
	
	input.close();
}
	
	boolean duplicateChar(char c) {
		
		if(cs.contains(Character.toString(c)))
		return true;
		else
		cs.add(Character.toString(c));
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateCount a=new DuplicateCount();
		a.CountOfDuplicate();

	}
		

}
