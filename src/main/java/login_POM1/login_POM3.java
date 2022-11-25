package login_POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_POM3
{
@FindBy(xpath="//div[text()='No, I’m good']") private WebElement welcome;


public	login_POM3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void wlcmpage()
	{
		welcome.click();
	}
	
	
}
