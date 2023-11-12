package seleniumTest;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActionTest {
	
	WebDriver driver=new EdgeDriver();
	

	@BeforeTest
	void StartBrowser()
	{
//		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
		driver.get("http://www.facebook.com/");
	}
	
	@Test
	void PerformActions() throws IOException
	{
		WebElement emailField = driver.findElement(By.id("email"));
		
		Actions acts = new Actions(driver);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(emailField.getCssValue("background"));
		
		acts. moveToElement(emailField)
				.click()
				.keyDown(emailField, Keys.SHIFT)
				.sendKeys(emailField, "hello")
				.keyUp(emailField, Keys.SHIFT)
				.doubleClick(emailField)
				.contextClick()
				.perform();
		
	File emailFieldfile = emailField.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(emailFieldfile, new File("./Screenshot/ActionTest/emailField.jpg"));
		
		String time = (new Date()).toString().replace(":", "_").replace(" ", "_");
		
		System.out.println(Timestamp.class);

		
		File visiblePart = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File screenshot = new File("./Screenshot/ActionTest/VisiblePart.jpg");
		
		FileUtils.copyFile(visiblePart, screenshot);

		SoftAssert asrt= new SoftAssert();
		
		Reporter.log("<a href=\"C:\\Users\\ehtes\\git\\SecondDemo\\Demo\\Screenshot\\ActionTest\\VisiblePart.jpg\">screenshot");
		
		//act.perform();
		
		// above actions into different part
//		Action act= acts.moveToElement(path)
//				.build();
//		
//		Action act5=acts.click().build();
//		
//		Action act2 = acts.keyDown(path, Keys.SHIFT)
//				.sendKeys(path, "hello")
//				.keyUp(path, Keys.SHIFT)
//				.build();
//		
//		Action act3 = acts.doubleClick(path)
//				.build();
//		
//		Action act4 = acts.contextClick().build();
//		
//		act.perform();
//		act5.perform();
//		act2.perform();
//		act3.perform();
//		act4.perform();
		
		driver.quit();
	}	
	
}
