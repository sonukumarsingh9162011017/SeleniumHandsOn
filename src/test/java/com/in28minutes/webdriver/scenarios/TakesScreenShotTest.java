package com.in28minutes.webdriver.scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class TakesScreenShotTest extends AbstractChromeDriverWebDriverTest {
	@Test
	public void TakeScreenShot1() throws IOException
	{
		driver.get("http://localhost:8080/pages/frames-example.html");
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs,
				new File("./target/"+"driver"+"-screenshot.png"));
	
	}
	
	@Test
	public void TakeScreenShot2() throws IOException
	{
		driver.get("https://www.google.com/");
		File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File ("./target/" +"driver"+"screenshot2.png"));
	}
	
}
