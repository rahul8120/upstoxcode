package login_module;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import login_POM1.login_POM1;
import login_POM1.login_POM2;
import login_POM1.login_POM3;
import login_POM1.login_POM4;

public class Test_class_verify_user 
{

	//Before class: to open the browser
	  //Before method: to login upstox
		//@test: verify the user
		//After method:logout
		//After class:close the browser
		WebDriver driver;
		login_POM1 p1;
		login_POM2 p2;
		login_POM3 p3;
		login_POM4 p4;
		FileInputStream f;
		Sheet sh;
		
@Parameters("browsername")
@BeforeClass
public void openbrowser(String browsername) throws EncryptedDocumentException, IOException, InterruptedException
		{
if(browsername.equals("chrome"))
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul Jadhav\\Downloads\\01 Velocity Testing notes\\Selenium app\\chromedriver.exe" );
driver=new ChromeDriver();
}
			
else if(browsername.equals("firefox"))
{
System.setProperty("webdriver.gecko.driver","C:\\Users\\Rahul Jadhav\\Downloads\\01 Velocity Testing notes\\Selenium app\\geckodriver.exe" );
driver=new FirefoxDriver();
}

else if(browsername.equals("edge"))
{
System.setProperty("webdriver.edge.driver","C:\\Users\\Rahul Jadhav\\Downloads\\01 Velocity Testing notes\\Selenium app\\msedgedriver.exe" );
driver=new EdgeDriver();
}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://login-v2.upstox.com/");
			driver.manage().window().maximize();

			//To create object of pom classes
			//so that we can access the methods from POM class throughout the test class
			p1=new login_POM1(driver);
			p2=new login_POM2(driver);
			p3=new login_POM3(driver);
			p4=new login_POM4(driver);
			f=new FileInputStream("C:\\Users\\Rahul Jadhav\\Desktop\\Upstox TEST DATA.xlsx");
			sh = WorkbookFactory.create(f).getSheet("Login1");
		}
		
		@BeforeMethod
		public void login() throws InterruptedException
		{
//login
			String un = sh.getRow(1).getCell(0).getStringCellValue();
			p1.setuserpom1(un);
			String p = sh.getRow(1).getCell(1).getStringCellValue();
			p1.setpswpom1(p);
			p1.setclickpom1();
			Thread.sleep(3000);
			
			String pc = sh.getRow(1).getCell(2).getStringCellValue();
			p2.pascode(pc);
			p3.wlcmpage();	 
			
			
		}
	
//TC1
		@Test(priority=1)
		public void verifyuser()
		{
			
		String actual=p4.verifyusnm();
		String v = sh.getRow(1).getCell(3).getStringCellValue();
			String expected=v;
			
			Assert.assertEquals(actual, expected);
			Reporter.log("Actual username and expected username are same",true);
		}
		
@AfterMethod
		public void logout()
		{
//logout
			p4.dropdwn();
		    p4.clicklogout();    
		    }
	
@AfterClass
public void closebrowser()
		{

//close browser
			driver.close();
//all global variable make null		    
		    p1=null;
		    p2=null;
		    p3=null;
		    p4=null;
		    driver=null;
		    f=null;
		    sh=null;

		}
	
}