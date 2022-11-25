package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage1 {
	//step1
		@FindBy(xpath="//input[@name='userId']") private WebElement UN;
		@FindBy(xpath="//input[@name='password']") private WebElement pass;
		@FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement signbtn;
		
		 //step2
		public UpstoxLoginPage1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//step3
		public void setUpstoxLoginPage1Uername(String usernm)
		{
			UN.sendKeys(usernm);
		}
		public void setUpstoxLoginPage1pass(String upass)
		{
			pass.sendKeys(upass);
		}
		public void clickUpstoxLoginPage1signBtn()
		{
			signbtn.click();
		}


}
