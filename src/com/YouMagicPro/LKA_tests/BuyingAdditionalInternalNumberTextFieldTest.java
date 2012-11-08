package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyingAdditionalInternalNumberTextFieldTest  extends TestBase{
	@Test
	public void buyingAdditionalInternalNumberTextFieldTest_C15112() {
		waitAdminPageToLoad();	
		driver.findElement(By.xpath("//tr[3]/td[3]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));//ожидание загрузки страницы
		driver.findElement(By.id("edit-add-count-employee")).sendKeys("1234");//проверка ввода в поле кол-ва дополнительных номеров
		driver.findElement(By.xpath("//div[3]/div/div/div/a")).click();//нажатие кнопки отмены
		driver.findElement(By.xpath("//span[3]/a")).click(); //нажатие "выйти"
	}
}
