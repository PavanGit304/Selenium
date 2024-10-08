package com.mystore.pageobjects;

import javax.sound.midi.VoiceStatus;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class PaymentPage extends BaseClass{
	
	@FindBy(xpath ="//*[@id=\"PAYPAL\"]/div/span")
	WebElement payPalRadioButton;
	
	@FindBy(xpath = "//*[@id=\"CREDIT_OR_DEBIT_CARD_IFRAME\"]/div/span")
	WebElement creditOrDebitCardRadioButton;
	
	public PaymentPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickOnPayPal() {
		Action.click(getDriver(), payPalRadioButton);
	}
	public OrderSummary clickOnCreditOrDebitCard() {
		Action.click(getDriver(), creditOrDebitCardRadioButton);	
		return new OrderSummary();
	}

}
