package com.automation.nutriag.com.automation.nutriag;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Nutrilogin extends Baseclass {
	
	Baseclass base = new Baseclass();
	
	
	public static final String username = ("//input[@id='username']");
	public static final String password = ("//input[@id='password']");
	public static final String submitbtn = ("//button[@class='primary']");
	public static final String titlematch = ("//button[@class='primary']");
	
	
	
	
	
	@Test(priority = 1)
	public void verifylogin() {

		base.timeout();
		
		String search_text = "Google Search";
		WebElement username_box = driver.findElement(By.name(username));
		username_box.sendKeys("pm@positionmysite.com");
		
		WebElement password_box = driver.findElement(By.name(password));
		password_box.sendKeys("PMS!235%");
		
		WebElement submit_btn = driver.findElement(By.name(submitbtn));
		submit_btn.click();
		
		try {
			if(titlematch.contains("Dashboard"))
			{
				System.out.println("Case 1: Login Case passed ");
				
			}
			
		} catch (Exception e) {
			
			else
			{
				System.out.println("Case 1: Login Case failed ");
					
			}
		}
		
		
		
		
		
	}
}
