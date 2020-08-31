package com.MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value= {"browser"})
	public void setUpTest(String browser) {

		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver =new FirefoxDriver();
			}else {
				System.out.println("no browser is defined in xml.............");
			}
		driver.get("https://app.hubspot.com/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
