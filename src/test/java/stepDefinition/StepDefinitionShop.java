package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitionShop {
	//run the feature fie as cucumber feature,and copy given, when , then 
		WebDriver driver;
		@Given("User must be on homepage by clicking on url {string}")
		public void user_must_be_on_homepage_by_clicking_on_url(String string) {
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get(string);//url is coming from the feature file 
		}

		@When("user clicks on Signup button")
		public void user_clicks_on_signup_button() {
		    driver.findElement(By.id("signin2")).click();//element locator for signup
		}

		@Then("Signup dialog box should be displayed")
		public void signup_dialog_box_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		boolean  actual=	driver.findElement(By.cssSelector("#signInModal > div")).isDisplayed();
		
		 Assert.assertEquals(true,actual);
		}

}
