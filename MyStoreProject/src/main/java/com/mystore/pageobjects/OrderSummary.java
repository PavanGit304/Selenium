package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class OrderSummary extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"orderSummaryContinuePayBtn\"]")
	WebElement purchaseButton;
	
	public OrderSummary() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean clickOnPurchaseButton() {

		return Action.click(getDriver(), purchaseButton);
	}

}
