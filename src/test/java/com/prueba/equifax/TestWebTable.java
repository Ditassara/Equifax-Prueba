package com.prueba.equifax;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebTable {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
	}
	
	@Test
	public void testCrear() throws Exception {
	    driver.get("https://demoqa.com/webtables");
	    driver.findElement(By.id("addNewRecordButton")).click();
	    driver.findElement(By.id("firstName")).click();
	    driver.findElement(By.id("firstName")).clear();
	    driver.findElement(By.id("firstName")).sendKeys("Prueba");
	    driver.findElement(By.id("lastName")).clear();
	    driver.findElement(By.id("lastName")).sendKeys("Test");
	    driver.findElement(By.id("userEmail")).clear();
	    driver.findElement(By.id("userEmail")).sendKeys("test@example.com");
	    driver.findElement(By.id("age")).clear();
	    driver.findElement(By.id("age")).sendKeys("20");
	    driver.findElement(By.id("salary")).clear();
	    driver.findElement(By.id("salary")).sendKeys("1111");
	    driver.findElement(By.id("department")).clear();
	    driver.findElement(By.id("department")).sendKeys("QA");
	    driver.findElement(By.id("submit")).click();
	    
	    
	  }
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
