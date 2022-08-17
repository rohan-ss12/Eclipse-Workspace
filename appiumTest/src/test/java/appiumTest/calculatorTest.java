
package appiumTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class calculatorTest {
	
	static AndroidDriver<MobileElement> driver; 

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		setDesiredCaps();
		loginToSmartFriend();
		createQuoteEBranchNXT();
		customerOnBoardingPage();
		productSelection();
		
			

	}
	
	public static void setDesiredCaps() throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid","emulator-5554");
		caps.setCapability("platformName","Android");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("noReset",false);
		caps.setCapability("fullReset",true);
		caps.setCapability("app", "D:\\QualitiaProjects\\Application Files\\Smart-Friend-Debug-V57.apk");
		caps.setCapability("appActivity","com.pmli.smartfriend.MainActivity");
		caps.setCapability("appPackage","com.pmli.smartfriend");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("autoAcceptAlerts", true);
		URL url = new URL("http://127.0.0.1:8201/wd/hub/");
		driver = new AndroidDriver<MobileElement>(url,caps);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println("Application Started");
			
	}
	
	
	
	
	public static void fetchOTP() throws Exception{
		
//		MobileElement stringOTPtoSplit = driver.findElement(By.xpath("//android.view.View[contains(@text,'OTP -')]"));
//		String OTPtoSplit = stringOTPtoSplit.getText();
		
		MobileElement OTP = driver.findElement(By.xpath("//android.view.View[contains(@text,'OTP -')]"));
		OTP.click();
		String OTPText = OTP.getText();
		String finalOTP = SplitOTP(OTPText);

		System.out.println(finalOTP);
		char[] arr = new char [finalOTP.length()];
		
		for (int i=0;i<finalOTP.length();i++) {
			arr[i] = finalOTP.charAt(i);
			String s = Character.toString(arr[i]);
			MobileElement OTPset = driver.findElement(By.xpath("//android.widget.EditText[@index=("+i+")]"));
			OTPset.sendKeys(s);
		}
		MobileElement Submit = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'SUBMIT')]"));
		Submit.click();
		
	}
	
	public static String SplitOTP(String OTPText) throws Exception {

		String str = OTPText;
		String[] arrOfStr = str.split("-", 3);



		// for (String a : arrOfStr)
		// System.out.println(a);
		System.out.println(arrOfStr[2]);

		return(arrOfStr[2]);


	}
		
	
	public static void loginToSmartFriend() throws Exception{		
		
		MobileElement loginID = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='mat-input-0']"));
		loginID.sendKeys("1039997");
		
		MobileElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='mat-input-1']"));
		password.sendKeys("Metlife_1");

		MobileElement signInButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'SIGN IN')]"));
		signInButton.click();
		
		System.out.println("Logged in successfully");
		
		fetchOTP();
		
		MobileElement eBranchButton = driver.findElement(By.xpath("//android.widget.Image[contains(@text,'ebranchnxt')]"));
		eBranchButton.click();
		
		System.out.println("Launched the ebranch NXT app");

		Thread.sleep(50000);
		MobileElement createQuote = driver.findElement(By.xpath("//android.view.View[contains(@text,'Create Quote')]"));
		createQuote.click();
		
		System.out.println("Apps got switched successfully");
		
		
		Thread.sleep(3000);
	}
	
	
	
//	public static void loginToSmartFriend1() throws InterruptedException{
//		
//		
//		Thread.sleep(10000);
//		
////To get the available window handles		
//		Set<String> contextNames = driver.getContextHandles();
//		String webView = (String) contextNames.toArray()[1];
//		//String nativeView = (String) contextNames.toArray()[0];
//		
//		driver.context("WEBVIEW_com.pmli.smartfriend");
//		
//		
//		MobileElement loginID = driver.findElement(By.xpath("//input[contains(@placeholder,'User ID')]"));
//		loginID.sendKeys("1039997");
//		
//		MobileElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
//		password.sendKeys("Metlife_1");
//		
//		MobileElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Login')or contains(text(),'SIGN IN')]"));
//		signInButton.click();
//		
//		Thread.sleep(3000);
//		
//		System.out.println("Logged in successfully");
//		
//		Thread.sleep(15000);
//		
//		MobileElement eBranchButton = driver.findElement(By.xpath("//img[contains(@src,'ebranchnxt')]"));
//		eBranchButton.click();
//		
//		System.out.println("Launched the ebranch NXT app");
//
//		Thread.sleep(25000);
//		
//		driver.context("WEBVIEW_com.pmli.smartfriend").close();
//		System.out.println("Smart Friend is getting closed");
//		Thread.sleep(60000);
//		
//		Set<String> contextNames1 = driver.getContextHandles();
//		for (String contextName1 : contextNames1) {
//			System.out.println(contextNames1);
//		}
//		
//		//String webView1 = (String) contextNames1.toArray()[2];
//	
//		driver.context("WEBVIEW_com.pmli.ebranchnxt");
//		
//		MobileElement createQuote = driver.findElement(By.xpath("//span[text()='Create Quote']"));
//		createQuote.click();
//		
//		System.out.println("Apps got switched successfully");
//				
//		
//		Thread.sleep(3000);
//	}
	
	
	
	public static void createQuoteEBranchNXT() throws InterruptedException{
		
//		MobileElement permissionPopUP1 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'WHILE USING THE APP')]"));
//		permissionPopUP1.click();
//		
//		MobileElement permissionPopUP2 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'ALLOW')]"));
//		permissionPopUP2.click();
		
//		MobileElement createQuote = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Create Quote')]"));
//		createQuote.click();
		
		MobileElement leadDOB = driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'DD/MM/YYYY')]"));
