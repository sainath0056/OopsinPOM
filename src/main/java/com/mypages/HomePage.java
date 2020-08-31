/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author stalagad
 *
 */
public class HomePage extends LoginPage{
	
	By header=By.cssSelector("h1.private-page__title");

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	
	//PageActions
	public String getHomePageTitle() {
		return getPageTitle();
	}
	public String getHomePageHeader() {
		return getPageHeader(header);
	}
	

}
