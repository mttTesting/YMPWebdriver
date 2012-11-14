package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderByPickUpChangePhoneTest  extends TestBase{
	@Test
	public void OrderByPickUpChangePhoneTest_C25666() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//span/span/span")).click();//клик по выпадающему списку, выбор типа доставки - самовывоз
		driver.findElement(By.xpath("//span/ul/li[2]")).click();
		
		driver.findElement(By.id("edit-phone")).sendKeys("1121111");//изменяем поля ввода номера и имени
		
	}
}
