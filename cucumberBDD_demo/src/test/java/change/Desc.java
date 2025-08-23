package change;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Desc {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("the user is on the website's search page")
	public void the_user_is_on_the_website_s_search_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
	}

	@When("the user searches for {string}")
	public void the_user_searches_for(String string) {
		By search = null;
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys("Apple MacBook Pro 13 16GB RAM");
		driver.findElement(search).sendKeys(Keys.ENTER);
		WebElement product = driver.findElement(By.partialLinkText("Apple MacBook Pro 13 RETINA INTEL CORE 16GB RAM 1TB SSD"));
		String url = product.getAttribute("href");
		driver.get(url);
		
	}

	@And("the user selects the {string} from the results")
	public void the_user_selects_the_from_the_results(String string) {
		
	    
	    
	}

	@Then("the user should be on the product description page for that item")
	public void the_user_should_be_on_the_product_description_page_for_that_item() {
	    
	}


}
