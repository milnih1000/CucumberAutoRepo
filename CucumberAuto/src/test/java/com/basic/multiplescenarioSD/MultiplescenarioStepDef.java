package com.basic.multiplescenarioSD;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplescenarioStepDef {

WebDriver driver; 

@Given("^User need to be on facebook login page$")
public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\CUCUMBER_SETUP\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//deze onthouden
		driver.findElement(By.xpath("//button[contains(text(),'Essentiële en optionele cookies toestaan')]")).click();
		Thread.sleep(3000);
		//deze onthouden
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();	
		
		Thread.sleep(3000);
		
}

@When("^User enters user firstname$")
public void user_enters_user_firstname() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Milton");
	Thread.sleep(1000);
	System.out.println("user firstname is entered  |");
}

 @Then("^User checks user firstname is present$")
 public void user_checks_user_firstname_is_present() throws InterruptedException {
  String userNameActual =  driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
   Assert.assertEquals("Milton", userNameActual);
	Thread.sleep(1000);
	System.out.println("user firstname is checked  |");
}
  @And ("^User enters user surname$")
  public void User_enters_user_surname() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nihora");
	  Thread.sleep(1000);
	  System.out.println("user firstname is entered  |");
	 
  }
  
  @Then ("^User Mobile Field should be blank$")
  public void But_User_Mobile_Field_should_be_blank() throws InterruptedException {
	  String mobileActual =  driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
	  Assert.assertEquals("", mobileActual);
	  Thread.sleep(1000);
	System.out.println("user mobile field was blank|");
	
  }
  
@Then ("^close browser$") 
public void close_browser(){
	driver.quit();
	driver = null;

}	
  
}
