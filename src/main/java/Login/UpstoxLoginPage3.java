package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage3 {
	//step1
    @FindBy(xpath="//div[text()='No, I’m good']") private WebElement welbtn;
    
    //step2
    public UpstoxLoginPage3(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
     
    //step3
    public void clickUpstoxLoginPage3WelBtn()
     {
    	 welbtn.click();
     }

}
