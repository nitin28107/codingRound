package pageObject;

import org.openqa.selenium.By;

public class searchSummary {
	
	By by = null;
	
	public By summarySearch() {
		by= By.className("searchSummary");
		return by;
	}
	
}
