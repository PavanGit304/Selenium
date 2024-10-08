package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class OrderPage extends BaseClass {

	@FindBy(xpath="//*[@id=\"9169020:3a879792ef518a56c8cfddba712330b4\"]/td[2]/p")
	WebElement unitPrice;  
	
	@FindBy(xpath="//*[@id=\"orderSettlementWrapper\"]/div[4]/span[2]")
	WebElement totalPrice;  
	
	@FindBy(id = "orderSummaryContinueBuy") 
	WebElement checkOutButton;
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String  getUnitPrice() {
		Action.switchToNewWindow(getDriver());
		String unitPrice1=unitPrice.getText();
//		String unit = unitPrice1.replaceAll("[^a-zA-Z0-9]", ""); //it replace the spcial characters with blank 
//	    Double finalUnitPrice = Double.parseDouble(unit); // coverting string to double it print unit price in number
	    return unitPrice1;
	}
	
	public double  getTotalPrice() {
		Action.switchToNewWindow(getDriver());
		String totalPrice1=totalPrice.getText();
		String tot = totalPrice1.replaceAll("[^a-zA-Z0-9]", ""); //it replace the spcial characters with blank 
	    Double finalTotalPrice = Double.parseDouble(tot); // coverting string to double it print unit price in number
	    return finalTotalPrice;
	}
	
	public LoginPage clickOnCheckOut() {
		Action.switchToNewWindow(getDriver());
		Action.click(getDriver(), checkOutButton);
		return new LoginPage();
	}
	
}


