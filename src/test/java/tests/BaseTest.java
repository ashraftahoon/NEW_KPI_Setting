package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GeneralSettingPage;
import utilties.Helper;

public class BaseTest {
   
	 public static WebDriver driver;
	
	@BeforeSuite(alwaysRun = true)
	public void SetUp()
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(chromeOptions);
		driver.get("http://localhost:5200/#/login?returnUrl=%2Fhome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	}
	
	//take screenshot when test case faile and put it in screenshoots folder
//	@AfterMethod
//	public void screenshotOnFailure(ITestResult result)
//	
//	{
//		
//		
//		if (result.getStatus()==ITestResult.FAILURE) {
//			System.out.println("fails");
//			Helper.CaptureScreenshot(driver, result.getName());
//		}
		
}
