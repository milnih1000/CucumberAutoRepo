package com.basic.hooksSD;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDef {

WebDriver driver =null; 

	@Before(order=1)
	public void beforeSetup1(){
		System.out.println("In before1");
		System.setProperty("webdriver.chrome.driver", "D:\\CUCUMBER_SETUP\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
				
}
	@Before(order=2)
	public void beforeSetup2(){
		System.out.println("In before2");
		
		
}
@Given("^User need to be on facebook login page$")
public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
	
		driver.get("https://www.facebook.com/");
		//deze onthouden
		driver.findElement(By.xpath("//button[contains(text(),'Essentiële en optionele cookies toestaan')]")).click();
		Thread.sleep(3000);
		//deze onthouden
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();	
		
		Thread.sleep(3000);
		
}
//de regex uit het hoofd leren
@When("^User enters user \"([^\"]*)\" firstname$")
public void user_enters_user_firstname(String username) throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(username);
	Thread.sleep(1000);
	System.out.println("user firstname is entered  |");
}

@Then("^User checks user \"([^\"]*)\" firstname is present$")
public void user_checks_user_firstname_is_present(String userName) throws InterruptedException {
  String userNameActual =  driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
  Assert.assertEquals(userName, userNameActual);
	Thread.sleep(1000);
	System.out.println("user firstname is checked  |");
}
  @And ("^User enters user \"([^\"]*)\" surname$")
  public void User_enters_user_surname(String surname) throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
	  Thread.sleep(1000);
	  System.out.println("user firstname is entered  |");
	 
  }
  
  @Then ("^User Mobile Field should be blank")
  public void But_User_Mobile_Field_should_be_blank() throws InterruptedException {
	  String mobileActual =  driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
	  Assert.assertEquals("", mobileActual);
	  Thread.sleep(1000);
	System.out.println("user mobile field was blank|");
	
  }
  
/*@Then ("^close browser") 
public void close_browser(){
	driver.quit();
	driver = null;*/

  @After(order=2)
  public void tearDown1(){
	  System.out.println("in after1");
	  driver.quit();
	  driver = null;
	  
  }
  @After(order=1)
  public void tearDown2(){
	  System.out.println("in after2");
	 
	  
  }
}	
  

