package com.basic.sharedataSD;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ShareDataStepDef1 {

WebDriver driver; 

public ShareDataStepDef1(SharedClass share){
	driver = share.setup();
	
}


@Then("^User checks user \"([^\"]*)\" firstname is present$")
public void user_checks_user_firstname_is_present(String userName) throws InterruptedException {
  String userNameActual =  driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
  Assert.assertEquals(userName, userNameActual);
	Thread.sleep(2000);
	System.out.println("user firstname is checked  |");
}

@And ("^User enters user \"([^\"]*)\" surname$")
public void User_enters_user_surname(String surname) throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
	  Thread.sleep(2000);
	  System.out.println("user firstname is entered  |");
	 
  }
  
@Then ("^User Mobile Field should be blank")
public void But_User_Mobile_Field_should_be_blank() throws InterruptedException {
	  String mobileActual =  driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
	  Assert.assertEquals("", mobileActual);
	  Thread.sleep(2000);
	System.out.println("user mobile field was blank|");
	
	  
  }
}	
  

