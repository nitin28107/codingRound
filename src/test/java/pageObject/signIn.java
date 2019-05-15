package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signIn {
	
	WebDriver driver;
	
	public String signInError = "There were errors in your submission";
	
	public signIn(WebDriver driver) {
		this.driver=driver;
	}
	
	public void NavigateToPage() {
		driver.get("https://www.cleartrip.com/");
		this.YourTrips().click();
		this.YourTripsSignIn().click();
	}
	
	public WebElement YourTrips() {
		return driver.findElement(By.linkText("Your trips"));
	}
	
	public WebElement YourTripsSignIn() {
		return driver.findElement(By.id("SignIn"));
	}
	
	public void switchToSignInFrame() {
		driver.switchTo().frame("modal_window");
	}
	
	public WebElement SignInButton() {
		return driver.findElement(By.id("signInButton"));
	}
	
	public WebElement getError() {
		return driver.findElement(By.id("errors1"));
	}
	
}
