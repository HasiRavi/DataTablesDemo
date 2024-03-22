package stepDefinitions;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppLogin {
	WebDriver driver;
	
	@Given("I am on the Hotel login page")
	public void i_am_on_the_hotel_login_page() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	}

//	@When("I enter credentials to login")
////	public void i_enter_credentials_to_login(io.cucumber.datatable.DataTable dataTable) {
////	    // Write code here that turns the phrase above into concrete actions
////	    // For automatic transformation, change DataTable to one of
////	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
////	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
////	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
////	    //
////	    // For other transformations you can register a DataTableType.
////		List<List<String>> data=dataTable.cells();
////		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
////		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
////		driver.findElement(By.id("login")).click();
////	}
	
	@When("I enter credentials to login")
	public void i_enter_credentials_to_login(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		for(Map<String, String> data:dataTable.asMaps(String.class,String.class)) {
			driver.findElement(By.id("username")).sendKeys(data.get("username"));
			driver.findElement(By.id("password")).sendKeys(data.get("password"));
			driver.findElement(By.id("login")).click();
			System.out.println("Helooo");
			
			
		}
	}

	@Then("I logged in successfully")
	public void i_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String Greeting=driver.findElement(By.id("username_show")).getAttribute("value");
		System.out.println("Jenkins running sucesss");
	}

}
