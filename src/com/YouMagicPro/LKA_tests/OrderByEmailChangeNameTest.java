package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderByEmailChangeNameTest  extends TestBase{
	@Test
	public void orderByEmailChangeNameTest_C25671() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//span/span/span")).click();//клик по выпадающему списку, выбор типа доставки - e-mail
		driver.findElement(By.xpath("//li[3]")).click();
		
		driver.findElement(By.id("edit-first-name")).sendKeys("Иван");//изменяем поля ввода номера и имени
	}
}