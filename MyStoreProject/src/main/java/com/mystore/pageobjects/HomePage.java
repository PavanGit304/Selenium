package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"ordersListContainer\"]/nav/span[1]")
	WebElement allOrders;

	@FindBy (xpath ="/html/body/div[4]/div/div[2]/div[1]/div/section[1]/aside/nav/a[2]")
	WebElement myFavorites;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean  validateAllOrders() {
		return Action.isDisplayed(getDriver(), allOrders);
	}
	public boolean validateMyFavorites() {
		return Action.isDisplayed(getDriver(), myFavorites);
	}
	
	public String getHomePageCurrentURL() {
		String homePageURL=getDriver().getCurrentUrl();
		return homePageURL;
	}
}
