package org.samplemaven;

import java.io.File;
import org.fbpojo.FacebookPojoClass;
import org.instagrampojo.InstagramPojosample;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.grid.Main;

public class DataDrivenSample extends BaseClass {



public static void main(String[] args) throws IOException, InterruptedException {
		String data = xlDataGetAll(2,3);
		String data1 = xlDataGetAll(1,1);
		String data2 = xlDataGetAll(2,1);
		String data3 = xlDataGetAll(4,1);
		String data4 = xlDataGetAll(3, 2);
    System.out.println(data);
    System.out.println(data1);
    System.out.println(data2);
    System.out.println(data3);
    System.out.println(data4);

   launchChrome();
   launchUrl("https://www.instagram.com/");
   
   //FacebookPojoClass fb=new FacebookPojoClass();
   
    //WebElement emailBox = fb.getEmailBox();
    
    //WebElement passBox = fb.getPassBox();
    
   // WebElement logBtn = fb.getLogBtn();
    
    
   // passText(emailBox, data3);
   // passText(passBox, data4);
  //  waitThread();
  //  clickBtn(logBtn);
    
  InstagramPojosample ip=new InstagramPojosample();
  
  WebElement emailBox = ip.getEmailBox();
  
  WebElement passBox = ip.getPassBox();
    
  WebElement logbtn = ip.getLogbtn();
  
  passText(emailBox, data3);
  
  passText(passBox, data2);
  
  clickBtn(logbtn);
  
  screenShot("instagram");

	

}
}
