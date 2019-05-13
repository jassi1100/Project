package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecomponents.TechnicalComponents;

public class UDINForm {
	WebDriver driver;
		
	public UDINForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isPageOpened() {
		TechnicalComponents.isDisplayed(heading, "Heading");
		return true;
	}
	
	@FindBy(xpath = "//h1[contains(@class,'gen-head')]")
	WebElement heading;
	
	@FindBy(xpath = "//label[text()='Certificates']")
	WebElement radio_Certificates;
	
	@FindBy(id = "DocumentTypesSub")
	WebElement dd_TypeOfCertificate;
	
	@FindBy(id = "DocumentDate")
	WebElement date;
	
	@FindBy(xpath = "//a[contains(@class,'ui-state-highlight')]")
	WebElement currentDate;
	
	@FindBy(id ="itemName1")
	WebElement tb_Particular1;
	
	@FindBy(id="keywordName1")
	WebElement tb_Figure1;
	
	@FindBy(id = "itemName2")
	WebElement tb_Particular2;
	
	@FindBy(id = "keywordName2")
	WebElement tb_Figure2;
	
	@FindBy(id = "DocumentType2")
	WebElement tb_DocumentType;
	
	@FindBy(id = "GenerateUDINOTPbtn")
	WebElement btn_SendOTP;
	
	@FindBy(id = "generateVOtp")
	WebElement tb_OTP;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement btn_Close;
	
	@FindBy(id = "GenerateVerifyOTPBtn")
	WebElement btn_VerifyOTP;
	
	@FindBy(id = "GenerateUDINOTPBtn")
	WebElement btn_Submit;
	
	public void selectCurrentDate() {
		TechnicalComponents.scroll(date);
		TechnicalComponents.waitTill(1);
		TechnicalComponents.click_exceptional(date, "Date");
		TechnicalComponents.click(currentDate, "Current Date");
	}
	
	public void clickSubmit() {
		TechnicalComponents.click(btn_Submit, "Submit Button");
	}
	
	public void typeOTP(String OTP) {
		TechnicalComponents.scroll(tb_OTP);
		TechnicalComponents.type(tb_OTP, OTP,	"One Time Password");
	}
	
	public void clickVerifyOTP() {
		TechnicalComponents.click(btn_VerifyOTP, "Verify OTP");
	}
	
	public void selectTypeOfCertificate(String typeOfCertificate) {
		TechnicalComponents.waitTill(2);
		TechnicalComponents.selectValuefromDropdown(dd_TypeOfCertificate, "value", typeOfCertificate);
		TechnicalComponents.click(btn_Close, "Close Button");
	}
	
	public void selectCertificates() {
		TechnicalComponents.click(radio_Certificates, "Certificates Radio");
	}
	
	public void typeParticular1(String particular1) {
		TechnicalComponents.type(tb_Particular1, particular1, "Particular 1");
	}
	
	public void typeParticular2(String particular2) {
		TechnicalComponents.type(tb_Particular2, particular2, "Particular 2");
	}
	
	public void typeFigure1(String figure1) {
		TechnicalComponents.type(tb_Figure1, figure1, "Figure 1");
	}
	
	public void typeFigure2(String figure2) {
		TechnicalComponents.type(tb_Figure2, figure2, "Figure 2");
	}
	
	public void typeDocumentType(String documentType) {
		TechnicalComponents.type(tb_DocumentType,documentType,"Document Type");
	}
	
	public void clickSendOTP() {
		TechnicalComponents.click(btn_SendOTP, "Send OTP");
	}
}
