package stepDefinitions;

import org.junit.runner.RunWith;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

@RunWith(Cucumber.class)
public class Stepdefinition extends base {
	@Given("^Intialize the browser with \"([^\"]*)\"$")
	public void intialize_the_browser_with(String browser) throws Throwable {
		System.out.println(browser);
		 driver =initializeDriver();
	}

	@Given("^Naviage to \"([^\"]*)\" Site$")
	public void naviage_to_Site(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(url);	}

	@Given("^click to login link in home page to load sign in page$")
	public void click_to_login_link_in_home_page_to_load_sign_in_page() throws Throwable {
		LandingPage l=new LandingPage(driver);
		if(l.popClose().size()>0)
		{
			l.popClose().get(0).click();
		}
		l.getLogin().click();
	}

	@When("^User enters username (.+) and password (.+)$")
    public void user_enters_username_and_password(String username, String password) throws Throwable {
		LoginPage lp=new LoginPage(driver);
System.out.println(username+" "+password);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		Thread.sleep(3000);
		lp.getLogin().click();
	}
	


	@Then("^Verify the user with successfull login$")
	public void verify_the_user_with_successfull_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PortalHomePage page=new PortalHomePage(driver);
		Assert.assertTrue(page.getSerachBox().isDisplayed());	}
}