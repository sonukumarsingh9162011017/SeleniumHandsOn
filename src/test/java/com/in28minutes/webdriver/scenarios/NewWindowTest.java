package com.in28minutes.webdriver.scenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class NewWindowTest extends AbstractChromeDriverWebDriverTest{
	@Test
	@Ignore
	public void NewWindowTests()
	{
		driver.get("http://localhost:8080/pages/notifications.html");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.id("newPageButton")).click();
		System.out.println(driver.getWindowHandle());
		sleep(5);
		System.out.println(driver.getWindowHandles());
		sleep(5);
	}
	
	@Test
	public void GetSecondWindowHandel()
	{
		driver.get("http://localhost:8080/pages/notifications.html");
		String handel=driver.getWindowHandle();
		System.out.println( handel);//It will print First Window Handel
		
		driver.findElement(By.id("newPageButton")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		String SecondWindowHandel = FindSecondWindowHandel(handel, windowHandles);
		System.out.println(SecondWindowHandel);
	}

	private String FindSecondWindowHandel(String handel, Set<String> windowHandles) {
		String SecondWindowHandel=null;
		for(String  handel1:windowHandles)
		{
			if(!handel1.equals(handel))
			{
				SecondWindowHandel=handel1;
			}
		}
		return SecondWindowHandel;
	}
	
	@Test
	public void SwitchToSecondWindow()
	{
		driver.get("http://localhost:8080/pages/notifications.html");
		String handel=driver.getWindowHandle();
		System.out.println( handel);//It will print First Window Handel
		
		driver.findElement(By.id("newPageButton")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		String SecondWindowHandel = FindSecondWindowHandel(handel, windowHandles);
		System.out.println(SecondWindowHandel);
		
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		driver.switchTo().window(SecondWindowHandel);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		driver.switchTo().window(handel);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
	}

}
