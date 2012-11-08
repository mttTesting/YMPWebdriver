package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractCorAccount19NumbersTest extends TestBase{
	@Test
	public void contractCorAccount19NumbersTest_C15005() {
	waitContractPageToLoad();
	
	driver.findElement(By.id("edit-bank-details-kor-account")).click();// без клика и очистки поле не заполняется
	driver.findElement(By.id("edit-bank-details-kor-account")).clear();
	driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys("1234567890123456789");	//Ввод в поле ввода Кор. счета
	driver.findElement(By.id("edit-submit")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//ожидание загрузки страницы
	assertEquals(driver.findElement(By.cssSelector("div.bDocWrap > h1")).getText(), "ДОГОВОР ОБ ОКАЗАНИИ УСЛУГ СВЯЗИ № 100126");
	}
}
