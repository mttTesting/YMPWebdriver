package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBikTest  extends TestBase{
	@Test
	public void contractBikTest() {
	waitContractPageToLoad();
	
	sendKeysAndAssert("1", "Количество цифр в БИК должно быть 9.");//Ввод единицы в поле ввода БИК
	sendKeysAndAssert("asdfghjklm", "БИК может содержать только цифры.");//Ввод букв в поле ввода БИК
	sendKeysAndAssert("asdfgh121212", "БИК может содержать только цифры.");//Ввод букв и цифр в поле ввода БИК
	sendKeysAndAssert("!;:?*()_+=@#$%^&", "БИК может содержать только цифры.");//Ввод букв и цифр в поле ввода БИК

	}
	
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-bik")).click();// без клика и очистки поле не заполняется
		driver.findElement(By.id("edit-bank-details-bik")).clear();
		driver.findElement(By.id("edit-bank-details-bik")).sendKeys(keys);	//Ввод в поле ввода БИК
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
