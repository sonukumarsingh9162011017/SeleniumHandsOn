package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;
import com.in28minutes.webdriver.scenarios.FrameWork.TableReader;

public class ReadTablesTests extends AbstractChromeDriverWebDriverTest{
	@Test
	@Ignore
	public void ReadtablesTest()
	{
		driver.get("http://localhost:8080/pages/tables.html");
		
		//ThroughCSSSelector
		WebElement TableBodyCssSelectorPath = driver.findElement(By.cssSelector("#dataTables-example > tbody"));
		String s1=TableBodyCssSelectorPath.findElement(By.cssSelector("tr:nth-child(5) > td:nth-child(2)")).getText();
		String s2=TableBodyCssSelectorPath.findElement(By.cssSelector("tr:nth-child(6) > td:nth-child(2)")).getText();
		System.out.println(s1);
		System.out.println(s2);
		
		
		//ThroughXPath
		WebElement TableElementByXPath = driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody"));
		String s3=TableElementByXPath.findElement(By.xpath("//tr[5]/td[2]")).getText();
		String s4=TableElementByXPath.findElement(By.xpath("//tr[6]/td[2]")).getText();
		System.out.println(s3);
		System.out.println(s4);
	}
	
	@Test
	public void ReadtablesUsingFrameWork1()
	{
		driver.get("http://localhost:8080/pages/tables.html");
		
		TableReader tr1=new TableReader(driver,"dataTables-example");
		System.out.println(tr1.getData(1,2));
		System.out.println(tr1.getData(2,2));
		TableReader tr2 = new TableReader(driver,"dataTables-example-4");
		System.out.println(tr2.getData(1,2));
		System.out.println(tr2.getData(2,2));

	}

}
