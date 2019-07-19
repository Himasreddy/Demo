package org.qsp.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkart 
{
	@Test
	public void flipkart1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\hima\\java\\selenium project\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	
	
	
}
