package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Buing804NumberTest  extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//нажатие на "Изменить" верхнее
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));//выбор 
		driver.findElement(By.xpath("//b")).click();
		driver.findElement(By.xpath("//li[3]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));//ожидание загрузки страницы
		
		assertEquals(driver.findElement(By.xpath("//ul/span/span[2]")).getText(), "Стоимость номера 1180 руб. (с НДС) согласно тарифу");
		
		//проверка наличия категорий номеров
		driver.findElement(By.xpath("//li[3]/a")).isDisplayed();
		driver.findElement(By.xpath("//li[4]/a")).isDisplayed();
		driver.findElement(By.xpath("//li[5]/a")).isDisplayed();
	}
	private void waitAdminPageToLoad()
    {
    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "Вход"
    	driver.switchTo().frame("iframe_autor");
    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина пароля
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    }
}
