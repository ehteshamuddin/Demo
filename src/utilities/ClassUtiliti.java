package utilities;

import org.openqa.selenium.WebElement;

import base.BaseClass;

public class ClassUtiliti extends BaseClass {

	public String ReadProperty(String key)
	{
		return pro.getProperty(key);
	}
	
	
	public void ClickOnElement(WebElement locators)
	{
		
		locators.click();
		
	}
}
