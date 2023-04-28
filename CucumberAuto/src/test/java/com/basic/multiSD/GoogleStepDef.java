package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
	
	WebDriver driver =null; 

	@Given("^User need to be on google page$")
	public void user_need_to_be_on_google_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CUCUMBER_SETUP\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.get("https://www.google.com/");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[(@id='L2AGLb')]/div")).click();
			
	}
	
	@When ("^User enters search string$")
	public void User_enters_search_string() throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(1000);
		
		
	}
	
		
	  
	
}
