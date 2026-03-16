package org.samplemaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.fbpojo.FacebookPojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class MavenSample extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		System.out.println(parentId);
		for (String string : allId) {
			System.out.println(string);

			if(!string.equals(parentId)) {
				driver.switchTo().window(string);
				System.out.println(string);
			
			}
			else {
				driver.switchTo().window(parentId);
				
			}
			
		}
		

driver.findElement(By.xpath("//a[text()='Home & Kitchen']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
			
		
		try {
			List<WebElement> elements = driver.findElements(By.xpath("//span[@class='dcl-truncate dcl-product-title']"));
			List<WebElement> elements2 = driver.findElements(By.xpath("//span[@class='dcl-truncate dcl-product-title']//ancestor::div[@class='dcl-product-wrapper']//child::div[@class='dcl-price-single']"));
			
			
				for(int i=0;i<elements.size();i++) {
					System.out.println(elements.get(i).getText()+"-----"+elements2.get(i).getText());
				
				
			
				}
			} 
				catch (Exception e) {
			System.out.println("error occured while fetching products");
			System.out.println(e.getStackTrace());
		}
		
			//driver.close();
			
		}

	}


