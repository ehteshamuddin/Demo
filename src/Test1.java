import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver driver;
	
	
	@Test (dataProvider = "getData")
	
	void callCountryCapital(String country)
	{
		driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/capitals-of-the-world.html");
		WebElement capital = driver.findElement(By.xpath("//*[text()='"+country+"']/following-sibling::td"));
		
		System.out.println(capital.getText());
		driver.quit();
	}

	@DataProvider

	Object[][] getData() {
		
		return new Object[][] {{"Afghanistan"},{"Albania"}};
	}

	
	

	
		
	

}
