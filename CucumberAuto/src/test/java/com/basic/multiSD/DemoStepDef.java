package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DemoStepDef {
	
	
	WebDriver driver =null; 

	@Given("^User need to be on demo site page$")
	public void user_need_to_be_demo_site_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CUCUMBER_SETUP\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
						
	}
	
	@When ("^User enters first name$")
	public void User_enters_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Luke");
		Thread.sleep(500);
		
		
	}
	
	@When ("^User enters last name$")
	public void User_enters_last_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Cage");
		Thread.sleep(500);
		
	

		}	
	  
	}




