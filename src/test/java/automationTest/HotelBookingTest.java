package automationTest;


import functionLibrary.SeleniumDriver;
import pageObject.searchHotel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HotelBookingTest {

	WebDriver driver;
	searchHotel HotelSearch;
    
	@BeforeTest
	public void BeforeTestBegins() {
		driver = SeleniumDriver.setUpDriver();
	}
	
    @Test
    public void shouldBeAbleToSearchForHotels() {
    	
    	HotelSearch=new searchHotel(driver);
    	
    	HotelSearch.NavigateToPage();
    	
    	HotelSearch.Locality().sendKeys("Indiranagar, Bangalore");
    	
    	HotelSearch.TravellerSelection().selectByVisibleText("1 room, 2 adults");
    	
    	HotelSearch.SearchButton().click();
    	
    }
    
    @AfterTest
	public void AfterTestEnds() {
    	SeleniumDriver.shutDownDriver(driver);
	}

}
