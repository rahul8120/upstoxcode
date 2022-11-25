 package demo.upstoxcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page3
{
	
@FindBy(xpath="//div[text()='No, I’m good']") private WebElement welcome;

public	page3(WebDriver d)
{
	PageFactory.initElements(d, this);
}
	
public void wlcmpage()
{
	welcome.click();
}
	
	
	
	
	
}

