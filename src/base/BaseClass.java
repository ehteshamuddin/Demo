package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseClass {
	
	public WebDriver driver;

	FileInputStream fis;
	protected Properties pro;
	protected Select fruits;
	
	public ExtentReports report;
	public ExtentTest test;

	
	public void initialConfig() throws IOException
	{
		fis = new FileInputStream(System.getProperty("user.dir"+"//src//config//config.properties"));
		
			pro= new Properties();
			pro.load(fis);

	}
	
	
	

}
