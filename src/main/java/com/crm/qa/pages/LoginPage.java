package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory - OR (Object Repository)
	@FindBy(name="email")
	WebElement username;
		
	@FindBy(xpath="//input[@name='password']") //complete xpath = /html/body/div[1]/div/div/form/div/div[2]/div/input
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Sign Up')]")
	WebElement signUpBtn;
	
	
	
	//initializing the page object:
	public LoginPage() {
		PageFactory.initElements(driver, this); //here we use this because it is pointing to current class object, we can also write LoginPage.Class
		
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String user, String pwd) {
		
		
		username.sendKeys(user);
		
		password.sendKeys(pwd);
		
		loginBtn.click();
		
		return new HomePage();
	}
	

	

}
