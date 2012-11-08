package com.YouMagicPro.LKA_tests;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


	public class TestBase { 
		public static ChromeDriver driver;
		public static Wait wait;
	 
		@SuppressWarnings("deprecation")
		@BeforeTest(alwaysRun = true)
		
		
	    protected void startWebDriver() throws SecurityException, IOException {


			System.setProperty("webdriver.chrome.driver", "C:\\GitWorkspace\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	wait = new WebDriverWait(driver, 120);
	    	
	    	Logger logger = Logger.getLogger(RemoteWebDriver.class.getName());
	    	String logFileName = "C:\\GitWorkspace\\YMPWebdriver\\logs.txt";
	    	Handler handler = new FileHandler(logFileName, true);
	    	SimpleFormatter newFormatter = new SimpleFormatter();
	    	handler.setLevel(Level.ALL);
	    	handler.setFormatter(newFormatter);
	    	logger.addHandler(handler);
	    	driver.setLogLevel(Level.ALL);

	    }
	 
	    @AfterTest(alwaysRun = true)
	    protected void closeSession() {
		    driver.close();
	    }
	 
	    public static void assertEquals(Object actual, Object expected) {
	    	Assert.assertEquals(actual, expected);
	    }
	    public static void sendKeysAndAssert(String keys, String errorString)
		{
			driver.findElement(By.id("edit-bank-details-bik")).click();// без клика и очистки поле не заполняется
			driver.findElement(By.id("edit-bank-details-bik")).clear();
			driver.findElement(By.id("edit-bank-details-bik")).sendKeys(keys);	//Ввод в поле ввода БИК
			driver.findElement(By.id("edit-submit")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
		}
	    public static void waitAdminPageToLoad()
	    {
	    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
	    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "Вход"
	    	driver.switchTo().frame("iframe_autor");
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
	    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	    }
	    public static void  waitContractPageToLoad()
	    {
	    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
	    	
	    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "Вход"
	    	driver.switchTo().frame("iframe_autor");
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
	    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	    	
	    	driver.findElement(By.xpath("//div[4]/a")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //Нажатие "Оформить"
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	    }
	}
