package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("^user navigates to demo\\.opencart$")
	public void user_navigates_to_demo_opencart() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/login"); 
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("input-email")).sendKeys(arg1);
	    driver.findElement(By.id("input-password")).sendKeys(arg2);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click(); 
	    //throw new PendingException();
		//System.out.println("inside when block");
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		
	}

	@Given("^user search the item$")
	public void user_search_the_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on the the add to cart button$")
	public void click_on_the_the_add_to_cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^item added successfully in the cart$")
	public void item_added_successfully_in_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
