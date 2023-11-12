package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Sanjay");  
		list.add("Ajay");  
		
		
		
		Iterator<String> i = list.iterator();
		
		while(i.hasNext())
		{
			 System.out.println(i.next());
			 //   i.remove();
		}

		list.add("Manju");
		
		for(String a : list)
		{
			System.out.println(a);
		}
		
		
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  

	}

}
}
