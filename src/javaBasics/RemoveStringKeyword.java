package javaBasics;

public class RemoveStringKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println((10==10) || (123==124));
		
		String content = "Rest API Testing Automation";
		String content2 = "Rest API Testing Automation";
		String content3 = "Rest API TestingAutomationTesting";
		
		// method 1
		String regex = "\\s*\\bTesting\\b\\s*";
		content = content.replaceAll(regex, " ");
		
		System.out.println(content);
		
		// method 2
		String func = content2.replace("Testing ", "");
		
		System.out.println(func);
		
		// method 3
		String[] a=content3.split("Testing");
		
		for(String b : a)
//		{
//			if(!b.equals("Testing"))
			
			System.out.print(b);
			
//		}
//		System.out.println();
		

	}

}
