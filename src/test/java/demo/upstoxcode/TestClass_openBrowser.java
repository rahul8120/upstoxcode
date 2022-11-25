package demo.upstoxcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass_openBrowser {
	//Author Name - Vaishnavi
	@Test
	public void InitializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.upstox.com");
	}

}
