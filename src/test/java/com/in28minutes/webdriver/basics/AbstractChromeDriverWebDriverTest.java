package com.in28minutes.webdriver.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AbstractChromeDriverWebDriverTest {

	protected WebDriver driver;

	/*public AbstractWebDriverTest() {
		super();
	}*/

	@BeforeMethod
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONU KUMAR SINGH\\.m2\\\\repository\\webdriver\\chromedriver.exe");
		 driver=new ChromeDriver();
	
	}

	@AfterMethod
	public void After() {
		  driver.close();
		  driver.quit();
	  }
	
	public void sleep(int x)
	{
		try {
			Thread.sleep(x*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
