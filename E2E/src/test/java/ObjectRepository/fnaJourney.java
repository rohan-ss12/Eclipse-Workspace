package ObjectRepository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import E2E.E2E.BaseClass;

public class fnaJourney extends BaseClass{
	
	WebDriver driver;
	
	
	public fnaJourney(WebDriver driver) {
		
		this.driver = driver;
	}

	
	
	By fnaNextButton = By.xpath("//span[contains(text(),'NEXT')]");
	By lifeStage = By.xpath("//div[contains(text(),'Single')]");
	By financialGoal = By.xpath("//p[contains(text(),'Regular')]");
	By riskProfile = By.xpath("//h1[contains(text(),'Balanced')]");
	By productSelect = By.xpath("//h1[contains(text(),'PNB MetLife Immediate Annuity Plan')]/following-sibling::div");
	
	By biNextButton = By.xpath("(//button[contains(text(),'NEXT')])[last()]");
	By educationSelect = By.xpath("//div[contains(text(),'Post Graduate & Above')]");
	By occupationSelect = By.xpath("//div[contains(text(),'Professional')]");
	By customerProfile = By.xpath("(//p[contains(text(),'"+prop.getProperty("cutomerProfile")+"')])");
	By stateInputField = By.xpath("//input[contains(@placeholder,'State')]");
	By stateSelect = By.xpath("//span[contains(text(),'Maharashtra')]");
	By backdateSelection = By.xpath("//span[contains(text(),'No')]");
	
	//PO Objects in case of Insured case
	By poSalutation = By.xpath("//div[contains(text(),'Mr.')]");
	By poFirstName = By.xpath("(//p[contains(text(),'What is Policy Owner')]/ancestor::div//input[contains(@id,'firstName')])[last()]");
	By poLastName = By.xpath("(//p[contains(text(),'What is Policy Owner')]/ancestor::div//input[contains(@id,'lastName')])[last()]");
	By poGender = By.xpath("(//h1[contains(text(),'Gender')]/ancestor::div/following-sibling::div//span[contains(text(),'Male')])[last()]");
	By poDOB = By.xpath("(//input[@placeholder='Date of Birth'])[last()]");
	By poOccupation = By.xpath("(//div[contains(text(),'Professional')])[last()]");
	By poEducation = By.xpath("(//div[contains(text(),'Professional')])[last()]");
	
	
	
	public WebElement fnaNextClick() {
		
		
		return driver.findElement(fnaNextButton);
	}
	
	public WebElement lifeStageClick() {
		
		return driver.findElement(lifeStage);
	}
	
	public WebElement financialGoalClick() {
		
		return driver.findElement(financialGoal);
	}

	public WebElement riskProfileClick() {
	
		return driver.findElement(riskProfile);

	}
	

	public WebElement productSelectClick() {
	
		return driver.findElement(productSelect);

	}

	public WebElement biNextButtonClick() {
	
		return driver.findElement(biNextButton);

	}

	public WebElement educationSelectClick() {
	
		return driver.findElement(educationSelect);

	}

	public WebElement occupationSelectClick() {
	
		return driver.findElement(occupationSelect);

	}

	public WebElement customerProfileClick() {
	
		return driver.findElement(customerProfile);

	}

	public WebElement stateInputFieldClick() {
	
		return driver.findElement(stateInputField);

	}

	public WebElement stateSelectClick() {
	
		return driver.findElement(stateSelect);

	}

	public WebElement backdateSelectionClick() {
	
		return driver.findElement(backdateSelection);

	}


}
