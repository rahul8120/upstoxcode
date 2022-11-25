package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Upstox_UtilityClass
{
	public static String getID(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	{
	    FileInputStream	file = new FileInputStream("D:\\ashwini\\automation\\UpstoxTestData.xlsx");
 	    Sheet sh = WorkbookFactory.create(file).getSheet("2ndUserLogin");
 	    String value= sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
 	    return value;
	}
	
	public static void captureScreenshot(WebDriver driver,int TestCaseID) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\CoreTech\\eclipse-workspace\\Selenium5\\screenshot\\TCID"+TestCaseID+".jpg");
		FileHandler.copy(source, dest);
	}
	 
	public static String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\CoreTech\\eclipse-workspace\\Selenium5\\UpstoxCredential.properties");
	    Properties p= new Properties();
	    p.load(file);
	    String value=p.getProperty(key);
	    return value;
	
	}
	

}
