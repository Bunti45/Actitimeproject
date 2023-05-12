package com.ActiTime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_page {
	//Declaration
@FindBy(xpath="//div[.='Add New']")
private WebElement addbtton;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newcustomer;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement Addname;
                                      
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement description;

@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
private WebElement customer;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement creatcustomer;

@FindBy(xpath="//div[@class='greyButton cancelBtn']")
private WebElement cancle;

//Initialization
public Task_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

//utilization

public WebElement getAddbtton() {
	return addbtton;
}

public WebElement getNewcustomer() {
	return newcustomer;
}

public WebElement getAddname() {
	return Addname;
}

public WebElement getDescription() {
	return description;
}

public WebElement getCustomer() {
	return customer;
}

public WebElement getCreatcustomer() {
	return creatcustomer;
}

public WebElement getCancle() {
	return cancle;
}




}
