package seleniumTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandled {
	
	
	WebDriver driver= new EdgeDriver();
	
	@BeforeClass
	
	void evokeDriver()
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
		
	}
	
	@BeforeMethod
	
	void OpenBrowser()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
	}
	
	@Test //(invocationCount = 2, timeOut = 10)
	
	void HandleWindow()
	{
		
		String MainWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		
		Set<String> Windows=driver.getWindowHandles();
		Iterator<String> i=Windows.iterator();
		
	//	driver.switchTo().window(MainWindow); //Switch to Default Window
		
		while(i.hasNext())
		{
			String window =i.next();
			
			
			if(!MainWindow.equals(window))
			{
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='emailid']")));
				
				
				driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
			
		}
		
		driver.switchTo().window(MainWindow);
		
	
		
		System.out.println(driver.getTitle());
		
	}

}
