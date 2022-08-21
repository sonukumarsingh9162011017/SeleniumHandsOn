package com.in28minutes.webdriver.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class PlayaingWithModelWindowAndWaitsTest extends AbstractChromeDriverWebDriverTest{
	
	@Ignore
	@Test
	public void PlayaingWithModelWindowAndWaits()
	{
		driver.get("http://localhost:8080/pages/notifications.html");
		//WebElement ModelBodyElement = driver.findElement(By.id("myModalBody"));
		WebElement ModelButtonElement = driver.findElement(By.id("modalButton"));
		ModelButtonElement.click();
		driver.findElement(By.id("myModalCloseButton")).click();
		
	}
	
	@Ignore
	@Test
	public void PlayaingWithModelWindow_ImplicitWaits()
	{driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/pages/notifications.html");
		//WebElement ModelBodyElement = driver.findElement(By.id("myModalBody"));
		WebElement ModelButtonElement = driver.findElement(By.id("modalButton"));
		ModelButtonElement.click();
		driver.findElement(By.id("myModalCloseButton")).click();
		
	}
	
	@Test
	public void PlayaingWithModelWindow_ExplicitWaits()
	{
		WebDriverWait webdriverwait =new WebDriverWait(driver, 10);
		
		driver.get("http://localhost:8080/pages/notifications.html");
		//WebElement ModelBodyElement = driver.findElement(By.id("myModalBody"));
		WebElement ModelButtonElement = driver.findElement(By.id("modalButton"));
		ModelButtonElement.click();
		
		WebElement ModelElement = driver.findElement(By.id("myModalLabel"));
		webdriverwait.until(ExpectedConditions.visibilityOf(ModelElement));
		System.out.println(ModelElement.getText());
		
		driver.findElement(By.id("myModalCloseButton")).click();
		
	}

}
