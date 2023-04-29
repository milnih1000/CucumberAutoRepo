package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SharedClass {
	
	WebDriver driver;
	
	

	@Before
	public WebDriver setup(){
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", "D:\\CUCUMBER_SETUP\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
						
		}
		return driver;
		
	}
	
	@After
	public void TearDown(){
		
		driver.quit();
		driver =null;
	}
	
	
	
}
