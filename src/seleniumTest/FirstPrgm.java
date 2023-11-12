package seleniumTest;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPrgm {

	
	@Test
	void openURL() throws InterruptedException  {
		
		
	//	System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.msn.com/en-in");
		
		// Implicit Wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement s = driver.findElement(By.xpath("//*[contains(text(),'msn')]"));
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		
		wait.until(ExpectedConditions.visibilityOf(s));
		
		
		
		// Web for test
		//https://www.airbnb.co.in/
		//https://demoqa.com/links
		
		System.out.println(s);
		
		driver.get("https://stackoverflow.com/questions/50762548/setproperty-selenium-for-selenium");
		
		driver.findElement(By.xpath("//a[@href='/questions/tagged/selenium']"));
		
		driver.quit();
		}
		
	}


