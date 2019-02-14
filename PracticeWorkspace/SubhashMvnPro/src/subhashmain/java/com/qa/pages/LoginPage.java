package com.qa.pages;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BasePage;

// 3. loginpage 
public class LoginPage extends BasePage{

	/*// for redifFMAIL 
	@FindBy(name="email")
	WebElement loginname;
	
	@FindBy(name="passwd")
	WebElement password;
	
	
	@FindBy(name="proceed")
	WebElement gobtn;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/a/img ")
	WebElement redifflogo;
	
	
	@FindBy(xpath="//a[contains(text(),'Create a new account')]") //*[@id="u_0_2"] 
	WebElement createbtn;
	*/
	
	@FindBy(name="email")
	WebElement loginname;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")
	WebElement facebooklogo;
	
	@FindBy(xpath="//*[@id='u_0_2']") 
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id='u_0_11']")
	WebElement signupbtn;
	
	public LoginPage() throws IOException
	{   // Here with help of pagefactory we need to initialize elements . but take pagefactory.initelemnts(element, classtype )
		PageFactory.initElements(driver, this);
	}
	
  public String validateloginpageTitle()
  {
	  return  driver.getTitle();
  }
	
  public boolean validatefacebookimage()
  {
	  return facebooklogo.isDisplayed();
  }
  
  /*public void gotosignup()
  {
	  signupbtn.click();
  }*/
  
  public HomePage login(String un,String psw)
  
  {
	  loginname.sendKeys(un);
	  password.sendKeys(psw);
	  loginbtn.click();
	  return new HomePage();// Here HomePage is a class and we are craeting object for the Homepage .
  }}
