package automationTest;


import functionLibrary.SeleniumDriver;
import pageObject.signIn;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTest {

	WebDriver driver;
	signIn SignIn;
    
	@BeforeTest
	public void BeforeTestBegins() {
		driver = SeleniumDriver.setUpDriver();
	}

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
    	
    	SignIn = new signIn(driver);
    	
    	SignIn.NavigateToPage();
    	
    	SignIn.switchToSignInFrame();
    	
    	SignIn.SignInButton().click();

        String errorMessage = SignIn.getError().getText();
        
        Assert.assertTrue(errorMessage.contains(SignIn.signInError));
       
    }
    
    @AfterTest
   	public void AfterTestEnds() {
       	SeleniumDriver.shutDownDriver(driver);
   	}

}
