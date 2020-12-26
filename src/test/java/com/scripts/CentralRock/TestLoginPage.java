package com.scripts.CentralRock;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.generics.CentralRock.BaseGenerics;
import com.pages.CentralRock.LoginPage;

public class TestLoginPage extends BaseGenerics
{
	@Test
	public void startExecution() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsername();
		lp.setPassword();
		lp.clickLogin();
		
	}

}
