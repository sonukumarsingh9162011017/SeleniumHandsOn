package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class FramesTests extends AbstractChromeDriverWebDriverTest{
	
	@Test
	public void FrameTest()
	{
		driver.get("http://localhost:8080/pages/frames-example.html");
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
		driver.switchTo().parentFrame();//Before Switching frome one from to another frame we need to go to ParentFrame
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println(driver.findElement(By.className("panel-heading")).getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.id("textElement")).getAttribute("value"));
	}

}
