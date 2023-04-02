package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {

WebDriver driver; 

@Given("^User need to be on facebook login page$")
public void user_need_to_be_on_facebook_login_page() {
	System.setProperty("webdriver.chrome.driver", "D:\\CUCUMBER_SETUP\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
  
}

@When("^User enters user firstname$")
public void user_enters_user_firstname() {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Milton");
    
}

@Then("^User checks user first name is present$")
public void user_checks_user_first_name_is_present() {
  String userNameActual =  driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
  Assert.assertEquals("Milton", userNameActual);
	
	}
}
