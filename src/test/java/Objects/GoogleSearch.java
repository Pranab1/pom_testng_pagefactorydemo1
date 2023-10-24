package Objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch 
{
	WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@name='q']") WebElement searchBar;
	
	@FindBy(xpath="(//input[@value='Google Search'])[1]") WebElement searchBtn;
	
	public void googleSearch(String searchInput) throws InterruptedException
	{
		searchBar.sendKeys(searchInput);
		Thread.sleep(5000);
		
		searchBtn.click();
		Thread.sleep(5000);
		
		
	}

}
