package MyStorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageObject{

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "email_create")
	WebElement NewEmailTextField;
	
	@FindBy(id = "SubmitCreate")
	WebElement CreateAccountBtn;
	
	@FindBy(id = "email")
	WebElement EmailTextField;
	
	@FindBy(id = "passwd")
	WebElement PasswordTextField;
	
	@FindBy(id = "SubmitLogin")
	WebElement SignInBtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li")
	public WebElement ErrorMssg;
	
	public void insertNewEmail(String Email)
	{
		NewEmailTextField.sendKeys(Email);
	}
	
	public void clickCreateAccountBtn()
	{
		CreateAccountBtn.click();
	}
	
	public void insertEmail(String Email)
	{
		EmailTextField.sendKeys(Email);
	}
	
	public void insertPassword()
	{
		PasswordTextField.click();
	}
	
	public void insertEmailAndclickCreateAccountBtn(String Email)
	{
		NewEmailTextField.sendKeys(Email);
		CreateAccountBtn.click();
	}
	
	public void insertUserCredentialsAndclickSignInBtn(String Email, String Pass)
	{
		EmailTextField.sendKeys(Email);
		PasswordTextField.sendKeys(Pass);
		SignInBtn.click();
	}

}
