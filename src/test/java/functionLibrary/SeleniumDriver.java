package functionLibrary;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.javafx.PlatformUtil;

public class SeleniumDriver {
	
	static WebDriver driver;
	
	public static WebDriver setUpDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		setDriverPath();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	 private static void setDriverPath() {
	    if (PlatformUtil.isMac()) {
	        System.setProperty("webdriver.chrome.driver", "chromedriver");
	    }
	    else if (PlatformUtil.isWindows()) {
	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    }
	    else if (PlatformUtil.isLinux()) {
	        System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
	    }
	}
	 
	 public static void shutDownDriver(WebDriver webdriver) {
		webdriver.quit();
	}
}
