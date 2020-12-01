package MyStoreTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataDrivenReader.ReadPropertiesFile;
import MyStorePages.HomePage;
import MyStorePages.SignInPage;

public class LoginPageTests extends EnvironmentSetup{

	HomePage homePageObj;
	SignInPage SignInPageObj;
	
	
	String Email = ReadPropertiesFile.RegistrationData.getProperty("Email");
	String Pass = ReadPropertiesFile.RegistrationData.getProperty("Pass");
	

	@Test
	public void TC_13() throws InterruptedException
	{
		homePageObj = new HomePage(driver);
		SignInPageObj = new SignInPage(driver);
		
		homePageObj.clickSigninBtn();
		SignInPageObj.insertUserCredentialsAndclickSignInBtn(Email, Pass);
		
		Assert.assertTrue(SignInPageObj.ErrorMssg.getText().contains("Invalid email"));		
		
	}
}
