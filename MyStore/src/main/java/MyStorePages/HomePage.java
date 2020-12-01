package MyStorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "Sign in")
	WebElement SigninBtn;
	
	
	public void clickSigninBtn()
	{
		SigninBtn.click();
	}

}
