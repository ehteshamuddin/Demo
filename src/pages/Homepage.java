package pages;

import java.io.IOException;
import java.lang.reflect.Method;

import org.asynchttpclient.util.HttpConstants.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import utilities.ClassUtiliti;

public class Homepage extends ClassUtiliti {
	
	@Test
	
	void claas() {
	ClassUtiliti b=new ClassUtiliti();
	
	Class c=b.getClass();
	Method[] methods=c.getDeclaredMethods();
	System.out.println(methods.length);
	
	}
	@BeforeMethod
	void setup() throws IOException
	{
		
		initialConfig();
		System.setProperty("webdriver.edge.driver", ReadProperty("EdgeDriverPath"));
		
		driver= new EdgeDriver();
		
		driver.get(ReadProperty("SeleniumEasy"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void testradiobutton()
	{
		
		System.out.println("Application Title"+driver.getTitle());
		
		ClickOnElement(driver.findElement(By.xpath(ReadProperty("InputForm"))));
		
		ClickOnElement(driver.findElement(By.xpath(ReadProperty("RadioButton"))));
		
		System.out.println("Application Title"+driver.getTitle());
	}
	
	@AfterTest
	public void closeSession()
	{
		driver.quit();
	}

}
