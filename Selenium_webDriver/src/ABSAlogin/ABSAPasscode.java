package ABSAlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABSAPasscode {

	public static void main(String[] args) throws Exception {
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




		WebElement input =d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']"));   // 
		
		//  tagName[@class='ui-cell']//following::*[@id='pff2']
		// td : TagName   , @class/ or @id or @name = 'value '  ,  write following::*   , @id or @name or @class = 'value'
		
		System.out.println("First box: " + input.getAttribute("num"));   
		String box1 = input.getAttribute("num");              // WebElement obj.getAttribute("num");  it gets the attribute value like (id,class,name.. values)
		
		WebElement input2 =d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']"));
		System.out.println("Second box: " + input2.getAttribute("num"));
		String box2 = input2.getAttribute("num");

		WebElement input3 =d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']"));
		System.out.println("Third box: " + input3.getAttribute("num"));
		String box3 = input3.getAttribute("num"); // num is unique 
		
		

		switch(box1) {
		case "1": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("P");
			//System.out.println("P");
			break;
		case "2": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("a");
			//System.out.println("P");
			break;
		case "3": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("s");
			//System.out.println("P");
			break;
		case "4": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("s");
			//System.out.println("P");
			break;
		case "5": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("w");
			//System.out.println("P");
			break;
		case "6": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("o");
			//System.out.println("P");
			break;
			
		case "7": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("r");
			//System.out.println("P");
			break;
		case "8": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("d");
			//System.out.println("P");
			break;
		case "9": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff1']")).sendKeys("1");
			//System.out.println("P");
			break;
			
		}
		
		switch(box2) {
		case "1": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("P");
			//System.out.println("P");
			break;
		case "2": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("a");
			//System.out.println("P");
			break;
		case "3": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("s");
			//System.out.println("P");
			break;
		case "4": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("s");
			//System.out.println("P");
			break;
		case "5": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("w");
			//System.out.println("P");
			break;
		case "6": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("o");
			//System.out.println("P");
			break;
			
		case "7": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("r");
			//System.out.println("P");
			break;
		case "8": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("d");
			//System.out.println("P");
			break;
		case "9": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff2']")).sendKeys("1");
			//System.out.println("P");
			break;
			
		}
		
		switch(box3) {
		case "1": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("P");
			//System.out.println("P");
			break;
		case "2": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("a");
			//System.out.println("P");
			break;
		case "3": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("s");
			//System.out.println("P");
			break;
		case "4": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("s");
			//System.out.println("P");
			break;
		case "5": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("w");
			//System.out.println("P");
			break;
		case "6": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("o");
			//System.out.println("P");
			break;
			
		case "7": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("r");
			//System.out.println("P");
			break;
		case "8": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("d");
			//System.out.println("P");
			break;
		case "9": 
			d.findElement(By.xpath("//td[@class='ui-cell']//following::*[@id='pff3']")).sendKeys("1");
			//System.out.println("P");
			break;
			
		}


		d.findElement(By.xpath("//button[@class='ui-button ap-button-next']//following::*[@class='ui-button-center']")).click();
		
		
	}

}
