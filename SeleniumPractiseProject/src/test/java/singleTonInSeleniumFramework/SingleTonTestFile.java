package singleTonInSeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingleTonTestFile {
	
	WebDriver driver;
	
	@BeforeClass
	public  void open()
	{
		SingleTonMainClass instanceDriver=SingleTonMainClass.getInstance();
		driver=instanceDriver.openBrowser();
	
	}
	
	@Test()
	public void testMethod1()
	{
		driver.get("http://www.google.com");
		
		
	}
	
	@Test(priority=1)
	public void testMethod2()
	{
		String s=driver.getTitle();
		System.out.println(s);
		Assert.assertEquals(s,"x");
	}
	
	@Test(priority=2)
	public void maximizeWindow()
	{
		driver.manage().window().maximize();
		System.out.println("maximized window");
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
}
