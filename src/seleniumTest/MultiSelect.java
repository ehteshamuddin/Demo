package seleniumTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import utilities.ClassUtiliti;

public class MultiSelect extends BaseClass {

	ClassUtiliti cu;
	
	@BeforeClass
	void OpenBrowser() throws IOException
	{
		initialConfig();
//		System.setProperty("webdriver.egde.driver", ReadProperty("EdgeDriverPath") );
		driver = new EdgeDriver();
		driver.get(cu.ReadProperty("WebAppURL"));
		driver.manage().window().maximize();
//		report = new ExtentReports(System.getProperty("user.dir")+"//src//config//ExtentReportResults.html");
//		test =  report.createTest("ExtentDemo");
	}

	@Test
	void ValidateMultiSelect()
	{
		fruits=new Select(driver.findElement(By.id("fruits")));
		System.out.println("Multiple Selection is "+fruits.isMultiple());
		
//		if (fruits.isMultiple())
//		{
//			test.log(LogStatus, null)
//		}
	}
	
	@Test
	void SelectValues()
	{
		fruits=new Select(driver.findElement(By.id("fruits")));
		fruits.selectByIndex(0);
		fruits.selectByIndex(1);
		fruits.selectByVisibleText("Grape");
		fruits.selectByValue("orange");
		
	}
	
	@Test
	void DeSelectValues()
	{
		fruits=new Select(driver.findElement(By.id("fruits")));
		fruits.deselectByIndex(0);
		fruits.deselectByIndex(1);
		fruits.deselectByVisibleText("Grape");
		fruits.deselectByValue("orange");
		
	}
	
	@AfterClass
	void closeBrowser()
	{
		driver.quit();
//		report.removeTest(test);
//		report.flush();
	}
}
