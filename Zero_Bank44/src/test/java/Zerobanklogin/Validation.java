package Zerobanklogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("page loaded successfully");

		
		{
			System.out.println("Manual test : Check user is able to login with valid username and  invalid password");
		}
		// locating username text field
		driver.navigate().to("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("likhitha123");
		// click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login unsuccessfully. ");
		
		
		Thread.sleep(5000);
		
		{
			System.out.println("Manual test : Check user is able to login with invalid username and  valid password");
		}
		// locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("likhitha");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		// click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login unsuccessfully. ");
		
		Thread.sleep(5000);
		
		{
			System.out.println("Manual test : Check user is able to login with invalid username and  invalid password");
		}
		// locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("likhitha");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("likhitha12");
		// click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login unsuccessfully. ");
		
		Thread.sleep(5000);
		
		{
			System.out.println("Manual test : Check user is able to login with null values");
		}
		// locating username text field
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		// click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login unsuccessfully. ");
		
		Thread.sleep(5000);
		
		{
			System.out.println("Manual test : Check user is able to login with valid credentials");
		}
		// locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		// click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login successfully. ");
		driver.findElement(By.name("logout_link")).click();
		
		Thread.sleep(5000);
		
		
	}

}

