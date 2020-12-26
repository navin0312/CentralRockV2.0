package com.pages.CentralRock;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.CentralRock.AutoConstantGenerics;
import com.generics.CentralRock.ExcelLibGenerics;

public class LoginPage implements AutoConstantGenerics
{
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernameTextfield;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTextfield;
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUsername() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		usernameTextfield.sendKeys(ExcelLibGenerics.readandpasstheData(excelLoc, sheetName,1,0));
	}
	public void setPassword() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		passwordTextfield.sendKeys(ExcelLibGenerics.readandpasstheData(excelLoc, sheetName, 1, 1));
	}
	public void clickLogin()
	{
		loginButton.click();
		
	}

}
