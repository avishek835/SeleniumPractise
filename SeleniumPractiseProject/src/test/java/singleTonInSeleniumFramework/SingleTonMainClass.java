package singleTonInSeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTonMainClass {

	
	private static SingleTonMainClass singleton_instance=null;
	public String str;
	public WebDriver driver;
	
	//private constructor
	private SingleTonMainClass()
	{
		str="I am inside Singleton constructor";
	}
	
	//public static method(get instance) that has return type of object in this singleton class
	public static SingleTonMainClass getInstance()
	{
		if(singleton_instance==null)
			singleton_instance = new SingleTonMainClass();
		return singleton_instance;
	}
	
	
	public   WebDriver openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	
}
