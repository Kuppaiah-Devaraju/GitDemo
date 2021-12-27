package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {

	WebDriver driver;

	public PortalHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By search=By.name("query");
	

	
	public WebElement getSerachBox() {
		WebElement searchB=driver.findElement(search);
		return searchB;
	}
	
	
	
}
