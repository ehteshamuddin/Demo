package seleniumTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentXpathAxes {
	
	WebDriver driver = new EdgeDriver();
	
	@BeforeClass
	void Setdriver() {
		
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
				
	}
	

	@BeforeMethod
	void OpenBrowser() {
		
		driver.navigate().to("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
	}
	
	@Test
	
	void PrintSiblings()
	{
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Hind. Agrigeneti')]//parent::td//ancestor::tr//preceding-sibling::tr"));
		
		// using for each loop
//		for(WebElement a: list)
//		{
//			System.out.println(a.getText());
//		}
		
		
		// Using Iterator
		Iterator<WebElement> i = list.iterator();
		
		//String value="";
		
		while(i.hasNext())
		{
//			WebElement element = i.next();
//			value=element.getText();
			System.out.println("Element get text : "+i.next().getText());			
		}
		
		driver.quit();
	}
	
	
}
