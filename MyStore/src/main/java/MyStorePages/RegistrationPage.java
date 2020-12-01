package MyStorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends PageObject{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "id_gender1")
	WebElement MaleRadioBtn;
	
	@FindBy(id = "customer_firstname")
	WebElement FirstNameTxtField;
	
	@FindBy(id = "customer_lastname")
	WebElement LastNameTxtField;
	
	@FindBy(id = "passwd")
	WebElement PasswordTxtField;
	
	@FindBy(id = "days")
	WebElement DaysDropDownList;
	
	@FindBy(id = "months")
	WebElement MonthDropDownList;
	
	@FindBy(id = "years")
	WebElement YearsDropDownList;
	
	@FindBy(id = "firstname")
	WebElement SecondFirstNameTxtField;
	
	@FindBy(id = "lastname")
	WebElement SecondLastNameTxtField;
	
	@FindBy(id = "address1")
	WebElement AddressOneTxtField;
	
	@FindBy(id = "city")
	WebElement CityTxtField;
	
	@FindBy(id = "id_state")
	WebElement StateDropDownList;
	
	@FindBy(id = "postcode")
	WebElement PostcodeTxtField;
	
	@FindBy(id = "phone_mobile")
	WebElement MobileTxtField;
	
	@FindBy(id = "alias")
	WebElement AliasTxtField;
	
	@FindBy(id = "submitAccount")
	WebElement RegisterBtn;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
	public WebElement UserLink;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p")
	public WebElement WelcomeMssg;

	public void clickSigninBtn()
	{
		MaleRadioBtn.click();
	}
	
	public void insertFirstName(String FName)
	{
		FirstNameTxtField.sendKeys(FName);
	}
	
	public void insertLastName(String LName)
	{
		LastNameTxtField.sendKeys(LName);
	}
	
	public void insertPassword(String Pass)
	{
		PasswordTxtField.sendKeys(Pass);
	}
	
	public void selectDay(String Day)
	{
		select = new Select(DaysDropDownList);
		select.selectByValue(Day);
	}
	
	public void selectMonth(String Month)
	{
		select = new Select(MonthDropDownList);
		select.selectByValue(Month);
	}
	
	public void selectYear(String Year)
	{
		select = new Select(YearsDropDownList);
		select.selectByValue(Year);
	}
	
	public void insertSecondFirstName(String FirstName)
	{
		SecondFirstNameTxtField.sendKeys(FirstName);
	}
	
	public void insertSecondLastName(String LastName)
	{
		SecondLastNameTxtField.sendKeys(LastName);
	}
	
	public void insertAddressOne(String AddressOne)
	{
		AddressOneTxtField.sendKeys(AddressOne);
	}
	
	public void insertCity(String City)
	{
		CityTxtField.sendKeys(City);
	}
	
	public void selectState(String State)
	{
		select = new Select(StateDropDownList);
		select.selectByValue(State);
	}
	
	public void insertPostcode(String Postcode)
	{
		PostcodeTxtField.sendKeys(Postcode);
	}
	
	public void insertMobileNumber(String Mobile)
	{
		MobileTxtField.sendKeys(Mobile);
	}
	
	public void insertAlias(String Alias)
	{
		AliasTxtField.sendKeys(Alias);
	}
	
	public void clickRegister()
	{
		RegisterBtn.click();
	}
	public void test(WebElement List, String value)
	{
		if(List==DaysDropDownList)
		{
			select = new Select(DaysDropDownList);
			select.selectByValue(value);
		}
		else if(List==MonthDropDownList)
		{
			select = new Select(MonthDropDownList);
			select.selectByValue(value);
		}
		else if(List==YearsDropDownList)
		{
			select = new Select(YearsDropDownList);
			select.selectByValue(value);
		}
		else if(List==StateDropDownList)
		{
			select = new Select(StateDropDownList);
			select.selectByValue(value);
		}
	}
	public void submitRegsitrationFormAfterFillMandatoryFields(String FName, String LName, String Pass, 
			String Day, String Month, String Year,  
			String AddressOne, String City, String State, String Postcode,String Mobile, String Alias) {
		MaleRadioBtn.click();
		FirstNameTxtField.sendKeys(FName);
		LastNameTxtField.sendKeys(LName);
		PasswordTxtField.sendKeys(Pass);
		test(DaysDropDownList, Day);
		test(MonthDropDownList, Month);
		test(YearsDropDownList, Year);
		AddressOneTxtField.sendKeys(AddressOne);
		CityTxtField.sendKeys(City);
		test(StateDropDownList, State);
		PostcodeTxtField.sendKeys(Postcode);
		MobileTxtField.sendKeys(Mobile);
		AliasTxtField.clear();
		AliasTxtField.sendKeys(Alias);
		RegisterBtn.click();
		
	}

}
