package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Buying804NumberCategoriesOfNumbers  extends TestBase{
	@Test
	public void buying804NumberCategoriesOfNumbers_C25622() {
		waitAdminPageToLoad();

		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//нажатие на "Изменить" верхнее
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));
		//проверка наличия категорий номеров
		driver.findElement(By.xpath("//li[3]/a")).isDisplayed();
		driver.findElement(By.xpath("//li[4]/a")).isDisplayed();
		driver.findElement(By.xpath("//li[5]/a")).isDisplayed();		
	}
}
