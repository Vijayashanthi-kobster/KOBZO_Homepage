package homepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Methods {

	 public static WebDriver driver;
	 
	 public	static HSSFWorkbook workbook;
	 public static HSSFSheet sheet;
	 public static HSSFCell cell;

	
	 
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", Inputs.chrpath);
		driver=new ChromeDriver();
		driver.get(Inputs.URL);	
		driver.manage().window().maximize();
	}
	
	public static void cantactus()
	{
		driver.findElement(Locators.contactbut).click();
	}
	
	public static void Linkverify() throws InterruptedException
	{
		Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));	
	
	//To print the total number of links
	System.out.println("Total links are "+links.size());	

	//used for loop to 
	for(int i=0; i<links.size(); i++) {
		WebElement element = links.get(i);
		
		//By using "href" attribute, we could get the url of the requried link
		String url=element.getAttribute("href");
		
		//calling verifyLink() method here. Passing the parameter as url which we collected in the above link
		//See the detailed functionality of the verifyLink(url) method below
		verifyLink(url);			
	}	
}

// The below function verifyLink(String urlLink) verifies any broken links and return the server status. 

	public static  void verifyLink(String urlLink)
	{
    //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
    try {
		//Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
		URL link = new URL(urlLink);
		
		// Create a connection using URL object (i.e., link)
		HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		
		//Set the timeout for 2 seconds
		httpConn.setConnectTimeout(2000);
		
		//connect using connect method
		httpConn.connect();
		
		//use getResponseCode() to get the response code. 
		/*
		 * if(httpConn.getResponseCode()== 200) {
		 * System.out.println(urlLink+" - "+httpConn.getResponseMessage()); }
		 * if(httpConn.getResponseCode()== 404) {
		 * System.out.println(urlLink+" - "+httpConn.getResponseMessage()); }
		 */	
            if(httpConn.getResponseCode() >= 400){
                System.out.println(urlLink+" is a broken link- FAILED");
            }
            else{
                System.out.println("Valid link- PASSED");
            }
			
			
			
			
			
			
		}
		
    //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
	catch (Exception e) {
		//e.printStackTrace();
	}
} 
	

	public static void linksclk(By locatorsname) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(locatorsname).click();
	}
	
	public static void dropdownmenu(String Linkedtext) throws InterruptedException
	{
		WebElement menu=driver.findElement(Locators.covidsafe);
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();		
	
		driver.findElement(By.linkText(Linkedtext)).click();
		Thread.sleep(2000);
	}
	public static void backpage()
	{
		driver.navigate().back();
	}
	
	public static void contactusform() throws IOException, InterruptedException
	{
	     // Import excel sheet.
	     File src=new File("C:\\Users\\KobZo\\Desktop\\cataog\\contactusform.xls");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load he workbook.
	    workbook = new HSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(0);
	      
	     for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
	         // Import data for Name.
	         cell = sheet.getRow(i).getCell(1);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.name).clear();
	         driver.findElement(Locators.name).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	          
	         // Import data for mailid.
	         cell = sheet.getRow(i).getCell(2);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.Emailid).clear();
	         driver.findElement(Locators.Emailid).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	         
	         // Import data for Phonenumber.
	         cell = sheet.getRow(i).getCell(3);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.Phoneno).clear();
	         driver.findElement(Locators.Phoneno).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	         
	         // Import data for subject
	         cell = sheet.getRow(i).getCell(4);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.subject).clear();
	         driver.findElement(Locators.subject).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
		
	         // Import data for Emessage 
	         cell = sheet.getRow(i).getCell(5);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.Message).clear();
	         driver.findElement(Locators.Message).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
		
	         driver.findElement(Locators.button).click();
	}
	
	
	}

	public static void contactusformvaliddata() throws IOException, InterruptedException
	{
	     // Import excel sheet.
	     File src=new File("C:\\Users\\KobZo\\Desktop\\cataog\\contactusform.xls");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load he workbook.
	    workbook = new HSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(1);
	      
	     for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
	         // Import data for Name.
	         cell = sheet.getRow(i).getCell(1);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.name).clear();
	         driver.findElement(Locators.name).sendKeys(cell.getStringCellValue());
	         Thread.sleep(3000);
	          
	         // Import data for mailid.
	         cell = sheet.getRow(i).getCell(2);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.Emailid).clear();
	         driver.findElement(Locators.Emailid).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	         
	         // Import data for Phonenumber.
	         cell = sheet.getRow(i).getCell(3);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.Phoneno).clear();
	         driver.findElement(Locators.Phoneno).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	         
	         // Import data for subject
	         cell = sheet.getRow(i).getCell(4);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.subject).clear();
	         driver.findElement(Locators.subject).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
		
	         // Import data for Emessage 
	         cell = sheet.getRow(i).getCell(5);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.Message).clear();
	         driver.findElement(Locators.Message).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
		
	        // driver.findElement(Locators.button).click();
	         //driver.findElement(Locators.close).click();
	}
	
	
	}



public static void redirect_verify(By Loc_name,String url) throws InterruptedException
{
	Thread.sleep(3000);
	//String Expurl="{expected URL}";
	driver.findElement(Loc_name).click();
	String redirectURL=driver.getCurrentUrl();
	Assert.assertEquals(redirectURL,url);

	
}

public static void productbuy()
{
	driver.findElement(Locators.addtocart1).click();
	driver.findElement(Locators.addtocart2).click();
	driver.findElement(Locators.addtocart3).click();
	driver.findElement(Locators.cartfloat).click();
	
	driver.findElement(Locators.qtyincrease).click();
	driver.findElement(Locators.proctocheckout).click();
	
	
	
}





}


