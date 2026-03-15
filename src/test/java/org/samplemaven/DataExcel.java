package org.samplemaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {
	
	public static void main(String[] args) throws Exception    {
		
		File f=new File("C:\\Users\\kmoha\\eclipse-workspace\\SamplemavenProject\\Excel\\employeedatas.xlsx")	;	
		
		FileInputStream fil=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fil);
		Sheet sh=book.getSheetAt(0);
		//Row row=sh.getRow(2);
		//Cell cell=row.getCell(3);
		//System.out.println(cell);
		
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c=r.getCell(j);
				//System.out.println(c);
				int cellType = c.getCellType();
				
				if(cellType==1) {
					String name=c.getStringCellValue();
					System.out.println(name);
					
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date d=c.getDateCellValue();
					//System.out.println(d);
					SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
					String name=sim.format(d);
					System.out.println(name);
					
				}
				else {
					double d=c.getNumericCellValue();
					long l=(long)d;
					String name=String.valueOf(1);
					System.out.println(name);
				}
			}
		}
		
		
		
		Sheet sheet = book.createSheet();
		Row r=sh.createRow(1);
		Cell c=r.createCell(1);
		c.setCellValue("javaselenium");
		FileOutputStream file=new FileOutputStream(f);
		book.write(file);
		System.out.println("done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
