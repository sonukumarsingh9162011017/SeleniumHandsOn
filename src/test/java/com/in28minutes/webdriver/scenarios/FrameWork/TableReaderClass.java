package com.in28minutes.webdriver.scenarios.FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableReaderClass {
	private WebDriver wd;
	private String id1;
	private WebElement tbody;
	public TableReaderClass(WebDriver driver, String id) {
		this.wd=driver;
		this.id1=id;
		tbody = wd.findElement(By.cssSelector("#"
				+ id1
				+ " > tbody"));
	}
	public String getTextData(int row,int col) {
		String s=tbody.findElement(By.cssSelector("tr:nth-child("
				+ row
				+ ") > td:nth-child("
				+ col
				+ ")")).getText();
		return s;
	}
}
