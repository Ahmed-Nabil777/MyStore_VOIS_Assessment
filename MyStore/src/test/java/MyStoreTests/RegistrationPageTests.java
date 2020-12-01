package MyStoreTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataDrivenReader.ReadPropertiesFile;
import MyStorePages.HomePage;
import MyStorePages.RegistrationPage;
import MyStorePages.SignInPage;

public class RegistrationPageTests extends EnvironmentSetup

{	
	HomePage homePageObj;
	SignInPage SignInPageObj;
	RegistrationPage RegistrationPageObj;
	
	String FName = ReadPropertiesFile.RegistrationData.getProperty("FName");
	String LName = ReadPropertiesFile.RegistrationData.getProperty("LName");
	String NewEmail = ReadPropertiesFile.RegistrationData.getProperty("NewEmail");
	String Pass = ReadPropertiesFile.RegistrationData.getProperty("Pass");
	String Day = ReadPropertiesFile.RegistrationData.getProperty("Day");
	String Month = ReadPropertiesFile.RegistrationData.getProperty("Month");
	String Year = ReadPropertiesFile.RegistrationData.getProperty("Year");
	String AddressOne = ReadPropertiesFile.RegistrationData.getProperty("AddressOne");
	String City = ReadPropertiesFile.RegistrationData.getProperty("City");
	String State = ReadPropertiesFile.RegistrationData.getProperty("State");
	String Postcode = ReadPropertiesFile.RegistrationData.getProperty("Postcode");
	String Mobile = ReadPropertiesFile.RegistrationData.getProperty("Mobile");
	String Alias = ReadPropertiesFile.RegistrationData.getProperty("Alias");

	@Test
	public void TC_18() throws InterruptedException 
	//Check the behavior of the system after filling all the mandatory fields and leave the optional ones then click register


	{
		homePageObj = new HomePage(driver);
		SignInPageObj = new SignInPage(driver);
		RegistrationPageObj = new RegistrationPage(driver);
		
		homePageObj.clickSigninBtn();
		SignInPageObj.insertEmailAndclickCreateAccountBtn(NewEmail);
		
		RegistrationPageObj
		.submitRegsitrationFormAfterFillMandatoryFields(FName, LName, Pass, Day, Month, Year, AddressOne , City , State, Postcode, Mobile, Alias);
		
		Assert.assertTrue(RegistrationPageObj.UserLink.getText().contains(FName));
		Assert.assertTrue(RegistrationPageObj.WelcomeMssg.getText().contains("Welcome to your account"));
		
		
	}
}
