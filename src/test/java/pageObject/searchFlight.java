package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchFlight {
	
	WebDriver driver;
	
	public searchFlight(WebDriver driver) {
		this.driver=driver;
	}
	
	public void NavigateToPage() {
		driver.get("https://www.cleartrip.com/");
	}
	
	public WebElement OneWayRadioButton() {
		return driver.findElement(By.id("OneWay"));
	}
	
	public WebElement FromCityOrAirport() {
		return driver.findElement(By.id("FromTag"));
	}
	
	public WebElement ToCityOrAirport() {
		return driver.findElement(By.id("ToTag"));
	}
	
	public List<WebElement> FromCityOrAirportOptions() {
		return driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
	}
	
	public List<WebElement> ToCityOrAirportOptions() {
		return driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
	}
	
	public WebElement DepartureDate() {
		return driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a"));
	}
	
	public WebElement SearchButton() {
		return driver.findElement(By.id("SearchBtn"));
	}
}
