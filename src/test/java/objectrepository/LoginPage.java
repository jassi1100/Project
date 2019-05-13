package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecomponents.TechnicalComponents;

public class LoginPage {
	WebDriver driver;
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement tb_LoginId;
	
	@FindBy(id = "exampleInputPassword1")
	WebElement tb_Password;
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement btn_Login;
	
	public void typeLogin(String loginId) {
		TechnicalComponents.type(tb_LoginId, loginId, "Login Id");
	}
	
	public void typePassword(String pwd) {
		TechnicalComponents.type(tb_Password, pwd, "Password");
	}
	
	public void clickLogin() {
		TechnicalComponents.click(btn_Login, "Login Button");
	}
	
}
