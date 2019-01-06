package screenRecorderTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Util;

public class SwitchingGoogleFacebook {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		/*WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();*/
		
	}
	
	@Test
	public void navigation_FeatureTest() throws Exception{
		Util.startRecording("navigation_FeatureTest");
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		Util.stopRecording();
	}

	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
}
