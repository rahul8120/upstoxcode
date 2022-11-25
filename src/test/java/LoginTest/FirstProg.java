package LoginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Login.UpstoxLoginPage1;
import Login.UpstoxLoginPage2;
import Login.UpstoxLoginPage3;
import Login.UpstoxLoginPage4;
import library.Upstox_BaseClass;
import library.Upstox_UtilityClass;



public class FirstProg extends Upstox_BaseClass{
  
    UpstoxLoginPage1 page1;
    UpstoxLoginPage2 page2;
	UpstoxLoginPage3 page3;
	UpstoxLoginPage4 page4;
	int TestCaseID;
	
    
	@BeforeClass
	public void openBrowser()throws IOException
	  {
		
		initializeBrowser();
		
 	       page1 = new UpstoxLoginPage1(driver);
 	       page2 = new UpstoxLoginPage2(driver);
 	       page3= new UpstoxLoginPage3(driver);
 	       page4= new UpstoxLoginPage4(driver);
 	    
	}
	@BeforeMethod
    public void login() throws EncryptedDocumentException, IOException 
    {
		
	     page1.setUpstoxLoginPage1Uername(Upstox_UtilityClass.getDataFromPropertiesFile("UN"));
		 page1.setUpstoxLoginPage1pass(Upstox_UtilityClass.getDataFromPropertiesFile("Pass"));
		 page1.clickUpstoxLoginPage1signBtn();
		 page2.setUpstoxLoginPage2Pin(Upstox_UtilityClass.getDataFromPropertiesFile("pin"));
	     page3.clickUpstoxLoginPage3WelBtn();
		
    }
    @Test
     public void verifyUN() throws EncryptedDocumentException, IOException
     { 
    	TestCaseID=101;
      	String Expectnm = Upstox_UtilityClass.getID(0, 3);
	    String actualnm=page4.UpstoxLoginPage4verifyUserNm();
	    SoftAssert soft = new SoftAssert();
	  
	    soft.assertEquals(actualnm, Expectnm,"passed :un as expected");
     	Reporter.log("correct user",true);
     	soft.assertAll();   
     	
    }
    @AfterMethod
    public void logout(ITestResult result) throws IOException, InterruptedException
    {
    	if(result.getStatus()==result.FAILURE)
    	{
    		Upstox_UtilityClass.captureScreenshot(driver, TestCaseID);
    	}
    	Thread.sleep(10000);
    	page4.clickUnBtn();
    	page4.logoutBtn();
    	 Reporter.log("logout sucessfull",true);
    	
    }
  
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("close browser",true);
		page1=null;
		page2=null;
		page3=null;
		 page4=null;
        
	}
}	
	
	
	
	
	

