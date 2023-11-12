package seleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowResize {

	WebDriver driver= new EdgeDriver();
	
	@Test
	
	void resizeWindow() throws IOException
	{
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.manage().window().getSize()); 
		driver.manage().window().setSize(new Dimension(500, 300));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		
		driver.manage().window().maximize();
		
		WebElement image= driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
		
		Actions action=new Actions(driver);
		
		action.contextClick(image).perform();
		
		File file= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\ehtes\\git\\SecondDemo\\Demo\\Screenshot"));
	}
	
}
