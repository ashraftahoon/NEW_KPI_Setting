package tests;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilties.JsonDataReader;

public class LoginTest extends BaseTest {
     
	 LoginPage loginPageobjct;
	
	@Test
	public void testsuccessfulllogin() throws FileNotFoundException, IOException, ParseException
	{
		JsonDataReader jsonReader= new JsonDataReader("\\src\\test\\java\\data\\logindata.json");
		JSONArray KPIData=jsonReader.getJsonArray();
		for(int i=0;i<KPIData.size();i++)
		{
			JSONObject login=(JSONObject) KPIData.get(i);
			String  username=(String) login.get("username");
			String  password=(String) login.get("password");

			loginPageobjct=new LoginPage(driver);
			loginPageobjct.SetEmail(username);
			loginPageobjct.SetPassword(password);
			loginPageobjct.ClickLoginPage();
			assertEquals(driver.getTitle(),"CEO Dashboard");
			
		}
	}
	
}
