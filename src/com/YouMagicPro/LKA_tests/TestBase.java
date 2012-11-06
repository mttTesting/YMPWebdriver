package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


	public class TestBase { 
		public static ChromeDriver driver;
		public static Wait wait;
	 
		@SuppressWarnings("deprecation")
		@BeforeClass(alwaysRun = true)
		
		
	    protected void startWebDriver() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\GitWorkspace\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	wait = new WebDriverWait(driver, 120);
	    }
	 
	    @AfterClass(alwaysRun = true)
	    protected void closeSession() {
		    driver.close();
	    }
	 
	    public static void assertEquals(Object actual, Object expected) {
	    	Assert.assertEquals(actual, expected);
	    }
	 
	    private void waitAdminsPageToLoad()
	    {
	    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
	    	
	    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "¬ход"
	    	driver.switchTo().frame("iframe_autor");
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина парол€
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
	    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "¬ход"
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	    }
	}
