package reusablecomponents;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;

import com.relevantcodes.extentreports.LogStatus;

import config.FrameworkException;
import objectrepository.LoginPage;
import objectrepository.UDINConfirmation;
import objectrepository.UDINForm;

public class BusinessComponents extends TechnicalComponents{
	
	public void enterLoginDetails(String loginId, String password) {
		try {
			LoginPage page = new LoginPage(driver);
			page.typeLogin(loginId);
			page.typePassword(password);
			page.clickLogin();
			
		}catch(FrameworkException e) {
			enterLoginDetails(loginId, password);
		}
		
	}
	
	
	
	public void verifyRedirection(String redirectTo) {
		try {
			boolean redirectSuccess = false;
			switch(redirectTo.toLowerCase()) {
			case "udin form":
				UDINForm udin = new UDINForm(driver);
				redirectSuccess = udin.isPageOpened();
				break;
				
			case "udin confirmation":
				UDINConfirmation confirm = new UDINConfirmation(driver);
				redirectSuccess = confirm.isPageOpened();
				break;
			default:
				throw new FrameworkException(redirectTo + " is not configured. Please contact Jasdeep");
			}
			if(redirectSuccess) {
				logger.log(LogStatus.PASS, "Redirected to " + redirectTo);
			}
		}catch(FrameworkException e) {
			verifyRedirection(redirectTo);
		}
		
	}
	
	public void enterUDINDetails(String particular1, String figure1, String particular2, String figure2,
			String documentType) {
		try {

			UDINForm udin = new UDINForm(driver);
			udin.selectCertificates();
			udin.selectTypeOfCertificate("Others");
			udin.selectCurrentDate();
			udin.typeParticular1(particular1);
			udin.typeFigure1(figure1);
			udin.typeParticular2(particular2);
			udin.typeFigure2(figure2);
			udin.typeDocumentType(documentType);
			udin.clickSendOTP();
			String OTP = getOTPFromEmail();
			udin.typeOTP(OTP);
			//infoBox("Confirm that correct PIN is entered-" + OTP,"INFO");
			udin.clickVerifyOTP();
			udin.clickSubmit();
		}catch(FrameworkException e) {
			enterUDINDetails(particular1, figure1, particular2, figure2, documentType);
		}
		
	}
	
	public String getOTPFromEmail() {
		try {
			return StringUtils.substringBetween(getEmailContent("noreply@udin.icai.org", "UDIN OTP"), "request: ", "Do").trim();
		}catch(Exception e) {
			return getOTPFromEmail();
		}
		//return StringUtils.substringBetween(.replaceAll("\\D+",""));
		
	}
	
	public String getConfirmationNumber() {
		try {

			UDINConfirmation confirm = new UDINConfirmation(driver);
			return confirm.getConfirmationNumber();
		}catch(FrameworkException e) {
			return getConfirmationNumber();
		}
	}
	
	public void infoBox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
