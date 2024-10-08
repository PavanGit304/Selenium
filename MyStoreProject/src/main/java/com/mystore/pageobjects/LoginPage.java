package com.mystore.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass{
	
@FindBy(id = "loginEmail")
WebElement userName;

@FindBy(id ="loginPassword")
WebElement password;

@FindBy (xpath="//*[@id=\"J_LoginSumbit\"]")
WebElement signInButton;

@FindBy (xpath="//*[@id=\"registerEmail\"]") //*[@id="registerEmail"]  
WebElement emailForNewAccount;

@FindBy (xpath="//*[@id=\"registerPassword\"]") 
WebElement passwordForNewAccount;

@FindBy (xpath ="//*[@id=\"J_RegisterSumbit\"]") 
WebElement CreateNewAccountButton;

public LoginPage() { 
	PageFactory.initElements(getDriver(), this);//it initilizing page objects 
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

public void  createNewAccount(String newEmail, String newEmailpwd) {
	Action.type(emailForNewAccount, newEmail);
	Action.type(passwordForNewAccount, newEmailpwd);
	Action.click(getDriver(), CreateNewAccountButton);
//	return new AccountCreationPage();
}

}
