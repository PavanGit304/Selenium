package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ShippingPage extends BaseClass{

	@FindBy(id="shippingInsuranceSwitch")
	WebElement shippingInsuranceCheckBox;
	
	@FindBy (xpath = "//*[@id=\"orderSummaryContinuePayBtn\"]")
	WebElement continueButton;
	
	public ShippingPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
//	public void checkShippingInsuranceCheckBox() {
//		Action.click(driver, shippingInsuranceCheckBox);
//	}
	public PaymentPage clickOnContinue() {
		Action.click(getDriver(), continueButton);
		return new PaymentPage();
	}
}
