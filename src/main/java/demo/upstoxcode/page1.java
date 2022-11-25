package demo.upstoxcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1 
{
	WebDriver d;
	//Step1:declare data members globally with access level private using @findby annotation
  @FindBy(xpath="//input[@id='userCode']")private WebElement UN;
  @FindBy(xpath="//input[@placeholder='Enter your password']") private WebElement pwd;
  @FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement signin;
  
  //step2:initialize within constructor with public access specifier using pagefactory class
 public page1( WebDriver d)
 {
	 PageFactory.initElements(d, this);
	
	 // initElement provides d obj to the all global variables(this)
 //d obj will be used by findby annotation to internally convert into d.findelement...
 
 }
 //step:3- To perform operation on variable within the method with access specifier public
 public void username(String un)
 {
	 UN.sendKeys(un); 
 }
 public void password(String pd)
 {
	 pwd.sendKeys(pd);
 }
 public void buttonsign() 
 {
	 signin.click();
 }
 






}
