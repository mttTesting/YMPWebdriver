package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyingAdditionalNumberChooseNumbersFromList extends TestBase{
	public void BuyingAdditionalNumberChooseNumbersFromList_C15106() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//нажатие "изменить"
		WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.content_body_header")));//ожидание загрузки страницы
		//проверка наличия номеров телефонов
		driver.findElement(By.xpath("//li/label/input")).isDisplayed();
		driver.findElement(By.xpath("//li[2]/label/span")).isDisplayed();
		driver.findElement(By.xpath("//li[2]/label/input")).isDisplayed();
		driver.findElement(By.xpath("//div[3]/li[2]/label/span")).isDisplayed();
		driver.findElement(By.xpath("//div[3]/li[2]/label/input")).isDisplayed();
	}

}
