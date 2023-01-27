package com.prueba.equifax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebTableEditar {
	
private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
	}
	
	@Test
	public void testUntitledTestCase() throws Exception {
	    driver.get("https://demoqa.com/webtables");
	    driver.findElement(By.cssSelector("#edit-record-1 > svg > path")).click();
	    driver.findElement(By.id("age-wrapper")).click();
	    driver.findElement(By.id("age")).clear();
	    driver.findElement(By.id("age")).sendKeys("40");
	    driver.findElement(By.id("salary")).click();
	    driver.findElement(By.id("salary")).clear();
	    driver.findElement(By.id("salary")).sendKeys("10001");
	    driver.findElement(By.id("submit")).click();
	  }
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
