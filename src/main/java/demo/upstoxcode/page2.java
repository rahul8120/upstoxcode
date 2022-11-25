package demo.upstoxcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2 
{
	
	@FindBy(xpath="//input[@type='text']")private WebElement code;

	public page2(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void passcode(String pcode)
	{
		code.sendKeys(pcode);
	}
	
	
	
	
}
