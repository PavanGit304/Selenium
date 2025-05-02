package com.mystore.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id = "loginEmail") 
	private WebElement userName;

	@FindBy(id = "loginPassword")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"J_LoginSumbit\"]")
	private WebElement signInButton;

	@FindBy(xpath = "//*[@id=\"registerEmail\"]") // *[@id="registerEmail"]
	private WebElement emailForNewAccount;

	@FindBy(xpath = "//*[@id=\"registerPassword\"]")
	private WebElement passwordForNewAccount;

	@FindBy(xpath = "//*[@id=\"J_RegisterSumbit\"]")
	private WebElement CreateNewAccountButton;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);// it initilizing page objects
	}

	public HomePage login(String uname, String pwd) {
	Action.type(userName, uname);// type() method contians sendkeys code. instead of txt using String for access data from excel
    Action.type(password, pwd);
    Action.click(getDriver(), signInButton);
    return new HomePage();// after click on signInButton it navigates to Home page that why we returning Homepage class and the return type must be class name ex:HomePage
    }
//sign out code not writen 

	public AddressPage login1(String uname, String pwd) {
	Action.type(userName, uname);// type() method contians sendkeys code. instead of txt using String for access data from excel
    Action.type(password, pwd);
	Action.click(getDriver(), signInButton);
	return new AddressPage();
}

public void createNewAccount(String newEmail, String newEmailpwd) {
	Action.type(emailForNewAccount, newEmail);
	Action.type(passwordForNewAccount, newEmailpwd);
	Action.click(getDriver(), CreateNewAccountButton);
//	return new AccountCreationPage();
}

}


/*
 * 
 * 
 

🚀 What does this class do?
It automates actions on a login and registration page using Selenium.

🔑 Key Actions:
Login to your account
Example: You open a shopping website, enter your email and password, click Sign In, and land on the Home Page.
➤ That's what login() does.

Login and go to address section
Example: You log in and go straight to your Address Page.
➤ That’s what login1() does.

Create a new account
Example: You enter a new email and password and click Register to create an account.
➤ That’s what createNewAccount() does.
 * */
