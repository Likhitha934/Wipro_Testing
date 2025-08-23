package change;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class language {
		WebDriver driver;
		WebDriverWait wait;

	@When("click on us country flag and click the country")
	public void click_on_us_country_flag_and_click_the_country()  {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		}
	

	@Then("language should be shown")
	public void language_should_be_shown() throws InterruptedException {
		WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[aria-label=\"eBay Sites - United States - change site\"]")));
        Actions lang = new Actions( driver);
        lang.moveToElement(profile).perform();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("China"))).click();
        
        
	    
	}


}
