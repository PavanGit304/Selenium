package login;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class login_diff_acc {
	


	public static void main(String[]args)
	{
		new login_diff_acc().m1();
	}
	
	public void m1() {
		
		
	try {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver 97\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		
		WebDriver d= new ChromeDriver();
		
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	d.get("https://eu.absa.co.za/absa-online/login.jsp");
		
	
		WebElement acc = d.findElement(By.xpath("//INPUT[@id='j_username']"));   // acc no 
		acc.clear();
		acc.sendKeys("9051079126");
		Thread.sleep(1000);
		WebElement pin = d.findElement(By.xpath("//INPUT[@id='j_pin']"));       // pin 
		pin.clear();
		pin.sendKeys("79126");
		Thread.sleep(1000);
		
	
		d.findElement(By.xpath("//DIV[@class='ui-button-center'][text()='Next']")).click();   // next button 
		Thread.sleep(5000);
		
		
		
		
		WebElement input1 = d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']"));
		System.out.println("input :"+input1.getAttribute("num"));
		
		System.out.println("input :"+input1.getAttribute("id"));
		
		
		String box1 =input1.getAttribute("num");  
		
		switch(box1) 
		{
		case "1":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("p");
			break;
			
		case "2":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("a");
			break;
		case "3":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("s");
			break;
		case "4":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("s");
			break;
		case "5":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("w");
			break;
		case "6":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("0");
			break;
		case "7":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("r");
			break;
		case "8":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("d");
			break;
		case "9":
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("1");
			break;
				
		}
			
	}
	catch(Exception e) 
	{
		System.out.println(e);
		
	}
	
	
}


}