//		leadDOB.click();
		leadDOB.sendKeys("10/10/1990");
		
		MobileElement leadMobileNumber = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='formly_2_input_newCusMobileNum_0']"));
		leadMobileNumber.click();
		leadMobileNumber.sendKeys("9090909090");
		
		MobileElement manualEKYCButton = driver.findElement(By.xpath("//android.widget.Button[@text='Manual KYC']"));
		manualEKYCButton.click();
		
		
	}
	
	public static MobileElement clickOnNextButton() {
		
		MobileElement nextButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
		return nextButton;
	}
	
	public static void customerOnBoardingPage() throws InterruptedException{
		
		MobileElement leadSalutationField = driver.findElement(By.xpath("//android.widget.ListView[contains(@text,'Salutation')]"));
		leadSalutationField.click();
		
		//To select Salutation form drop down
		
//		Set<String> contexts = driver.getContextHandles();
//		driver.context((String) contexts.toArray()[1]);
		
		MobileElement leadSalutationSelect = driver.findElement(By.xpath("//android.view.View[contains(@text,'Mr.')]"));
		leadSalutationSelect.click();
		
		MobileElement leadFirstName = driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'firstName')]"));
		leadFirstName.sendKeys("Tony");
		
		
		
		MobileElement leadLastName = driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'lastName')]"));
		leadLastName.sendKeys("Stark");
		
//		String scrolltoGender = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Gender *\").instance(0))";
//		driver.findElementByAndroidUIAutomator(scrolltoGender).click();
//		
		String scrolltoGender = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Gender *\").instance(0))";
		driver.findElementByAndroidUIAutomator(scrolltoGender).click();
		
//		MobileElement leadGenderField = driver.findElement(By.xpath("//android.widget.ListView[contains(@text,'Gender')]"));
//		leadGenderField.click();
		
		MobileElement leadGenderSelect = driver.findElement(By.xpath("//android.view.View[contains(@text,'Male')]"));
		leadGenderSelect.click();
		
		MobileElement pnbLogo = driver.findElement(By.xpath("//android.widget.Image[@text='pnbLogo']"));
		pnbLogo.click();
		
		String nextButtonScroll = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Next\").instance(0))";
		driver.findElementByAndroidUIAutomator(nextButtonScroll).click();
		
		Thread.sleep(3000);
		
		pnbLogo.click();
		
//		String scrolltoSourcingType = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Sourcing Type *\").instance(0))";
//		
//		driver.findElementByAndroidUIAutomator(scrolltoSourcingType).click();
		
		
		MobileElement leadSourcingTypeField = driver.findElement(By.xpath("//android.widget.ListView[contains(@text,'Sourcing Type')]"));
		
		pnbLogo.click();
		
		leadSourcingTypeField.click();
		
		MobileElement leadSourcingTypeSelect = driver.findElement(By.xpath("//android.view.View[contains(@text,'Face to face')]"));
		leadSourcingTypeSelect.click();
		
		MobileElement leadAnnualIncome = driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'Annual Income')]"));
		leadAnnualIncome.sendKeys("1000000");
	
		MobileElement leadEmailIdIncome = driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'email')]"));
		leadEmailIdIncome.sendKeys("rr.rr@rr.rr");
		
		MobileElement customerOnBoradingNextButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Next')]"));
		customerOnBoradingNextButton.click();
		
		MobileElement lifeStage = driver.findElement(By.xpath("(//android.view.View[contains(@text,'Newly Married')])[1]"));
		lifeStage.click();
		
