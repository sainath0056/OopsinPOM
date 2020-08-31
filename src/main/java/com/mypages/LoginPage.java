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
public class LoginPage extends BasePage {
	
	private By emailID = By.id("username");
	private By password =By.id("password");
	private By loginButton =By.id("loginBtn");
	private By header =By.xpath("//i18n-string[@data-key='login.signupLink.text']");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the emailID
	 */
	public WebElement getEmailID() {
		return getElement(emailID);
	}

	

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username,String pwd) {
		getEmailID().sendKeys(username);
	   getPassword().sendKeys(pwd);
	   getLoginButton().click();
	   
	   return getInstance(HomePage.class);
	
	}
	
	
	public void doLogin() {
		getEmailID().sendKeys("");
	   getPassword().sendKeys("");
	   getLoginButton().click();
	   
	
	}
	
	
	
}
