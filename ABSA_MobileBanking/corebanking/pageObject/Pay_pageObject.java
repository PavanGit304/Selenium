package pageObject;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Utilites.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.functions.ExpectedCondition;

public class Pay_pageObject extends Utils {

	public WebDriverWait wait;
	public AppiumDriver<MobileElement> driver;

	public Pay_pageObject(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		wait = new WebDriverWait(driver, 100);
	}

	
	
	// pay new beneficiary
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Click here to make a payment\"]")
	private AndroidElement pay;

	@AndroidFindBy(xpath = "//*[contains(@text,'Pay new beneficiary')]")
	private AndroidElement paynewbeneficiary;

	// Pay_SomeOne
	@AndroidFindBy(xpath = "//*[contains(@text,'Enter beneficiary name')]")
	private AndroidElement beneficiary_name;

	@AndroidFindBy(xpath = "//*[contains(@text,'Select bank')]")
	private AndroidElement bank;

	@AndroidFindBy(xpath = "//*[contains(@text,'ABSA')]")
	private AndroidElement select_bank;

	@AndroidFindBy(xpath = "//*[contains(@text,'Select account type')]")
	private AndroidElement Acc_Type;

	@AndroidFindBy(xpath = "//*[contains(@text,'Cheque account')]")
	private AndroidElement selectAccType;

	@AndroidFindBy(xpath = "//*[contains(@text,'Enter account number')]")
	private AndroidElement Acc_NO;

	@AndroidFindBy(xpath = "//*[contains(@text,'Enter their reference')]")
	private AndroidElement Their_reference;

	@AndroidFindBy(xpath = "//*[contains(@text,'Enter reference for my statement')]")  //id:  ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private AndroidElement My_reference;

	// payment_Details
	@AndroidFindBy(xpath = "//*[contains(@text,'Enter amount')]")
	private AndroidElement enter_Amount;

	@AndroidFindBy(xpath = "//*[contains(@text,'R 0.00')]")
	private AndroidElement amount;
	
	@AndroidFindBy(id = "com.barclays.absa.banking.uat:id/selected_value_text_view")
	private AndroidElement click_CurrentAccount;

	@AndroidFindBy(id = "com.barclays.absa.banking.uat:id/content_text_view")
	private AndroidElement selectCurrentAcc;

	// pay An Existing Beneficiary
	@AndroidFindBy(id = "com.barclays.absa.banking.uat:id/value_edit_text")
	private AndroidElement Amount;

	@AndroidFindBy(xpath = "//*[contains(@text,'JEANIJ')]")
	private AndroidElement payExistingBeneficiary;

	// payFutureDatedForAnExistingBeneficiary
	@AndroidFindBy(xpath = "//*[contains(@text,'Future Dated Payment')]")
	private AndroidElement FutureDatedPayment;

	@AndroidFindBy(id = "android:id/next")
	private AndroidElement selectNextMonth;

	@AndroidFindBy(xpath = "//*[contains(@text,'15')]")
	private AndroidElement selectDate;

	@AndroidFindBy(xpath = "//*[contains(@text,'OK')]")
	private AndroidElement ok;
	
	
	
	//PayAbsaListedBeneficiaryOnceOff
	@AndroidFindBy(xpath = "//*[contains(@text,'Once-off payment')]")
	private AndroidElement onceoffpayment;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'PAY A BILL')]")
	private AndroidElement payaBill;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Institution')]")
	private AndroidElement institution;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'AA OF SA')]")
	private AndroidElement AAOFSA;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Enter name of account holder')]")
	private AndroidElement AccountHolderName;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Enter your bill account number')]")
	private AndroidElement BillAccountNumber;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Select account to pay from')]")
	private AndroidElement SelectAccountToPayfrom;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Current account (4048 2843 05)')]") // note : try with this xpath: "//*[contains(@text,'Current account (4048 2843 05)')]"
	private AndroidElement CurrentAccount;
	
// PayAbsaListedBeneficiaryNew
	@AndroidFindBy(xpath = "//*[contains(@text,'Home')]")
	private AndroidElement Home;
	
//	PayAbsaListedBeneficiaryFutureDated
	@AndroidFindBy(xpath = "//*[contains(@text,'AAOF SA')]")
	private AndroidElement payExistingBeneficiaryFutureDated;
	
	
	
	
	
	
	
	
	

	
	
	

// paynewbeneficiary

	public void paynewbeneficiary() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(paynewbeneficiary));
		Assert.assertEquals(paynewbeneficiary.getText(), "Pay new beneficiary", "check pay new beneficiary " + "<br>");  
		paynewbeneficiary.click();
		test.log(LogStatus.PASS, "paynewbeneficiary");
	}

	
	
