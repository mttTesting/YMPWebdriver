package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractCorAccountTest extends TestBase{
	@Test
	public void contractCorAccountTest() {
	waitContractPageToLoad();
	
	sendKeysAndAssert("1", "Количество цифр в Корр.счет должно быть 19-20.");//Ввод единицы в поле ввода банковского счета
	sendKeysAndAssert("1234567890", "Количество цифр в Корр.счет должно быть 19-20.");//Ввод 10ти цифр в поле ввода банковского счета
	sendKeysAndAssert("zxcvbnmasdafg", "Корр.счет может содержать только цифры.");//Ввод букв в поле ввода банковского счета
	sendKeysAndAssert("!;:?*()_+=@#$%^&", "Корр.счет может содержать только цифры.");//Ввод символов в поле ввода банковского счета
	
	driver.findElement(By.id("edit-bank-details-kor-account")).click();// без клика и очистки поле не заполняется
	driver.findElement(By.id("edit-bank-details-kor-account")).clear();
	driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys("1234567890123456789");	//Ввод в поле ввода БИК
	driver.findElement(By.id("edit-submit")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//ожидание загрузки страницы
	assertEquals(driver.findElement(By.cssSelector("div.bDocWrap > h1")).getText(), "ДОГОВОР ОБ ОКАЗАНИИ УСЛУГ СВЯЗИ № 100126");
	}
	
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-kor-account")).click();// без клика и очистки поле не заполняется
		driver.findElement(By.id("edit-bank-details-kor-account")).clear();
		driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys(keys);	//Ввод в поле ввода БИК
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	}
		
	private void waitContractPageToLoad()
    {
    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
    	
    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "Вход"
    	driver.switchTo().frame("iframe_autor");
    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина пароля
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
    	
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    	
    	driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //Нажатие "Оформить"
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    }
}
