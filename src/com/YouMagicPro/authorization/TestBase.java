package com.YouMagicPro.authorization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
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
		@BeforeClass(alwaysRun = true)
		
	    protected void startWebDriver() throws SecurityException, IOException {
			
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
	    public static void sendKeysAndAssert_bik(String keys, String errorString)
		{
			driver.findElement(By.id("edit-bank-details-bik")).click();// ��� ����� � ������� ���� �� �����������
			driver.findElement(By.id("edit-bank-details-bik")).clear();
			driver.findElement(By.id("edit-bank-details-bik")).sendKeys(keys);	//���� � ���� ����� ���
			driver.findElement(By.id("edit-submit")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
		}
	    public static void sendKeysAndAssert_bankAccount(String keys, String errorString)
		{
			driver.findElement(By.id("edit-bank-details-bank-account")).click();// ��� ����� � ������� ���� �� �����������
			driver.findElement(By.id("edit-bank-details-bank-account")).clear();
			driver.findElement(By.id("edit-bank-details-bank-account")).sendKeys(keys);	//���� � ���� ����� ���
			driver.findElement(By.id("edit-submit")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
		}
	    public static void sendKeysAndAssert_cor(String keys, String errorString)
	    {
	    	driver.findElement(By.id("edit-bank-details-kor-account")).click();// ��� ����� � ������� ���� �� �����������
	    	driver.findElement(By.id("edit-bank-details-kor-account")).clear();
	    	driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys(keys);	//���� � ���� ����� ���. �����
	    	driver.findElement(By.id("edit-submit")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	    }
	    public static void sendKeysAndAssert_kpp(String keys, String errorString)
	    {
	    	driver.findElement(By.id("edit-bank-details-kpp")).click();// ��� ����� � ������� ���� �� �����������
	    	driver.findElement(By.id("edit-bank-details-kpp")).clear();
	    	driver.findElement(By.id("edit-bank-details-kpp")).sendKeys(keys);	//���� � ���� ����� ���. �����
	    	driver.findElement(By.id("edit-submit")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	    }
	    public static void sendKeysAndAssert_ogrn(String keys, String errorString)
	    {
	    	driver.findElement(By.id("edit-bank-details-ogrn")).click();// ��� ����� � ������� ���� �� �����������
	    	driver.findElement(By.id("edit-bank-details-ogrn")).clear();
	    	driver.findElement(By.id("edit-bank-details-ogrn")).sendKeys(keys);	//���� � ���� ����� ���. �����
	    	driver.findElement(By.id("edit-submit")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	    }
	    public static void sendKeysAndAssert_inn(String keys, String errorString)
	    {
	    	driver.findElement(By.id("edit-bank-details-inn")).click();// ��� ����� � ������� ���� �� �����������
	    	driver.findElement(By.id("edit-bank-details-inn")).clear();
	    	driver.findElement(By.id("edit-bank-details-inn")).sendKeys(keys);	//���� � ���� ����� ���. �����
	    	driver.findElement(By.id("edit-submit")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
			assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	    }
	    public static void waitAdminPageToLoad()
	    {
	    	driver.get("http://account.umagicpro-pp.rnd.mtt/user/login/");
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//���� ������ ������
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
	    	driver.findElement(By.id("edit-submit-1")).click();//������� �� ������ "����"
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    }
	    public static void waitAdminPageToLoadSecondAccount()
	    {
	    	driver.get("http://umagicpro-pp.rnd.mtt/");//�������� �������
	    	driver.findElement(By.xpath("//span")).click();//������� �� ������ "����"
	    	driver.switchTo().frame("iframe_autor");
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100177");//���� ������ ������
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
	    	driver.findElement(By.id("edit-submit-1")).click();//������� �� ������ "����"
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	    }
	    public static void  waitContractPageToLoad()
	    {
	    	driver.get("http://umagicpro-pp.rnd.mtt/");//�������� �������
	    	
	    	driver.findElement(By.xpath("//span")).click();//������� �� ������ "����"
	    	driver.switchTo().frame("iframe_autor");
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//���� ������ ������
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
	    	driver.findElement(By.id("edit-submit-1")).click();//������� �� ������ "����"
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
	    	
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //������� "��������"
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	    }
	}
