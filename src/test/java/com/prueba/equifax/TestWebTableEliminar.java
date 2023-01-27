package com.prueba.equifax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebTableEliminar {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
	}
	
	@Test
	public void testEliminar() throws Exception {
	    driver.get("https://demoqa.com/webtables");
	    driver.findElement(By.cssSelector("#delete-record-1 > svg > path")).click();
	  }
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
