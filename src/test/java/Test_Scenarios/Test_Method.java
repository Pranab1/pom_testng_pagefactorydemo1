package Test_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearch;

public class Test_Method
{
	WebDriver driver;
	GoogleSearch gs;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Programs1\\pagefactorydemo\\util\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
	}
	
	@Test
	public void search() throws InterruptedException
	{
		gs = new GoogleSearch(driver);
		gs.googleSearch("pratian technologies");
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
