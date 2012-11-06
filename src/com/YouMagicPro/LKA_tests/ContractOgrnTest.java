package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractOgrnTest  extends TestBase{
	@Test
	public void contractFillBankAccountTest() {
	waitContractPageToLoad();

	sendKeysAndAssert("1","Количество цифр в ОГРН должно быть от 13 до 15.");//вводим 1 в поле ввода ОГРН
	sendKeysAndAssert("asdfghjklq","ОГРН может содержать только цифры.");//вводим буквы в поле ввода ОГРН
	sendKeysAndAssert("as123454jklq","ОГРН может содержать только цифры.");//вводим буквы и цифры в поле ввода ОГРН
	sendKeysAndAssert("!;:?*()_+=@#$%^&","ОГРН может содержать только цифры.");//вводим символы и цифры в поле ввода ОГРН
	
	}
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-ogrn")).click();// без клика и очистки поле не заполняется
		driver.findElement(By.id("edit-bank-details-ogrn")).clear();
		driver.findElement(By.id("edit-bank-details-ogrn")).sendKeys(keys);	//Вводим keys в поле ввода ИНН
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
