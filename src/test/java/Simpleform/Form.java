package Simpleform;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Form {
	WebDriver driver;

	@Given("open the browser and enter the url of sample form")
	public void open_the_browser_and_enter_the_url_of_sample_form() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/simple-form?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("User enters firstname,lastname,email,contactno")
	public void user_enters_firstname_lastname_email_contactno() {
		driver.findElement(By.id("firstName")).sendKeys("Vaishnavi");
		driver.findElement(By.id("lastName")).sendKeys("Lakhore");
		driver.findElement(By.cssSelector("[placeholder='abc@xyz.com']")).sendKeys("vaishnavilakhore@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='9876543210']")).sendKeys("8989675423");
	   
	}

	@When("enters a message")
	public void enters_a_message() {
		driver.findElement(By.cssSelector("[rows='2']")).sendKeys("Hello i am vaishnavi");
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.cssSelector("[onclick='simpleFormSubmit()']")).click();
	    
	}

	@Then("alert message comes")
	public void alert_message_comes() {
		
		Alert ele = driver.switchTo().alert();
		
		String alerttext = ele.getText();
		
		System.out.println(alerttext);
		// IT will accept the alert
		
		ele.accept();
		
		driver.close();
		
	   
	}
	
	@Given("User enters {string},{string},{string},{string}")
	public void user_enters(String firstname, String lastname, String email, String contactno) {
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
		driver.findElement(By.cssSelector("[placeholder='abc@xyz.com']")).sendKeys(email);
		driver.findElement(By.cssSelector("[placeholder='9876543210']")).sendKeys(contactno);
	   
	}


}
