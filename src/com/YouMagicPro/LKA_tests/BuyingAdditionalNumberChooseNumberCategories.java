package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyingAdditionalNumberChooseNumberCategories extends TestBase{
	@Test
	public void BuyingAdditionalNumberChooseNumberCategories_C15105() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//нажатие "изменить"
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.content_body_header")));//ожидание загрузки страницы
		//проверка наличия категорий номеров
		driver.findElement(By.xpath("//li[3]/a")).isDisplayed();
		driver.findElement(By.xpath("//li[4]/a")).isDisplayed();
		driver.findElement(By.xpath("//li[5]/a")).isDisplayed();
	}

}
