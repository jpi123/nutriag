package com.automation.nutriag.com.automation.nutriag;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Baseclass {
  
	 WebDriver driver;
	
	@BeforeSuite
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","D:\\Jignesh QA Files\\QA Automation Setup Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	@Test
	public void timeout()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
