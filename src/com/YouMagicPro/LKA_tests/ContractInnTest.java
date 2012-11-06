package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractInnTest  extends TestBase{
	@Test
	public void contractInnTest() {
	waitContractPageToLoad();

	
	sendKeysAndAssert("1","ИНН должен состоять из 10 или 12 символов.");
	sendKeysAndAssert("123456","ИНН должен состоять из 10 или 12 символов.");
	sendKeysAndAssert("asdfghjklq","ИНН может содержать только цифры.");

	
	//проверка ввода 10 цифр при организационно-правовой форме ООО
	sendKeysAndAssert("1234321220", "Проверьте правильность заполнения договора и подпишите", "//span/ul/li");
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //Нажатие "Оформить"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	//проверка ввода 10 цифр при организационно-правовой форме ОАО
	sendKeysAndAssert("1234321520", "Проверьте правильность заполнения договора и подпишите", "//span/ul/li[2]");
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //Нажатие "Оформить"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	//проверка ввода 10 цифр при организационно-правовой форме ЗАО
	sendKeysAndAssert("1234321320", "Проверьте правильность заполнения договора и подпишите", "//span/ul/li[3]");
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //Нажатие "Оформить"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	//проверка ввода 12 цифр при организационно-правовой форме ИП
	sendKeysAndAssert("123456332012", "Проверьте правильность заполнения договора и подпишите", "//span/ul/li[4]");
	}


	
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-inn")).click();// без клика и очистки поле не заполняется
		driver.findElement(By.id("edit-bank-details-inn")).clear();
		driver.findElement(By.id("edit-bank-details-inn")).sendKeys(keys);	//Вводим 10 цифр в поле ввода ИНН
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	}
	private void sendKeysAndAssert(String keys, String errorString, String xPathDropdownList)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
		driver.findElement(By.id("edit-bank-details-inn")).click();// без клика и очистки поле не заполняется
		driver.findElement(By.id("edit-bank-details-inn")).clear();
		driver.findElement(By.id("edit-bank-details-inn")).sendKeys(keys);	//Вводим keys в поле ввода ИНН
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath(xPathDropdownList)).click();
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.cssSelector("div.section-title")).getText(), errorString);
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
