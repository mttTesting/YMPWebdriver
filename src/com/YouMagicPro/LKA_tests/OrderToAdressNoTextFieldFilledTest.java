package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderToAdressNoTextFieldFilledTest  extends TestBase{
	@Test
	public void OrderToAdressNoTextFieldFilledTest_C25679() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//нажатие на "сохранить"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/div/ul/li")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//div[2]/div/div/div/div/ul/li")).getText(), "На вашем балансе недостаточно денег для совершения данной операции. Пожалуйста, пополните счет.");//проверяем, вывелось ли предупреждение о незаполненных полях
		
	}
}
