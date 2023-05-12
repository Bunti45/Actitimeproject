package com.ActiTime.GenricLibarary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is Generic library class which content all the generic library
 * @author Amol Patil
 *
 */

public class Filelibrary {
	/**
	 * This is a generic method which is used to read the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String Readdatafrompropertyfile (String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./TestData/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	
	/**
	 * 
	 * @param Sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDatafromexcel (String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream("./TestData/Testdata.xls");
		Workbook wb=WorkbookFactory.create(fis1);
		String value = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	    return value;	
	}
}
