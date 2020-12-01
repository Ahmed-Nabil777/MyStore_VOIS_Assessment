package MyStorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObject {
	
	
	protected WebDriver driver;
	public Select select;
	
	
	public PageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
