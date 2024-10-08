package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

import net.bytebuddy.asm.Advice.This;

public class AccountCreationPage extends BaseClass{
	
	@FindBy(id = "J_RegisterSumbit")
	WebElement CreateMyAccount;

	public AccountCreationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean ValidateCreateMyAccount() {
		return Action.isDisplayed(getDriver() , CreateMyAccount);
	
	}
}
