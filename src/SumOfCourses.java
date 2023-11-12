import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Files.payload;
import io.restassured.path.json.JsonPath;

public class SumOfCourses {

	@Test
	
	public void CoursesSum() {
		JsonPath js=new JsonPath(payload.CoursePrice());
		int count= js.getInt("courses.size()");
		
		int sum=0;
		
		for (int i=0; i<count;i++)
		{
			int c = js.getInt("courses["+i+"].copies"); 
			int d = js.getInt("courses["+i+"].price");
			
			sum = sum + (c*d);
		}
		
		System.out.println(sum);
		int total = js.getInt("dashboard.purchaseAmount");
		
		AssertJUnit.assertEquals(sum, total);
	}
	
	
}
