package com.in28minutes.webdriver.scenarios;

import static org.testng.Assert.assertFalse;
//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class CheckElementStylesTest extends AbstractChromeDriverWebDriverTest{
	@Ignore
	@Test
	public void getCSSStyles()
	{
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement FormElement = driver.findElement(By.id("disabledInput"));
		System.out.println(FormElement.isEnabled());
		System.out.println(FormElement.getCssValue("color"));
		System.out.println(FormElement.getCssValue("display"));
		System.out.println(FormElement.getCssValue("border-color"));
		System.out.println(FormElement.getCssValue("height"));
		System.out.println(FormElement.getCssValue("width"));
		System.out.println(FormElement.getCssValue("background-colors"));
		assertFalse(FormElement.isEnabled());
	}
	
	@Test
	public void PracticeOnWebElementsMethods()
	{
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement FormElement = driver.findElement(By.id("disabledInput"));
		
		//getAttributeMethod
		System.out.println(FormElement.getAttribute("placeholder"));
		System.out.println(FormElement.getAttribute("value"));
		System.out.println(FormElement.getAttribute("id"));
		System.out.println(FormElement.getAttribute("name"));
		
		//getLocation
		
		System.out.println(FormElement.getLocation());
		
		
	//getSize
		System.out.println(FormElement.getSize());
	}

}
