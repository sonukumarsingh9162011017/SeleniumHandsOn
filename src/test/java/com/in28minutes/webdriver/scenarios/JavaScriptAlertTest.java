package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;

public class JavaScriptAlertTest extends AbstractChromeDriverWebDriverTest {
	@Test
	public void javaScriptAlert()
	{
		driver.get("http://localhost:8080/pages/notifications.html");
		// alertButtonId:- alertButton
		sleep(5);
		driver.findElement(By.id("alertButton")).click();
		sleep(5);
		
		
		Alert alertQuestion= driver.switchTo().alert();
		alertQuestion.sendKeys("Welcome to Automation Testing");
		alertQuestion.accept();
		sleep(5);
		
		Alert alerMessage=driver.switchTo().alert();
		 System.out.println(alerMessage.getText());
		 alerMessage.accept();
		 sleep(5);
	}
}
