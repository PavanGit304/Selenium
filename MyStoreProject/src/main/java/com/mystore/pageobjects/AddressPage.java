package com.mystore.pageobjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddressPage extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"addressList\"]/div[2]/div[1]/div/div/div[3]/span")
	WebElement editButton;

	@FindBy(xpath = "//*[@id=\"editAddressModalWrapper\"]/div[2]/div[1]/div/div[2]/button")
	WebElement saveButton;
	
	public AddressPage() {
		PageFactory.initElements(getDriver(), this);
	} 
	
	public void clikOnEdit() {
		Action.click(getDriver(), editButton);
	}
	
	public ShippingPage verifyShippingAddress() {
		Action.click(null, saveButton);
		return new ShippingPage();
	}
}
