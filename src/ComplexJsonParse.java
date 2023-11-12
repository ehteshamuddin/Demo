import Files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	static int j=1;
	
	public static void main(String[] args) {
		
		// Created Object for Json Parsing, Stored JSON response body in it.
		JsonPath  js= new JsonPath(payload.CoursePrice());
		
		
		// Using size() function calculated total count of courses 
		// from the courses node of JSON response body
		int count = js.getInt("courses.size()");
		System.out.println("Total Available Courses are : " +count);
		
		
		// Fetched purchaseamount (Json Node) from the JSON response body
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("\nAll Courses amount is : "+totalAmount);
		
		
		//Fetched Title of the First Course from the JSON courses array object
		String titleFirstCourse = js.getString("courses[0].title");
		System.out.println("\nFirst Course in the List is : "+titleFirstCourse);
		
		
		// Fetched courses title and price of each using for loop
		System.out.println("\nAvailable Course in the List and Their respective Price are ");
		for(int i=0; i<count; i++)
		{
			String CourseName = js.get("courses["+i+"].title");
			// used j static varible as an incremental number
			System.out.println(j+++") "+CourseName);

			System.out.println("   Price ==>> "+js.getString("courses["+i+"].price").toString());
		}
		
		
		// Fetched RPA copies from JSON response
		System.out.println("\nSold RPA copies are : ");
			for(int i=0; i<count; i++)
			{
				String courseTitle = js.get("courses["+i+"].title");
				
				if (courseTitle.equals("RPA"))
				{
				System.out.println(js.get("courses["+i+"].copies").toString());
				break;
				}
			}
			
		// Verify purchaseamount should match with SUM of total amount
			int sum=0;
			
			for (int i=0; i<count;i++)
			{
				int c = js.getInt("courses["+i+"].copies"); 
				int d = js.getInt("courses["+i+"].price");
				
				sum = sum + (c*d);
			}
			
			System.out.println(sum);
		
	}
	
}
