package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecomponents.TechnicalComponents;

public class UDINConfirmation {
	WebDriver driver;
		
	public UDINConfirmation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isPageOpened() {
		TechnicalComponents.isDisplayed(heading, "Heading");
		return true;
	}
	
	@FindBy(xpath = "//div[contains(@class,'generated-Udin')]")
	WebElement heading;
	
	@FindBy(xpath = "//p/span")
	WebElement lbl_ConfirmationNumber;
	
	public String getConfirmationNumber() {
		return TechnicalComponents.getAttribute(lbl_ConfirmationNumber, "text", "Confirmaton Number");
	}
}
