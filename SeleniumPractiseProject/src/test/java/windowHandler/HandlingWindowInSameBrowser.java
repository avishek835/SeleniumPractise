package windowHandler;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingWindowInSameBrowser {
	
	WebDriver driver;
	@Test
	public void handlingWindowInSameBrowser()
	{
		
		/*System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Set<String> WinIds=driver.getWindowHandles();
		System.out.println("Total Windows:" +WinIds.size());
		Iterator<String> it=WinIds.iterator();
		System.out.println(it.next());
		driver.get("https://www.naukri.com/");
		System.out.println("-------------------------");
		 WinIds=driver.getWindowHandles();
		System.out.println("Total Windows:" +WinIds.size());
		it=WinIds.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		String mainWindowId=it.next();
		String firstPopup=it.next();
		String secondPopup=it.next();
		
		driver.switchTo().window(firstPopup).close();
		driver.switchTo().window(secondPopup).close();*/
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver\\chromedriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new ChromeDriver();// 1 window
		Set<String> winIds = driver.getWindowHandles();
		System.out.println("Total windows - "+ winIds.size());
		if(winIds.size()>1){
			// pop is present - detect popups
		}
		Iterator<String> it = winIds.iterator();
		System.out.println(it.next());
		driver.get("http://naukri.com");
		System.out.println("------------------------");
		winIds = driver.getWindowHandles();
		System.out.println("Total windows - "+ winIds.size());
		it = winIds.iterator();
		String mainWindowID = it.next();
		String firstPopup = it.next();
		String secondPopup = it.next();
		//String thirdPopup = it.next();
		System.out.println(mainWindowID);
		System.out.println(firstPopup);
		System.out.println(secondPopup);
		//System.out.println(thirdPopup);
		
		driver.switchTo().window(firstPopup);
		// - fired on 1st pop
		driver.close();// closes window under focus
		driver.switchTo().window(secondPopup);
		driver.close();
		//driver.switchTo().window(thirdPopup);
		//driver.close();
		
		driver.switchTo().window(mainWindowID);
		//driver.switchTo().defaultContent();

		//driver.quit(); // close all windows and end selenium session
		
		
		
	}

}
