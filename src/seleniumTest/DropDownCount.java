package seleniumTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropDownCount {

	

	WebDriver driver= new EdgeDriver();
	
	
	@Test
	void FindDropDownvalue()
	{
		driver.get("https://www.amazon.com/");
		List<WebElement> dropDownValue = driver.findElements(By.xpath("//*[@id='searchDropdownBox']/option"));
		WebElement dropDown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		
		System.out.println(dropDownValue.size());
		
		Select select = new Select(dropDown);
		
		select.selectByVisibleText("Baby");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
	}
	
}
