package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class searchHotel {

	WebDriver driver;
	
	public searchHotel(WebDriver driver) {
		this.driver=driver;
	}
	
	public void NavigateToPage() {
		driver.get("https://www.cleartrip.com/");
		this.hotelLink().click();
	}
	
	public WebElement hotelLink() {
		return driver.findElement(By.linkText("Hotels"));
	}
	
	public WebElement Locality(){
		return driver.findElement(By.id("Tags"));
	}
	
	public Select TravellerSelection(){
		return new Select(driver.findElement(By.id("travellersOnhome")));
	}
	
	public WebElement SearchButton(){
		return driver.findElement(By.id("SearchHotelsButton"));
	}
	
	
}
