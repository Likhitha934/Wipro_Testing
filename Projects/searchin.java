package change;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchin {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    
	}

	@When("the user searches for a list of products")
	public void the_user_searches_for_a_list_of_products() {
		WebElement searchBox;
		  ArrayList<String> products = new ArrayList<>();
	      products.add("Watch");
	      products.add("Laptop");
	      products.add("Phone");

	      for (String product : products) {
	          searchBox = driver.findElement(By.id("gh-ac"));
	          searchBox.clear();
	          searchBox.sendKeys(product);
	          searchBox.sendKeys(Keys.ENTER);
	      }
	    
	}

	@Then("the search results for each product should be displayed")
	public void the_search_results_for_each_product_should_be_displayed() {
	    
	}



	

}
