package com.generics.CentralRock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseGenerics implements AutoConstantGenerics {
	public WebDriver driver;

	@BeforeMethod
	public void openAppln() {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.get(url);
	}

	@AfterTest
	public void closeAppln() {
		driver.quit();
	}
}
