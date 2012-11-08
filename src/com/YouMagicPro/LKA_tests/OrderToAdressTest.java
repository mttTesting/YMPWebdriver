package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderToAdressTest  extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.id("edit-phone")).sendKeys("1121111");//изменяем поля ввода номера и имени
		driver.findElement(By.id("edit-first-name")).sendKeys("Иван");
		
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//нажатие на "сохранить"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/div/ul/li")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//div[2]/div/div/div/div/ul/li")).getText(), "Заполните поле индекс.");//проверяем, вывелось ли предупреждение о незаполненных полях
		
		driver.findElement(By.xpath("//form/div/div/div/div/div/span")).click();//убираем галочки с типов документов
		driver.findElement(By.xpath("//div/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//form/div/div/div/div/div[3]/span")).click();
		driver.findElement(By.xpath("//div[4]/span")).click();
		
		driver.findElement(By.id("edit-address-postcode")).sendKeys("141070");//заполняем поля с данными
		driver.findElement(By.id("edit-address-city")).sendKeys("йййй");
		driver.findElement(By.id("edit-address-street")).sendKeys("qqqq");
		driver.findElement(By.id("edit-address-house")).sendKeys("14");
		driver.findElement(By.id("edit-address-apartment")).sendKeys("1");
		
		
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//нажатие на "сохранить"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div[2]/div/div/div/div")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//div/div/div[2]/div/div/div/div")).getText(), "Необходимо выбрать тип документа.");
		
		driver.findElement(By.xpath("//div/div/div[3]/div/a")).click();//нажатие кнопки отмены
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[3]/div/div[2]/div/div/div")));
		assertEquals(driver.findElement(By.xpath("//td[3]/div/div[2]/div/div/div")).getText(), "Баланс");//проверка, закрылось ли окно
		
	}
}
