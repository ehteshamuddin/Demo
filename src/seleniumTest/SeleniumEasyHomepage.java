package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumEasyHomepage {
	
	WebDriver driver;
	
	@BeforeMethod
	void openBrovwser()
	{
		driver = new EdgeDriver();
		driver.get("https://demo.seleniumeasy.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void clickOnSimpleFormDemo()
	{
		String title = driver.getTitle();
		String MainWindow = driver.getWindowHandle();
		
		System.out.println("the Window title is "+title);
		driver.findElement(By.xpath("//div[@id='navbar-brand-centered']/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//div[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[1]")).click();
		String title1 = driver.getTitle();
		System.out.println("\nthe Window title is "+title1);
		
		if(!title.equals(title1))
		{
			System.out.println("\nsite is having good SEO content");
		}
		
		
	}
	
	@Test
	
	void actionsOnFormPage()
	{
		
		driver.findElement(By.id("user-message")).sendKeys("Have a Nice Day");
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		String displayed = driver.findElement(By.xpath("//div[@id='user-message']/span")).getText();
		
		System.out.println(displayed);
	}
	
}
