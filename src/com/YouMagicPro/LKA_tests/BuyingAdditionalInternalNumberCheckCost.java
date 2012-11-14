package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyingAdditionalInternalNumberCheckCost  extends TestBase{
	@Test
	public void buyingAdditionalInternalNumberCheckCost_C15113() {
		waitAdminPageToLoad();		
		driver.findElement(By.xpath("//tr[3]/td[3]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//form/div/div/div/div")).getText(), "Стоимость внутреннего номера 35.4 руб./мес. (с НДС)\nСумма будет списана с вашего счета согласно тарифу");//проверяем переход по ссылке выбора доп. номера
	}
}