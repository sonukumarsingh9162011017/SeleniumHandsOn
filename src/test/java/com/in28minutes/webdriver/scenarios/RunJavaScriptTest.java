package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class RunJavaScriptTest extends AbstractChromeDriverWebDriverTest{
	
	@Test
	public void RunJavaScript()
	{
		driver.get("http://localhost:8080/pages/tables.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		System.out.println(js.executeScript("return document.title"));
		
		js.executeScript("window.scrollBy(0,200)");
		sleep(3);
		js.executeScript("window.scrollBy(0,200)");
		sleep(3);
		js.executeScript("window.scrollBy(0,200)");
		sleep(3);
	}

}
