package change;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class catagories {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is on the website's homepage")
	public void the_user_is_on_the_website_s_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	    
	}

	@When("the user selects the category at index {int}")
	public void the_user_selects_the_category_at_index(Integer int1) throws InterruptedException {
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
        searchBox.sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div[class=\"gh-header__logo-cats-wrap\"]")).click();
        wait.until(ExpectedConditions.urlToBe("https://www.ebay.com/"));
        Thread.sleep(2000);
	  
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		 
	   
	}

	@And("the search results should be filtered by the selected category")
	public void the_search_results_should_be_filtered_by_the_selected_category() {
	    
	}

	@Then("the search results should be filtered by the newly selected category")
	public void the_search_results_should_be_filtered_by_the_newly_selected_category() {
	    
	}




}
