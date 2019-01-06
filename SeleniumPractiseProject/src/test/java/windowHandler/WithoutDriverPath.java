package windowHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutDriverPath {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Drivers\\chromedriver.exe");
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	
	
	@Test
	public void openChromeBrowser()
	{
		/*WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();*/
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
