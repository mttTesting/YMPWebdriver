package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyingAdditionalNumberChooseCityFromList  extends TestBase{
	@Test
	public void buyingAdditionalNumberChooseCityFromList_C15103() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//нажатие "изменить"
		WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.content_body_header")));//ожидание загрузки страницы
    	
    	
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath("//span/ul/li")).click();//проверка возможности выбора из списка
	}
}