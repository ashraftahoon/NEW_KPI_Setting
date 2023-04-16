package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralSettingPage extends PageBase {
   
	WebDriverWait wait;
	public GeneralSettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	private By KpiMangementLink=By.linkText("KPIs Management");
	private By AddKpiBtn=By.xpath("//*[@id=\"main\"]/div/div[2]/app-settings/div/div/div/div/tabset/div/tab[4]/app-kpi-setting-list/div[1]/div[6]/button");
	private By displayitem=By.xpath("//mat-select[@id='mat-select-36']");
	private By displaylastitem=By.xpath("(//span [contains(text(),' 100 ')])");
	private By KpiUpdateBtn=By.xpath("(//button[@class='mat-tooltip-trigger p-button p-button-success p-mr-2 p-component p-button-icon-only'])[43]");
	 
	public void ClickOnKpiMangement()
	{
		driver.findElement(KpiMangementLink).click();
		
	}
	
	public AddKPiSettingsPage clickonaddkpi()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(AddKpiBtn).click();
		return new AddKPiSettingsPage(driver);
	}
	
	
	public UpdateKpiPage navigatetoUpdatPage()
	{

		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// Find the table element
		WebElement table = driver.findElement(By.xpath("//div[@class=\"example-container mat-elevation-z8\"]//table[@class=\"mat-table cdk-table mat-sort\"]"));

		// Find all the rows in the table and store them in a list
		List<WebElement> rows = table.findElements(By.xpath("//div[@class=\"example-container mat-elevation-z8\"]//table[@class=\"mat-table cdk-table mat-sort\"]//tbody//tr"));

		// Find the last row in the table
		WebElement lastRow = rows.get(rows.size() - 2);
		System.out.println(lastRow.getTagName());

		// Find all the columns in the last row and store them in a list
		List<WebElement> columns = lastRow.findElements(By.xpath("//div[@class=\"example-container mat-elevation-z8\"]//table[@class=\"mat-table cdk-table mat-sort\"]//tbody//child::td"));

		// Find the 9th column in the last row
		WebElement ninthColumn = columns.get(8);

		// Find the edit button in the 9th column of the last row
		WebElement editButton = ninthColumn.findElement(By.tagName("button"));

		// Click on the edit button
		editButton.click();		
	    return new UpdateKpiPage(driver);
	}
	
	
	
}
