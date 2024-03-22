package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSearchPage {
	 WebDriver driver=new ChromeDriver();
	 
	
@Before("@login")
@Given("I am on HotelApp login page")
public void i_am_on_hotel_app_login_page() {
	driver.get("https://adactinhotelapp.com/");
    
}

@When("I enter username as {string}")
public void i_enter_username_as(String string) {
	 driver.findElement(By.id("username")).sendKeys(string);
}

@When("I enter password as {string}")
public void i_enter_password_as(String string) {
	driver.findElement(By.id("password")).sendKeys(string);
}

@When("I click on login button")
public void i_click_on_login_button() {
	driver.findElement(By.id("login")).click();
}

@Then("I get login successful message")
public void i_get_login_successful_message() {
	String Greeting=driver.findElement(By.id("username_show")).getAttribute("value");
}

@Given("I enter desired location on Search Hotel page as {string}")
public void i_enter_desired_location_on_search_hotel_page_as(String string) {
	
	WebElement ele= driver.findElement(By.xpath("//*[@id=\"location\"]"));
	Select select= new Select(ele);
	select.selectByVisibleText(string);
   
}

@When("I click on search button")
public void i_click_on_search_button() {
	driver.findElement(By.id("Submit")).click();
}
@After("@select")
@Then("I get successful location required")
public void i_get_successful_location_required() {
    // Write code here that turns the phrase above into concrete actions
	
}


}
