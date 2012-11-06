package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractKppTest extends TestBase{
	@Test
	public void contractKppTest() {
	waitContractPageToLoad();

	sendKeysAndAssert("1","Количество цифр в КПП должно быть 9.");//вводим 1 в поле ввода КПП
	sendKeysAndAssert("asdfghjklq","КПП может содержать только цифры.");//вводим буквы в поле ввода КПП
	sendKeysAndAssert("as123454jklq","КПП может содержать только цифры.");//вводим буквы и цифры в поле ввода КПП
	sendKeysAndAssert("!;:?*()_+=@#$%^&","КПП может содержать только цифры.");//вводим символы и цифры в поле ввода КПП
	
	}
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-kpp")).click();// без клика и очистки поле не заполняется
		driver.findElement(By.id("edit-bank-details-kpp")).clear();
		driver.findElement(By.id("edit-bank-details-kpp")).sendKeys(keys);	//Вводим keys в поле ввода ИНН
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
