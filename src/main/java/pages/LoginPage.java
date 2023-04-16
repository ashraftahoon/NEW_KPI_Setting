package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
	
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	private By InputEmail= By.xpath("//input[@type='text']");
	private By InputPassword= By.xpath("//input[@type='password']");
	private By loginbtn= By.xpath("//button[@class='btn btn-primary']");
	
	public void SetEmail(String mail)
	{
		driver.findElement(InputEmail).sendKeys(mail);
	}
	
	public void SetPassword(String pass)
	{
		driver.findElement(InputPassword).sendKeys(pass);
	}
	
	public HomePage ClickLoginPage()
	{
		driver.findElement(loginbtn).click();
		return new HomePage(driver);
	}

}
