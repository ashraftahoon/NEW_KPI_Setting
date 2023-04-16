package tests;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import pages.GeneralSettingPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UpdateKpiPage;
import utilties.JsonDataReader;

public class UpdateKpiTest extends BaseTest {

	GeneralSettingPage generalSettingobjct;
	LoginPage loginPageobjct;
	HomePage homepageobjct;
	UpdateKpiPage UpdateKpiPageObjct;


	@Test
	public void UserCanUpdateKpi() 
	{


		generalSettingobjct=new GeneralSettingPage(driver);
		generalSettingobjct.navigatetoUpdatPage();
		UpdateKpiPageObjct=new UpdateKpiPage(driver);
		UpdateKpiPageObjct.UpdateKpiTitle("ashraf");
		UpdateKpiPageObjct.Update_Bussiness_Unit_Dropdown();
		UpdateKpiPageObjct.Update_Sub_Unit_Dropdown();
		UpdateKpiPageObjct.Update_Function_Dropdown();
		UpdateKpiPageObjct.Update_kpiTypes_Dropdown();
		UpdateKpiPageObjct.Update_OwnerName();
		String actual=driver.getCurrentUrl();
		assertEquals(actual,"http://localhost:5200/#/settings/kpi-setting/update/TEST");

	}
}
