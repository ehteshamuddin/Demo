package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;

	@BeforeClass
	public void testSetup()
	{
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
	driver=new EdgeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();

	}
	
	@Test
	void moveCursor()
	{
		driver=new EdgeDriver();
		//Element which needs to drag.    		
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
     
     //Element on which need to drop.		
     WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
     		
     //Using Action class for drag and drop.		
     Actions act=new Actions(driver);					

//Dragged and dropped.		
     act.dragAndDrop(From, To).build().perform();	
	}
	
	
}
