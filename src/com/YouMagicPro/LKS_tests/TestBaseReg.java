package com.YouMagicPro.LKS_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
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

import com.thoughtworks.selenium.Selenium;


	public class TestBaseReg { 
		public static ChromeDriver driver;
		public static Selenium selenium;
		public static Wait wait;
	 
		@SuppressWarnings("deprecation")
		
		@BeforeClass(alwaysRun = true)
	    protected void startWebDriver() throws SecurityException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\GitWorkspace\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	Selenium selenium = new WebDriverBackedSelenium(driver, "http://umagicpro-pp.rnd.mtt/");
	    }
	 
	    @AfterClass(alwaysRun = true)
	    protected void closeSession() {
		    driver.close();
	    }
	 
	}
