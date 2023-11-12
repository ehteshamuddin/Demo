package javaBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String> m= new HashMap<String, String>();
		
		m.put("Name", "Shams");
		m.put("Address", "India");
		m.put("Course", "Selenium");
		
		Set<String> s= m.keySet();
		
		Iterator<String> i= s.iterator();
		
		while(i.hasNext())
		{
			String s1= i.next();
			System.out.println(s1+" "+m.get(s1));
		}
		
	}

}
