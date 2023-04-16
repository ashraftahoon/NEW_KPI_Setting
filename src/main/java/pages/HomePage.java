package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {

	
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}


	private By generalsettinglink= By.xpath("//i[@class='nav-icon icon-settings ng-star-inserted']");
	
	public  GeneralSettingPage   clickOnHompageSetting()
	{
		driver.findElement(By.xpath("//*[@class=\"sidebar-minimizer\"]")).click();
		WebElement leftScrollBar = driver.findElement(By.xpath("//*[@class=\"sidebar-nav ps ps--active-y\"]"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		wait.until(ExpectedConditions.elementToBeClickable((leftScrollBar)));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollTop += arguments[0].offsetHeight;", leftScrollBar);




		driver.findElement(generalsettinglink).click();
		return new GeneralSettingPage(driver);
	}
	
	
	
	

}
