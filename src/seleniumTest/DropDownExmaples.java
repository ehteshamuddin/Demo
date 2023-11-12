package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownExmaples {

	WebDriver driver=new EdgeDriver();
	

	@BeforeClass
	void startBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		}
	
	@Test
	void DropdownSelectByText()
	{

		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("ANGOLA");
		
	}
	
	@Test
	void DropdownSelectByValue()
	{		
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByValue("ARUBA");
		
	}
	
	@Test
	void DropdownSelectByIndex()
	{
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByIndex(2);	
	}
	
	@Test
	void DropdownIsMultiselect()
	{
		Select s=new Select(driver.findElement(By.name("country")));
		System.out.println(s.isMultiple());
	}
	
	@AfterClass
	void closeSession()
	{
		driver.quit();
	}
	
}
