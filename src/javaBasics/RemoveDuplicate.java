package javaBasics;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String statement="abdba";
		String filtered="";
		
		String a[]=statement.split("");
		
		for(int i=0;i<statement.length();i++)
		{
			for(int j=i+1;j<i;i++)
			{
				if(a[i]!=(a[j]))
				{
					filtered=filtered.concat(a[i]);
				}
			}
		}
		
		System.out.println(filtered);
		
	}

}
