package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Actions actions;
	
	public static void launchChrome() {
		
		driver=new ChromeDriver();
		
		
	}
	
	public static void launchUrl(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
   }
	
	public static void getUrl() {
     String  currentUrl= driver.getCurrentUrl();
	 System.out.println(currentUrl);
	}
	
	public static void titleFetch() {

		String title = driver.getTitle();
		System.out.println(title); 
	}
	
	public static void waitThread() throws InterruptedException {
    Thread.sleep(5000);
	
	}
	
	public static void doubleClick(WebElement ele) {
		actions=new Actions(driver);
		actions.doubleClick(ele).perform();
		
		
	}
	
	public static void screenShot(String location) throws IOException {
	//downcasting	
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File source=new File("C:\\Users\\kmoha\\eclipse-workspace\\SamplemavenProject\\snap"+location+".png");
		
		FileUtils.copyFile(temp, source);

		
	}
	
	public static void passText(WebElement ele, String data) {
      ele.sendKeys(data);
      
	}
	
	public static void clickBtn(WebElement ele) {
		
		ele.click();
		
	}
	
	public static  String returnText(WebElement ele) {
		String text = ele.getText();
		return text;

}
	public static void moveCursor(WebElement ele) {
		actions=new Actions(driver);
		actions.moveToElement(ele).perform();

		
	}
	
	public static  void refreshMethod() {

		driver.navigate().refresh();
		
	}
	
	public static  void dateAndTime() {
           
		Date d=new Date();
		
		System.out.println(d);
		
		
	}
	
	public static void selectByIndex(WebElement ele,int index) {
       Select s=new Select(ele);
       s.selectByIndex(index);
	
	}
	
	
	public static String xlDataGetAll(int rowNo,int cellNo) throws IOException {

		File f = new File("C:\\Users\\kmoha\\eclipse-workspace\\SamplemavenProject\\Excel\\employeedatas.xlsx");

		FileInputStream fil = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fil);

		Sheet sh = book.getSheetAt(0);

		int allRows = sh.getPhysicalNumberOfRows();
		String name ="";
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {

			Row r = sh.getRow(rowNo);

			int allCells = r.getPhysicalNumberOfCells();

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(cellNo);

				// System.out.println(c);

				int type = c.getCellType();

				// System.out.println(type);

				if (type == 1) {
					 name = c.getStringCellValue();

				} 
				else if (DateUtil.isCellDateFormatted(c)) {
					// get the all date cell value
					Date date = c.getDateCellValue();

					// change the date format
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					// print the value
					 name = sim.format(date);

				} 
				else {
					double d = c.getNumericCellValue();
					// System.out.println(d);
					long l = (long) d;
					// System.out.println(l);

					 name = String.valueOf(l);


				}
			

			}
			
			
		

	}
	return name;
	
	}

	
	

}
