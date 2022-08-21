package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver.Window;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class PlayaingWithScreenWindowTest extends AbstractChromeDriverWebDriverTest{
	@Ignore
	@Test
	public void PlayaingWithScreenWindow()
	{
		driver.get("http://localhost:8080/pages/forms.html");
		System.out.println(driver.manage().window().getPosition());
		sleep(5);
		System.out.println(driver.manage().window().getSize());
		sleep(5);
		driver.manage().window().fullscreen();
		sleep(5);
		driver.manage().window().maximize();
		sleep(5);
		driver.manage().window().setPosition(new Point(200,200));
		sleep(5);
		driver.manage().window().setSize(new Dimension(200,200));
		sleep(5);
	}
	@Test
	public void BackForwardAndNavigation()
	{
		driver.get("http://localhost:8080/pages/forms.html");
		sleep(5);
		driver.get("http://localhost:8080/pages/tables.html");
		sleep(5);
		driver.get("http://localhost:8080/pages/login.html");
		sleep(5);
		driver.get("http://localhost:8080/pages/index.html");
		sleep(5);
		
		driver.navigate().back();
		sleep(5);
		driver.navigate().back();
		sleep(5);
		driver.navigate().back();
		sleep(5);
		driver.navigate().forward();
		sleep(5);
		driver.navigate().refresh();
		sleep(5);
		driver.navigate().back();
		sleep(5);
		
		
	}
}
