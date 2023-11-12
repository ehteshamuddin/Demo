package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class JustTest {

	@Test
	
	void test1()
	{
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.geeksforgeeks.org/hashmap-put-method-in-java/");
		
		driver.close();
		
	}
}
