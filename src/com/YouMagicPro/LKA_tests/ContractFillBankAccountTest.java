package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractFillBankAccountTest extends TestBase{
	@Test
	public void contractFillBankAccountTest() {
		waitContractPageToLoad();
	
		sendKeysAndAssert("1", "Длина номера банковского счета должна быть равна 20 цифрам.");//Ввод единицы в поле ввода банковского счета
		sendKeysAndAssert("1234567890", "Длина номера банковского счета должна быть равна 20 цифрам.");//Ввод 10ти цифр в поле ввода банковского счета
		sendKeysAndAssert("abcdefgh", "Номер банковского счета может содержать только цифры.");//Ввод букв в поле ввода банковского счета
		sendKeysAndAssert("abcdefgh12345", "Номер банковского счета может содержать только цифры.");//Ввод букв и цифр в поле ввода банковского счета
		sendKeysAndAssert("!;:?*()_+=@#$%^&", "Номер банковского счета может содержать только цифры.");//Ввод симвволов поле ввода банковского счета
	}
	
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-bank-account")).click();	
		driver.findElement(By.id("edit-bank-details-bank-account")).clear();
		driver.findElement(By.id("edit-bank-details-bank-account")).sendKeys(keys);	//Ввод в поле ввода банковского счета
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), "Номер банковского счета может содержать только цифры.");
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
