package demo.upstoxcode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page4 
{
	
@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement usern;
@FindBy(xpath="//div[@data-id='accountDropDown']")private WebElement dropdown;
@FindBy(xpath="(//div[@data-testid='dropdown-option'])[2]")private WebElement logoutupstox;
@FindBy(xpath="//div[@id='watchlistSelect']")private WebElement Watchlist;
@FindBy(xpath="//div[text()='Indices']")private WebElement indices;
@FindBy(xpath="(//div[@class='F9Jx2Z1yb6NPapDPIxxhQ _127m3JFg0WYtmrQh3_-5-c'])[1]")private List<WebElement> cmpnylist;
@FindBy(xpath="(//button[@data-id='watchlistAdd']")private WebElement add;
@FindBy(xpath="(//input[@type='text'])[1]")private WebElement srchbox;
@FindBy(xpath="(//div[@class='ETtbRH6QzgV51cXTIqc1t']//button[@id='NSE_EQ|3405']")private WebElement addlist;
@FindBy(xpath="(//div[text()='TATACHEM'])[1]")private WebElement tatachem;
@FindBy(xpath="//div[@class='_3AOrvIRXpzbdPrcTdELjJO']")private WebElement gridpath;
@FindBy(xpath="(//div[@class='_1o6u8UYe1Qnw6W1zVBVreR'])[2]")private WebElement sell;
@FindBy(xpath="(//div[@class='_1o6u8UYe1Qnw6W1zVBVreR'])[1]")private WebElement buy;
@FindBy(xpath="//span[@class='am36REkWXiVCIYjl6If4x']")private WebElement tataname;
@FindBy(xpath="//button[@id='buyBtn']")private WebElement buyname;
@FindBy(xpath="//button[@id='sellBtn']")private WebElement sellname;
@FindBy(xpath="//input[@id='quantity']")private WebElement qnty;
@FindBy(xpath="//a[@id='ipo']")private WebElement IPO;

public page4(WebDriver d)
{
	PageFactory.initElements(d, this);
}

public  String verifyusnm()
{
	return usern.getText();
	
//	boolean result = actid.equals(expid);
//	
//	if(result=true)
//	{
//		System.out.println("Pass:valid user");
//	}
//	else
//	{
//		System.out.println("Fail:invalid user");
//	}
}

public void dropdwn() 
{
	dropdown.click();
	
}

//public WebElement movetologout()  
//Webelement logoutbutton=d.findElement(By.xpath(""));
//Actions class object:a
//a.movetoElement(logoutbutton).click().perform();
//{
//	return logoutupstox;
	
//}
//here no need of movetoelement method,thats why direct click action
public void clicklogout()
{
	logoutupstox.click();
}
public void watchL()
{
	Watchlist.click();
}

public void indic()
{
	indices.click();
}

public boolean clist()
{
	boolean c = ((WebElement) cmpnylist).isDisplayed();
	return c;
}

public void Add()
{
	add.click();
}

public void Searchbx()
{
	srchbox.sendKeys("TATACHEM");
	
}

public void AddList()
{
	addlist.click();
}
public void TATACHEM()
{
	tatachem.click();
}
public void GRID()
{
	gridpath.click();
}
public void BUYTATACHEM()
{
	buy.click();
}

public void SELLTATACHEM()
{
	sell.click();
}

public String TATANAME()
{
	String t = tataname.getText();
	return t;
}
public boolean BUYEnable()
{
boolean b = buyname.isEnabled();
return b;
}

public boolean SELL_Enable()
{
boolean b = sellname.isEnabled();
return b;
}

public void vrfyqnty(Object quantity)
{
	qnty.sendKeys("45");
}

public void ipo()
{
	IPO.click();
}


}




