package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwitchFrame {

	WebDriver driver;
	
	@Test
	
	void FrameSwitch()
	{
		driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml_iframe");
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']")));
		driver.findElement(By.xpath("//a[@aria-label='Menu']")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
	}
	
}
