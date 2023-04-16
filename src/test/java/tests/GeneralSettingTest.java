package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.testng.annotations.Test;

import pages.GeneralSettingPage;
import pages.HomePage;
import pages.LoginPage;

public class GeneralSettingTest extends BaseTest {
 
	 GeneralSettingPage generalSettingobjct;
	  LoginPage loginPageobjct;
	 HomePage homepageobjct;
	

	
	@Test()
	public void GetToAddKpiPage()
	{
		
		homepageobjct=new HomePage(driver);
		homepageobjct.clickOnHompageSetting();
		generalSettingobjct= new GeneralSettingPage(driver);
		generalSettingobjct.ClickOnKpiMangement();
		generalSettingobjct.clickonaddkpi();
		assertEquals(driver.getCurrentUrl(),"http://localhost:5200/#/settings/kpi-setting/add");
	}
	
}
