package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage2 {
	//step1
		@FindBy(xpath="//input[@placeholder='‒‒‒‒']") private WebElement passcode;
	     
		//step2
		public UpstoxLoginPage2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//step3
		public void setUpstoxLoginPage2Pin(String pinno)
		{
			passcode.sendKeys(pinno);
		}
}
