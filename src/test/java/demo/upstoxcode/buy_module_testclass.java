package demo.upstoxcode;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import buy_module.page1;
import buy_module.page2;
import buy_module.page3;
import buy_module.page4;
import library_files.base_class;
import library_files.utility_class_file_properties;

public class buy_module_testclass extends base_class
{
	page1 p1;
	page2 p2;
	page3 p3;
	page4 p4;
	Sheet sh;

	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException,IOException
	{
		invokebrowser();
		p1=new page1(d);
		p2=new page2(d);
		p3=new page3(d);
		p4=new page4(d);
		
}

	@Test
	public void login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//Thread.sleep(3000);
		p1.username(utility_class_file_properties.fetchTestData(0,0));
		
		p1.password(utility_class_file_properties.fetchTestData(0,1));
		
		p1.buttonsign();
		
		Thread.sleep(3000);
		
		p2.passcode(utility_class_file_properties.fetchTestData(0,2));
		
		p3.wlcmpage();
	}
	@Test(priority=1)
	public void clickindices()
	{
    p4.watchL();
    p4.indic();
    Reporter.log("Indices is opened",true);
	}
	//To open TATAChem shares buy window
	@Test(priority=2)
	public void Tatachembuy() throws InterruptedException
	{
		//Thread.sleep(6000);
		p4.TATACHEM();
		//Thread.sleep(6000);
		
		p4.GRID();
		//Thread.sleep(6000);
		
		p4.BUYTATACHEM();
		//Thread.sleep(6000);
		Reporter.log("Tatachem Buy  window opned",true);
		
		
	}
	
	//TO verify TATACHEM name and verify buy button
	@Test(priority=3)
	public void buywindowvrfy() throws EncryptedDocumentException, IOException
	{
		String actual=p4.TATANAME();
		//String expected=sh.getRow(0).getCell(4).getStringCellValue();
		String expected = utility_class_file_properties.fetchTestData(0,4);
		SoftAssert s=new SoftAssert();
   s.assertEquals(actual, expected);
   Reporter.log("Actual share name same as expected  ",true);

   boolean result = p4.BUYEnable();
   s.assertTrue(result);
   s.assertAll();
   Reporter.log(" buy button is enabled",true);
	}
	
	@DataProvider(name="quantity")
	public static Object[][] quantity()
	{
		return new Object[][] 
				{{0},{1},{12345678},{876543219},{123456789}};
	}
	
	
	@Test(dataProvider="quantity",priority=4)
	public void vrfyQtyTxbox(Object quantity)
	{
		p4.vrfyqnty(quantity);
		Reporter.log("quanty textbox verified");
	}
	
	
	
	

}
