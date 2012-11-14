package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractInnChooseFormTest  extends TestBase{
	@Test
	public void contractInnChooseForm_C15047() {
	waitContractPageToLoad();

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

	}


	private void sendKeysAndAssert(String keys, String errorString, String xPathDropdownList)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
		//driver.findElement(By.id("edit-bank-details-inn")).click();// без клика и очистки поле не заполняется
		driver.findElement(By.id("edit-bank-details-inn")).clear();
		driver.findElement(By.id("edit-bank-details-inn")).sendKeys(keys);	//Вводим keys в поле ввода ИНН
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath(xPathDropdownList)).click();
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.cssSelector("div.section-title")).getText(), errorString);
	}
	

}
