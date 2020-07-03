package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;

public class POMActitimeLogin extends BasePage implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createCustomerLink;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameTextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerButton;
	
	public POMActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws IOException, InterruptedException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excelpath, sheetname, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excelpath, sheetname, 1, 1));
		loginButton.click();
		tasksLink.click();
		addNewButton.click();
		createCustomerLink.click();
		Thread.sleep(2000);
		customerNameTextfield.sendKeys(ExcelLibrary.getCellValue(excelpath, sheetname, 4, 0));
		createCustomerButton.click();
	}
}

