package com.ActiTime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ActiTime.GenricLibarary.Baseclass;
import com.ActiTime.GenricLibarary.Filelibrary;
import com.ActiTime.ObjectRepository.HomePage;
import com.ActiTime.ObjectRepository.Task_page;

public class Task extends Baseclass {
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTasktab().click();
		Task_page tk = new Task_page(driver);
		tk.getAddbtton().click();
		tk.getCustomer().click();
		Filelibrary f = new Filelibrary();		
   String value = f.readDatafromexcel("Sheet1", 1, 1);
   tk.getAddname().sendKeys(value);
   String description = f.readDatafromexcel("Sheet1", 1, 2);
   
   
 
	}
	

}
