package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderByPickUpTest  extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//span/span/span")).click();//клик по выпадающему списку, выбор типа доставки - самовывоз
		driver.findElement(By.xpath("//span/ul/li[2]")).click();
		
		driver.findElement(By.id("edit-phone")).sendKeys("1121111");//изменяем поля ввода номера и имени
		driver.findElement(By.id("edit-first-name")).sendKeys("Иван");
		
		driver.findElement(By.xpath("//form/div/div/div/div/div/span")).click();//убираем галочки с типов документов
		driver.findElement(By.xpath("//div/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//form/div/div/div/div/div[3]/span")).click();
		driver.findElement(By.xpath("//div[4]/span")).click();
		
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//нажатие на "сохранить"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div[2]/div/div/div/div")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//div/div/div[2]/div/div/div/div")).getText(), "Необходимо выбрать тип документа.");
		
		driver.findElement(By.xpath("//div/div/div[3]/div/a")).click();//нажатие кнопки отмены
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[3]/div/div[2]/div/div/div")));
		assertEquals(driver.findElement(By.xpath("//td[3]/div/div[2]/div/div/div")).getText(), "Баланс");//проверка, закрылось ли окно
		
	}
	private void waitAdminPageToLoad()
    {
    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "Вход"
    	driver.switchTo().frame("iframe_autor");
    	driver.findElement(By.id("edit-name-1")).sendKeys("100174");//ввод логина пароля
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    }
}
