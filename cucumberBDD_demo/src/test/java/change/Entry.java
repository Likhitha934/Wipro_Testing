package change;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Entry{
	WebDriver driver;
	WebDriverWait wait;
	




@Given("the user is on the login page")
public void the_user_is_on_the_login_page() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
}

@When("the user enters a valid email and password")
public void the_user_enters_a_valid_email_and_password() {
	WebElement signin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
    signin.sendKeys(Keys.ENTER);
    WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid")));
    username.sendKeys("gnlikhitha67@gmail.com");
    username.sendKeys(Keys.ENTER);
    WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
    password.sendKeys("Likhitha@21");
    password.sendKeys(Keys.ENTER);
    wait.until(ExpectedConditions.urlContains("ebay.com"));
    driver.findElement(By.cssSelector("div[class=\"gh-header__logo-cats-wrap\"]")).click();
    wait.until(ExpectedConditions.urlToBe("https://www.ebay.com/"));
}

@And("clicks the login button")
public void clicks_the_login_button() {
	
    
}

@Then("the user should be logged in successfully")
public void the_user_should_be_logged_in_successfully() {
	System.out.println("login successfully");
    
}
}



