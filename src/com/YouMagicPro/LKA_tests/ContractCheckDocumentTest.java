package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractCheckDocumentTest  extends TestBase{
	@Test
	public void contractCheckDocumentTest() {
	waitContractPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/span/span/span")).click(); //нажатие на элементы выпадающего меню - Доверенность
	driver.findElement(By.xpath("//div[2]/div/span/ul/li[2]")).click();
	driver.findElement(By.xpath("//div[2]/div/span/span/span")).click(); //нажатие на элементы выпадающего меню - Устав
	driver.findElement(By.xpath("//div[2]/div/span/ul/li")).click();
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
    	driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //Нажатие на "Оформить"
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    }
}