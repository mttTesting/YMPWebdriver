package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractFillInDataTest  extends TestBase{

    	@Test
    	public void fillInContractDataTest() {  		
    		waitContractPageToLoad();
    		
    		driver.findElement(By.id("edit-buisness-form-company")).sendKeys("1234");//заполнение данными
    		driver.findElement(By.id("edit-bank-details-inn")).sendKeys("1234123411");
    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man-base-value")).sendKeys("1234");
    		driver.findElement(By.id("edit-latitude")).sendKeys("1234");
    		driver.findElement(By.id("edit-law-latitude")).sendKeys("1234");
    		driver.findElement(By.id("edit-company-phone")).sendKeys("1234");
    		driver.findElement(By.id("edit-bank-details-ogrn")).sendKeys("1234123412341");
    		driver.findElement(By.id("edit-bank-details-kpp")).sendKeys("123456789");
    		driver.findElement(By.id("edit-bank-details-bank-name")).sendKeys("1234");
    		driver.findElement(By.id("edit-bank-details-bank-filial")).sendKeys("1234");
    		driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys("12345678901234567890");
    		driver.findElement(By.id("edit-bank-details-bank-account")).sendKeys("12345678901234567890");
    		driver.findElement(By.id("edit-bank-details-bik")).sendKeys("123456789");
    		
    		driver.findElement(By.id("edit-submit")).click();//нажатие на кнопку "Сохранить"
    		
    		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//ожидание загрузки страницы
    		assertEquals(driver.findElement(By.cssSelector("div.bDocWrap > h1")).getText(), "ДОГОВОР ОБ ОКАЗАНИИ УСЛУГ СВЯЗИ № 100126");
    	}

}