package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractInnChooseFormIPTest  extends TestBase{
	@Test
	public void contractInnTest_C15032() {
	waitContractPageToLoad();
	
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //Нажатие "Оформить"
	//проверка ввода 12 цифр при организационно-правовой форме ИП
	sendKeysAndAssert("123456332012", "Проверьте правильность заполнения договора и подпишите", "//span/ul/li[4]");
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
	

}
