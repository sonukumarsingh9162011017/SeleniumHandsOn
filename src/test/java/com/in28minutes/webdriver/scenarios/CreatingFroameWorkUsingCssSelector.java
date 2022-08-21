package com.in28minutes.webdriver.scenarios;
import org.testng.annotations.Test;
import com.in28minutes.webdriver.basics.AbstractChromeDriverWebDriverTest;
import com.in28minutes.webdriver.scenarios.FrameWork.TableReaderClass;
public class CreatingFroameWorkUsingCssSelector extends AbstractChromeDriverWebDriverTest{
	@Test
	public void CreatingFrameworkAndUsingCssSelector()
	{
		driver.get("http://localhost:8080/pages/tables.html");
		TableReaderClass trc= new TableReaderClass(driver,"dataTables-example");
		System.out.println(trc.getTextData(1,2));
		System.out.println(trc.getTextData(7,3));
	}
}