package MyStoreTests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class EnvironmentSetup {

	public static WebDriver driver;
	
	@BeforeClass
	public void startDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	
	@AfterClass
	public void closeDriver()
	{
		driver.quit();
	}
}
