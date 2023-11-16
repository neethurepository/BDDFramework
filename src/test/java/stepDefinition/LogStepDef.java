package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LogStepDef {
	WebDriver driver;
	@Given("User must be on homepage by clicking url {string}") //given is precondition
	public void user_must_be_on_homepage_by_clicking_url(String string) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);//use url from feature file
	   
	}
	

	@When("^Enter valid (.*) and (.*)$")//replace username and password with(.*), also when using parametrization start with ^ and ened with$
	public void enter_valid_username_and_password(String username, String password) throws InterruptedException {
	    driver.findElement(By.id("username")).sendKeys(username);//for login
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys(password);//for password
	    
	}

	@When("Click on Signin button")
	public void click_on_signin_button() {
	    driver.findElement(By.id("log-in")).click();
	}

	@Then("user must be navigated to his or her account")
	public void user_must_be_navigated_to_his_or_her_account() {
	String actual=    driver.getTitle(); //verify using Title Fter login
	Assert.assertEquals("ACME demo app", actual);
}}
