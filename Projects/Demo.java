package change;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;


public class Demo {
	
	
		WebDriver driver;
		WebDriverWait wait;

		@Given("home page should be open in default browser")
		public void home_page_should_be_open_in_default_browser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}

		@When("click on search button and search product and then click add to cart")
		public void click_on_search_button_and_search_product_and_then_click_add_to_cart() throws InterruptedException {
			Page_class pg = new Page_class(driver);
			pg.search();
			pg.product();
			pg.addToCart();
			Thread.sleep(1000);
			pg.home();
			Thread.sleep(2000);
		}

		@Then("product should be add to cart")
		public void product_should_add_to_cart() {
			driver.close();
		}

	}


