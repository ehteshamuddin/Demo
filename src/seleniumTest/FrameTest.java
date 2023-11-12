package seleniumTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class FrameTest {
	
	WebDriver driver= new EdgeDriver();
	SoftAssert softAssert = new SoftAssert();
	
	
	
	@Test (dependsOnMethods = {"VerfifyTitle"})
	String enterToframe() {

		driver.get("https://www.guru99.com/all-about-testng-and-selenium.html");
		String title = driver.getTitle();
		System.out.println(title);
		return title;
		}
	
	@Test
	void VerfifyTitle() // throws ArithmeticException
	{
		
	softAssert.assertEquals(enterToframe(), "TestNG Tutorial: What is Annotations & Framework in Selenium");
	
	driver.quit();
	softAssert.assertAll();
		
//		throw new ArithmeticException();
//		System.out.println(1/0);
		
	
		
	}

}
