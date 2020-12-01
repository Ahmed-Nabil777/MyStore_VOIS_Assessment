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
	//check if system inform user with the invalid email inserted in case of inserting invalid email format and correct password and click login

	{
		homePageObj = new HomePage(driver);
		SignInPageObj = new SignInPage(driver);
		
		homePageObj.clickSigninBtn();
		SignInPageObj.insertUserCredentialsAndclickSignInBtn(Email, Pass);
		
		Assert.assertTrue(SignInPageObj.ErrorMssg.getText().contains("Invalid email"));		
		
	}
}
