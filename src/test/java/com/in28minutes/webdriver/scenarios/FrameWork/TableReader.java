package com.in28minutes.webdriver.scenarios.FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableReader {
	private WebDriver wd;
	private String id;
	private WebElement tbody;
	public TableReader(WebDriver driver, String id1) {
		this.wd=driver;
		this.id=id1;
		this.tbody=wd.findElement(By.cssSelector("#"
				+ id+
				" > tbody"));
	}
	public String getData(int i, int j) {
		String x=tbody.findElement(By.cssSelector("tr:nth-child("
				+ i
				+ ") > td:nth-child("
				+ j
				+ ")")).getText();
		return x;
	}
	
	

}
