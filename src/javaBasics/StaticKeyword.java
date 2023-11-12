package javaBasics;

public class StaticKeyword {
	
	int a=10, c=50;
	static int b=60;
	static int counter=0;
	
	public StaticKeyword() {
		// TODO Auto-generated constructor stub
		counter++;
	}
	

	void test()
	{
		a=100;
		b=200;
		c=300;
		System.out.println(a+" "+b+" "+c);
	}
	
//	@Test
	
	public static void main(String[] args ) {
	
		StaticKeyword t1= new StaticKeyword();
		StaticKeyword t2= new StaticKeyword();
		StaticKeyword t3= new StaticKeyword();
		StaticKeyword t4= new StaticKeyword();
		
	t1.a=20;
	t1.b=30;
	t1.c=40;
	
	// First
	System.out.println(t1.a+" "+t1.b+" "+t1.c);
	
	// Second
	System.out.println(t2.a+" "+t2.b+" "+t2.c);
	
	// Third
	t3.test();
	
	// Fourth
	System.out.println(t4.a+" "+t4.b+" "+t4.c);

	System.out.println("Total "+counter+" objects created for the class");
}
}