package com.basic.sharedataSD;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ShareDataStepDef {

	WebDriver driver;


	public ShareDataStepDef(SharedClass share){
		driver = share.setup();
		
	}



	
@Given("^User need to be on facebook login page$")
public void User_need_to_be_on_facebook_login_page() throws InterruptedException {
	
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
public void User_enters_user_firstname(String username) throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(username);
	Thread.sleep(2000);
	System.out.println("user firstname is entered  |");


}
}

  

	
  

