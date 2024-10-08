package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

//import freemarker.core.ReturnInstruction.Return;

public class IndexPage extends BaseClass{ //in this class we are storing all the web elements in the form of objects 

	@FindBy(xpath="//*[@id=\"J_UserInfoBlock\"]")    
	WebElement signInButton;
	
	@FindBy(xpath = "//*[@id=\"uni-header\"]/div[1]/a/img")
	WebElement myStoreLogo;
	
	@FindBy(id = "keywords") 
	WebElement searchProductBox;
	
	@FindBy(xpath ="//*[@id=\"uni-header\"]/div[2]/div/form/div/button")
	WebElement searchButton;
	
	public IndexPage() {//constructor 
		PageFactory.initElements(getDriver(), this);// it initialize all the page objects 
	}
	
	public LoginPage clickOnSignIn() {
		Action.click(getDriver(), signInButton); // using Action class we calling click method 
		return new LoginPage();  //after click on signIn page it navigate to LoginPage that why we returning Login page note: when we returning loginClass then the return type must be class name ex:Loginpage 
	}
	
	public boolean validateLogo() {// it validate logo
		return Action.isDisplayed(getDriver(), myStoreLogo);
		
	}
	
	public String getMyStoreTitle() { // it return application title note: it is optional 
		String myStoreTitelString = getDriver().getTitle();
		return myStoreTitelString ;
	}
	
	public SearchResultPage searchProduct(String productName) {
		Action.type(searchProductBox, productName);// type() method contains sendkeys code note: instead of text we passing string name for access the data from excel
	    Action.click(getDriver(), searchButton);// it clicks the search button
	    return new SearchResultPage(); // after click on search button it navigates to SerachResultPage that why we returning SerachResultPage note: when we returning SerachResultPage Class then the return type must be class name ex:SerachResultPage 
	}
}
