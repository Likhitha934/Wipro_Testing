package change;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Category {
	WebDriver driver;
	WebDriverWait wait;
	@When("the user clicks on the {string} link or button")
	public void the_user_clicks_on_the_link_or_button(String string) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	    
	}

	@And("the user clicks on the {string} category")
	public void the_user_clicks_on_the_category(String string) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class=\"gh-categories__title\"]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Electronics"))).click();
        driver.findElement(By.cssSelector("div[class=\"gh-header__logo-cats-wrap\"]")).click();
        wait.until(ExpectedConditions.urlToBe("https://www.ebay.com/"));
	}

	@Then("the user should be taken to the {string} category page")
	public void the_user_should_be_taken_to_the_category_page(String string) {
	}




}