//		MobileElement lifeStageNextButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		lifeStageNextButton.click();
		
		clickOnNextButton().click();
		
		MobileElement financialProfile = driver.findElement(By.xpath("//android.view.View[contains(@text,'Regular Income')]"));
		financialProfile.click();
		
//		MobileElement financialProfileNextButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		financialProfileNextButton.click();
		
		clickOnNextButton().click();
		
		MobileElement riskProfileSelection = driver.findElement(By.xpath("//android.view.View[contains(@text,'Balanced')]"));
		riskProfileSelection.click();
		
//		MobileElement riskProfileNextButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		riskProfileNextButton.click();
		
		clickOnNextButton().click();
			
	}
	
	public static void productSelection() throws InterruptedException{
		
		MobileElement productSelect = driver.findElement(By.xpath("//android.view.View[contains(@text,'PNB MetLife Immediate Annuity Plan')]/following-sibling::android.view.View/android.widget.Button"));
		productSelect.click();
		clickOnNextButton().click();
		
//		MobileElement productSelectNextButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		productSelectNextButton.click();
		
		
//		Code to select product again on next page
//		MobileElement productSelect2 = driver.findElement(By.xpath("//android.view.View[contains(@text,'PNB MetLife Immediate Annuity Plan')]/following-sibling::android.view.View/android.widget.Button"));
//		productSelect2.click();
//		
//		MobileElement productSelectNextButton1 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		productSelectNextButton1.click();
		Thread.sleep(5000);
		clickOnNextButton().click();
//		MobileElement moreButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'More')]"));
//		
//		
//		moreButton.click();
		MobileElement selectOccupation = driver.findElement(By.xpath("//android.view.View[contains(@text,'Post Graduate & Above')]"));
		selectOccupation.click();
//		MobileElement productSelectNextButton2 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		productSelectNextButton2.click();
		
		clickOnNextButton().click();
		
//		moreButton.click();
		MobileElement selectEducation = driver.findElement(By.xpath("//android.view.View[contains(@text,'Professional')]"));
		selectEducation.click();
//		MobileElement productSelectNextButton3 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		productSelectNextButton3.click();
		clickOnNextButton().click();
		
		MobileElement pIpOSelection = driver.findElement(By.xpath("//android.view.View[contains(@text,'Both')]"));
		pIpOSelection.click();
//		MobileElement productSelectNextButton4 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		productSelectNextButton4.click();
		clickOnNextButton().click();
		
		MobileElement State = driver.findElement(By.xpath("//android.view.View[contains(@text,'State')]"));
		State.click();
		MobileElement StateSearch = driver.findElement(By.xpath("//android.view.View[contains(@text,'State')]/following-sibling::android.widget.EditText"));
		StateSearch.sendKeys("Maharashtra");
		MobileElement StateSelection = driver.findElement(By.xpath("//android.view.View[contains(@text,'Maharashtra')]"));
		StateSelection.click();
//		MobileElement NextButton4 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		NextButton4.click();
		clickOnNextButton().click();
	
		Thread.sleep(3000);
//		Annual Income Next Button
//		MobileElement NextButton5 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		NextButton5.click();
//		clickOnNextButton().click();
	
		MobileElement BackDateSelection = driver.findElement(By.xpath("//android.view.View[contains(@text,'No')]"));
		BackDateSelection.click();
//		MobileElement NextButton6 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		NextButton6.click();
		clickOnNextButton().click();
		
//		MobileElement NextButton7 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		NextButton7.click();
		clickOnNextButton().click();
		
//		MobileElement NextButton8 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
//		NextButton8.click();
		clickOnNextButton().click();
		
		MobileElement ProceedButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'PROCEED')]"));
		ProceedButton.click();
		
		Thread.sleep(3000);
		
		MobileElement GetThisPlanButton = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'GET THIS PLAN')]"));
		GetThisPlanButton.click();
		
	
		MobileElement reviewPlanNextButton = driver.findElement(By.xpath("//android.view.View[contains(@text,'Next')]"));
		reviewPlanNextButton.click();
		
		MobileElement sPOfflineFlow = driver.findElement(By.xpath("//android.view.View[contains(@text,'Offline Process')]/../preceding-sibling::android.view.View/android.widget.Button"));
		sPOfflineFlow.click();
		
		MobileElement customerOfflineFlow = driver.findElement(By.xpath("//android.view.View[contains(@text,'Offline Process')]/following-sibling::android.widget.Button"));
		customerOfflineFlow.click();
		
		MobileElement NextButton9 = driver.findElement(By.xpath("//android.widget.Button[contains(@text,'NEXT')]"));
		NextButton9.click();
		
		
		
	}
	
	
	
	

}
