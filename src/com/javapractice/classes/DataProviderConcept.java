package com.javapractice.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderConcept {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guptashubham\\NewWorkspace\\ArthaProject\\Drivers\\chromedriver_80.0.3987.16.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://stgsp.appsndevs.com:9041/spafrontend/register");
		Thread.sleep(10000);
	}
	
	
	
	@Test
	public void halfEbayRegistrationTest(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
