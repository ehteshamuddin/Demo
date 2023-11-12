package seleniumTest;

	import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;

import java.time.Duration;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class CheckonAnnotation2 {

	WebDriver driver;

	@BeforeClass
	public void testSetup()
	{
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
	driver=new EdgeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();

	}

	@BeforeMethod
	public void openBrowser()
	{
	driver.get("https://www.browserstack.com/");
	driver.findElement(By.id("signupModalButton")).click();
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	}

	@Test(description="This method validates the sign up functionality")
	public void signUp()
	{
	driver.findElement(By.id("user_full_name")).sendKeys("ehtesham");
	driver.findElement(By.id("user_email_login")).sendKeys("ehtesham.izmo@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("qwerty");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
	wait.until(ExpectedConditions.elementToBeClickable(By.id("tnc_checkbox"))).click();
	driver.findElement(By.id("user_submit")).click();

	}

	@AfterMethod
	public void postSignUp()
	{
	System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}

	}

