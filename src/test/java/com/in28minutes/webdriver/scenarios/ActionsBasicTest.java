package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class ActionsBasicTest extends AbstractChromeDriverWebDriverTest{
	@Test
	@Ignore
	public void ActionBasictests()
	{
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement element1 = driver.findElement(By.id("textElement"));
		WebElement element2 = driver.findElement(By.linkText("Tables"));
		
		Actions a=new Actions(driver);
		element1.clear();
		a.sendKeys(element1,"Welcome to Automation Testing").click(element2).perform();
		sleep(5);
		
	}
	
	@Test
	public void TestBasicDragAndDrag()
	{
		driver.get("http://localhost:8080/pages/sortable.html");
		WebElement element1 = driver.findElement(By.id("css"));
		WebElement element2 = driver.findElement(By.id("design"));
		
		Actions a=new Actions(driver);
		sleep(7);
		/*a.dragAndDrop(element1, element2).perform();
		sleep(7);*/
		
		
		/*a.dragAndDropBy(element2, 50,200).perform();
		sleep(7);*/
		
		a
		.clickAndHold(element1)
		.moveToElement(element2, 100, 200)
		.release()
		.perform();
	}
}