// Pay_SomeOne
   public void beneficiaryname() throws InterruptedException {
		loadData();
        wait.until(ExpectedConditions.visibilityOf(beneficiary_name));
		Assert.assertEquals(beneficiary_name.getText(), "Enter beneficiary name",   "check beneficiary name " + "<br>");  
		String beneficiaryName = dataRow3_paynewbeneficiary.getCell(1).toString();  // getCell(0) it gets the cell data
		beneficiary_name.sendKeys(beneficiaryName);
		test.log(LogStatus.PASS, "beneficiary_name");
	}

	public void bank() throws InterruptedException {
    	wait.until(ExpectedConditions.visibilityOf(bank));
		Assert.assertEquals(bank.getText(), "Select bank",   "check Select bank " + "<br>"); 
		bank.click();
		test.log(LogStatus.PASS, "bank");
	}

	public void selectbank() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(select_bank));
	    Assert.assertEquals(select_bank.getText(), "ABSA",   "check Select bank " + "<br>"); 
		select_bank.click();
		test.log(LogStatus.PASS, "selectbank");
	}

	public void AccType() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Acc_Type));
		Assert.assertEquals(Acc_Type.getText(), "Select account type",   "check AccType in Pay" + "<br>"); 
		Acc_Type.click();
		test.log(LogStatus.PASS, "select bank");
	}

	public void selectAcc_Type() throws InterruptedException {
     	wait.until(ExpectedConditions.visibilityOf(selectAccType));
		Assert.assertEquals(selectAccType.getText(), "Cheque account",   "check selectAcc_Type in Pay" + "<br>"); 
		selectAccType.click();
		test.log(LogStatus.PASS, "select Acc Type");
	}

	public void AccNO() throws InterruptedException {
		loadData();
     	wait.until(ExpectedConditions.visibilityOf(Acc_NO));
		Assert.assertEquals(Acc_NO.getText(), "Enter account number",   "check AccNO in Pay" + "<br>"); 
		String ACC = dataRow3_paynewbeneficiary.getCell(2).toString(); 
		Acc_NO.sendKeys(ACC);
		test.log(LogStatus.PASS, "AccNO");
	}

	public void Theirreference() throws InterruptedException {
		loadData();
        wait.until(ExpectedConditions.visibilityOf(Their_reference));
		Assert.assertEquals(Their_reference.getText(), "Enter their reference",   "check Their_reference in Pay" + "<br>"); 
		String reference = dataRow3_paynewbeneficiary.getCell(3).toString(); 
		Their_reference.sendKeys(reference);
		test.log(LogStatus.PASS, "Their_reference");
	}

	public void Myreference() {
		loadData();
        wait.until(ExpectedConditions.visibilityOf(My_reference));
		Assert.assertEquals(My_reference.getText(), "Enter reference for my statement",   "check Myreference in Pay" + "<br>"); 
		String Myreference = dataRow3_paynewbeneficiary.getCell(4).toString(); 
		My_reference.sendKeys(Myreference);
		test.log(LogStatus.PASS, "My_reference");
	}

	public void enterAmount() throws InterruptedException {
		loadData();
		wait.until(ExpectedConditions.visibilityOf(enter_Amount));
		Assert.assertEquals(enter_Amount.getText(), "Enter amount",   "check enter_Amount in Pay" + "<br>"); 
		String Enteramount = dataRow3_paynewbeneficiary.getCell(5).toString();
		enter_Amount.sendKeys(Enteramount);
		test.log(LogStatus.PASS, "enterAmount");
	}
	
	public void amount() throws InterruptedException {
		loadData();
		wait.until(ExpectedConditions.visibilityOf(amount));
		Assert.assertEquals(amount.getText(), "R 0.00",   "check enter_Amount in Pay" + "<br>"); 
		String Enteramount = dataRow3_paynewbeneficiary.getCell(5).toString();
		amount.sendKeys(Enteramount);
		test.log(LogStatus.PASS, "enterAmount");
	}
	

	public void click_CurrentAccount() throws InterruptedException {
     	wait.until(ExpectedConditions.visibilityOf(click_CurrentAccount));
		click_CurrentAccount.click();
		test.log(LogStatus.PASS, "CurrentAccount");
	}

	public void select_CurrentAcc() {
		wait.until(ExpectedConditions.visibilityOf(selectCurrentAcc));
		Assert.assertTrue(selectCurrentAcc.isDisplayed());
		selectCurrentAcc.click();
		test.log(LogStatus.PASS, "select Current Acc");
	}

	public void pay_ExistingBeneficiary() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[contains(@text,'JEANIJ')")));
		payExistingBeneficiary.click();
		test.log(LogStatus.PASS, "pay an Existing Beneficiary");
	}
	
	
	
	//payFutureDatedForAnExistingBeneficiary

	public void FutureDatedPayment() 
	{
		wait.until(ExpectedConditions.visibilityOf(FutureDatedPayment));
		Assert.assertEquals(FutureDatedPayment.getText(), "Future Dated Payment","check FutureDatedPayment in payFutureDatedForAnExistingBeneficiary ");
		FutureDatedPayment.click();
		test.log(LogStatus.PASS, "Future Dated Payment");
	}
	
	
	public void selectnextmonth() 
	{
		wait.until(ExpectedConditions.visibilityOf(selectNextMonth));
		selectNextMonth.click();
		test.log(LogStatus.PASS, "select Next Month");
	}
	
	public void selectdate() 
	{
		wait.until(ExpectedConditions.visibilityOf(selectDate));
		Assert.assertEquals(selectDate.getText(), "15","check selectdate in payFutureDatedForAnExistingBeneficiary ");
		selectDate.click();
		test.log(LogStatus.PASS, "15");
	}
	
	public void oK() {
		wait.until(ExpectedConditions.visibilityOf(ok));
		Assert.assertEquals(ok.getText(), "OK","check OK in payFutureDatedForAnExistingBeneficiary ");
		ok.click();
		test.log(LogStatus.PASS, "OK");
	}
	
	
	//PayAbsaListedBeneficiaryOnceOff
	public void onceOffPayment() {
		wait.until(ExpectedConditions.visibilityOf(onceoffpayment));
		Assert.assertEquals(onceoffpayment.getText(), "Once-off payment", "check Once-off payment in Pay_AbsaListedBeneficiaryOnceOff ");
		onceoffpayment.click();
		test.log(LogStatus.PASS, "onceoffpayment");

	}
	
	public void payABill() {
		wait.until(ExpectedConditions.visibilityOf(payaBill));
		Assert.assertEquals(payaBill.getText(), "PAY A BILL", "check PAY A BILL in Absa_Listed ");
		payaBill.click();
		test.log(LogStatus.PASS, "payaBill");
	}
	 
	public void institution() {
		wait.until(ExpectedConditions.visibilityOf(institution));
		Assert.assertEquals(institution.getText(), "Institution", "check Institution in Absa_Listed ");
		institution.click();
		test.log(LogStatus.PASS, "institution");

	}
	
	public void AAOFSA() {
		wait.until(ExpectedConditions.visibilityOf(AAOFSA));
		Assert.assertEquals(AAOFSA.getText(), "AA OF SA", "check AA OF SA in Absa_Listed ");
		AAOFSA.click();
		test.log(LogStatus.PASS, "AAOFSA");
	}
	
	public void AccountHolderName() {
		loadData();
		wait.until(ExpectedConditions.visibilityOf(AccountHolderName));
		Assert.assertEquals(AccountHolderName.getText(), "Enter name of account holder", "check Enter account holder name in Absa_Listed ");
		String NameOfAccountHolder= dataRow9_PayAbsaListedBeneficiaryNew.getCell(1).toString();
		AccountHolderName.sendKeys(NameOfAccountHolder);
		test.log(LogStatus.PASS, "AccountHolderName");
	
	}
	
	public void BillAccountNumber() {
		loadData();
		wait.until(ExpectedConditions.visibilityOf(BillAccountNumber));
		Assert.assertEquals(BillAccountNumber.getText(), "Enter your bill account number", "check Enter your bill account number in Absa_Listed ");
		String billAccNo = dataRow9_PayAbsaListedBeneficiaryNew.getCell(2).toString();
		BillAccountNumber.sendKeys(billAccNo);
		test.log(LogStatus.PASS, "BillAccountNumber");
	}

	public void SelectAccountToPayfrom() {
		wait.until(ExpectedConditions.visibilityOf(SelectAccountToPayfrom));
		Assert.assertEquals(SelectAccountToPayfrom.getText(), "Select account to pay from", "check Select account to pay from in Absa_Listed ");
		SelectAccountToPayfrom.click();
		test.log(LogStatus.PASS, "SelectAccountToPayfrom");
	}

	public void CurrentAccount() {
			wait.until(ExpectedConditions.visibilityOf(CurrentAccount));
			CurrentAccount.click();
			test.log(LogStatus.PASS, "CurrentAccount");	
	}
	
	
	
	public void home() {
		wait.until(ExpectedConditions.visibilityOf(Home));
		System.out.println(Home.getText());
//		Assert.assertEquals(ok.getText(), "OK", "check OK in payFutureDatedForAnExistingBeneficiary ");
		Home.click();
		test.log(LogStatus.PASS, "Home");	
	}
	
	
	
	
}
