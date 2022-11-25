package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class UpstoxLoginPage4 {
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement Username;
    @FindBy(xpath="//div[@data-id='accountDropDown']") private WebElement unbtn;
    @FindBy(xpath="//div[@id='logout']")private WebElement logbtn;
  
    
	public  UpstoxLoginPage4(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String UpstoxLoginPage4verifyUserNm()
	{
		return Username.getText();		
             
	}
	
	public void clickUnBtn()
	{
		unbtn.click();
	}
	public void logoutBtn()
	{
		logbtn.click();
	}

}
