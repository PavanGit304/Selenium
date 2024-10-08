package com.mystore.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddToCartPage extends  BaseClass {
	
@FindBy(xpath = "//*[@id=\"J_DataMaxQuantityBox\"]/span[2]") 
WebElement quantity;

@FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/form/ul/li[2]/div[1]/div[1]/div/div[3]/span") //*[@id="2_288"]
WebElement size;

@FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/div/form/div[3]/input")    
WebElement addToCartButton;

@FindBy(id = "orderSummaryContinueBuy")
WebElement checkOutButton;

@FindBy(xpath ="//*[@id=\"itemsForm\"]/div[1]/h2/span[1]") 
WebElement shipsIn24r;

public AddToCartPage() {
	PageFactory.initElements(getDriver(), this);
}


public void enterQuantity() {
	Action.click(getDriver(), quantity);
}

public void selectSize() {
//	Action.explicitWait(driver, size, Duration.ofSeconds(10));
	Action.switchToNewWindow(getDriver());
	Action.click(getDriver(), size);
}

public void  clickOnAddToCart() {
//	Action.explicitWait(driver, addToCartButton, Duration.ofSeconds(10));
	Action.scrollByVisibilityOfElement(getDriver(), addToCartButton);
//	Action.switchToNewWindow(driver);
	Action.click(getDriver(), addToCartButton);
}

public OrderPage clickOnCheckOut() {
	Action.click(getDriver(), checkOutButton);
	return new OrderPage();
}

public boolean validateAddToCart() {
	Action.switchToNewWindow(getDriver());
	return Action.isDisplayed(getDriver(), shipsIn24r);
}

}	
