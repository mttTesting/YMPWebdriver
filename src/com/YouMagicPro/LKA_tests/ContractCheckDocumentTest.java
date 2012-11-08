package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractCheckDocumentTest  extends TestBase{
	@Test
	public void contractCheckDocumentTest_C14986() {
	waitContractPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/span/span/span")).click(); //нажатие на элементы выпадающего меню - Доверенность
	driver.findElement(By.xpath("//div[2]/div/span/ul/li[2]")).click();
	driver.findElement(By.xpath("//div[2]/div/span/span/span")).click(); //нажатие на элементы выпадающего меню - Устав
	driver.findElement(By.xpath("//div[2]/div/span/ul/li")).click();
	}
}