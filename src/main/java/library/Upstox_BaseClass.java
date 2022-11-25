package library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_BaseClass {
	 
	public WebDriver driver;
	public void initializeBrowser()
	{
		  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://login-v2.upstox.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

}
