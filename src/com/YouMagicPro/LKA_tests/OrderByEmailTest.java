package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderByEmailTest  extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//span/span/span")).click();//клик по выпадающему списку, выбор типа доставки - e-mail
		driver.findElement(By.xpath("//li[3]")).click();
		
		driver.findElement(By.id("edit-first-name")).sendKeys("»ван");//измен€ем пол€ ввода номера и имени
		driver.findElement(By.id("edit-email")).sendKeys("1");
		
		driver.findElement(By.xpath("//form/div/div/div/div/div/span")).click();//убираем галочки с типов документов
		driver.findElement(By.xpath("//div/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//form/div/div/div/div/div[3]/span")).click();
		driver.findElement(By.xpath("//div[4]/span")).click();
		
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//нажатие на "сохранить"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div[2]/div/div/div/div")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//div/div/div[2]/div/div/div/div")).getText(), "Ќеобходимо выбрать тип документа.");
		
		driver.findElement(By.xpath("//div/div/div[3]/div/a")).click();//нажатие кнопки отмены
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[3]/div/div[2]/div/div/div")));
		assertEquals(driver.findElement(By.xpath("//td[3]/div/div[2]/div/div/div")).getText(), "Ѕаланс");//проверка, закрылось ли окно
		
	}
}