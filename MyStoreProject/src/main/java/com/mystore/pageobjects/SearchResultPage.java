package com.mystore.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SearchResultPage extends BaseClass {
	
	@FindBy(xpath="/html/body/div[5]/div[3]/div[2]/div[2]/div/a/div[2]")  
	WebElement productResult;     // go to search bar--> type Men T-shirts --> selected red Tshirt and copied the xpath

	public SearchResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean isProductAvaialable() {
		return Action.isDisplayed(getDriver(), productResult);
	}
	
	public AddToCartPage clickOnProduct() {
		Action.explicitWait(getDriver(), productResult, Duration.ofSeconds(10));
		Action.click(getDriver(), productResult);
		return new AddToCartPage();
	}
}
