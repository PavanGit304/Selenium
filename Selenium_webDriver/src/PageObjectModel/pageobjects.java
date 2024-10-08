package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectModel.POM_withPageFactory;

public class pageobjects {
	
	
	public WebDriver driver;
	POM_withPageFactory obj = PageFactory.initElements(driver, POM_withPageFactory.class);
	

}
