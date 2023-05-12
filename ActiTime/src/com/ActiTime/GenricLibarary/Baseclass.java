package com.ActiTime.GenricLibarary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public static WebDriver driver;
	Filelibrary f=new Filelibrary();
	
	@BeforeSuite
	public void databaseconnection() {
		
		Reporter.log("database connected",true);
		
		
	}
	@BeforeClass
	public void launchBrowser() throws IOException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String URL = f.Readdatafrompropertyfile("url");
		driver.get("URL");
		Reporter.log("browser is launch",true);
		
	}
    @BeforeMethod
    public void login() throws IOException {
    	String Un = f.Readdatafrompropertyfile("username");
    	driver.findElement(By.id("username")).sendKeys("Un");
    	
    	String pw = f.Readdatafrompropertyfile("password");
    	driver.findElement(By.name("pwd")).sendKeys("pw");
    	
    	
    	driver.findElement(By.xpath("//div[.='Login '] ")).click();
    	Reporter.log("Login successfully",true);
    	
    }
    @AfterMethod
    public void logout() {
    	driver.findElement(By.id("logoutLink")).click();
    	Reporter.log("Logout successfully",true);
    	
    }
    @AfterClass
    public void closebrowser() {
    	driver.close();
    	Reporter.log("Login successfully",true);
    	
    }
    
    @AfterSuite
    public void databasedisconnection () {
    	Reporter.log("dtabasedisconnection",true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
