package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public dummypage landingPage;

	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public dummypage getLandingPage()
	{
	
	 landingPage= new dummypage(driver);
	 return landingPage;
	}
	
	
}
