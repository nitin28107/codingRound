package automationTest;


import functionLibrary.SeleniumDriver;
import functionLibrary.commonFunctions;
import pageObject.searchFlight;
import pageObject.searchSummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightBookingTest {
	
	WebDriver driver;
	searchFlight FlightSearch;
	searchSummary Summary;
	commonFunctions objectLevelFunctions;
	
	@BeforeTest
	public void BeforeTestBegins() {
		driver = SeleniumDriver.setUpDriver();
	}
	
    @Test
    public void testThatResultsAppearForAOneWayJourney() {
    	
    	FlightSearch = new searchFlight(driver);
    	
    	objectLevelFunctions = new commonFunctions(driver);
    	
    	FlightSearch.NavigateToPage();
   
        FlightSearch.OneWayRadioButton().click();
        
        FlightSearch.FromCityOrAirport().clear();
        
        FlightSearch.FromCityOrAirport().sendKeys("Bangalore");
        
        FlightSearch.FromCityOrAirportOptions().get(0).click();

        FlightSearch.ToCityOrAirport().clear();
        
        FlightSearch.ToCityOrAirport().sendKeys("Delhi");
        
        FlightSearch.ToCityOrAirportOptions().get(0).click();

        FlightSearch.DepartureDate().click();
       
        FlightSearch.SearchButton().click();
        
        //verify that result appears for the provided journey search
         Assert.assertTrue(objectLevelFunctions.isElementPresent(By.className("searchSummary")));
        
    }
    
    @AfterTest
	public void AfterTestEnds() {
    	SeleniumDriver.shutDownDriver(driver);
	}

}
