package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyingAdditionalNumberTest  extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//нажатие "изменить"
		WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.content_body_header")));//ожидание загрузки страницы
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath("//span/ul/li")).click();//проверка возможности выбора из списка
		
		//проверка наличи€ категорий номеров
		driver.findElement(By.xpath("//li[3]/a")).isDisplayed();
		driver.findElement(By.xpath("//li[4]/a")).isDisplayed();
		driver.findElement(By.xpath("//li[5]/a")).isDisplayed();
		
		//проверка наличи€ номеров телефонов
		driver.findElement(By.xpath("//li/label/input")).isDisplayed();
		driver.findElement(By.xpath("//li[2]/label/span")).isDisplayed();
		driver.findElement(By.xpath("//li[2]/label/input")).isDisplayed();
		driver.findElement(By.xpath("//div[3]/li[2]/label/span")).isDisplayed();
		driver.findElement(By.xpath("//div[3]/li[2]/label/input")).isDisplayed();
		
	}
	private void waitAdminPageToLoad()
    {
    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "¬ход"
    	driver.switchTo().frame("iframe_autor");
    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина парол€
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "¬ход"
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    }
}