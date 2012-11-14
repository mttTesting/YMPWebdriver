package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpenseStructureChooseAdditionalNumbersTest extends TestBase{
	@Test
	public void expenseStructureChooseAdditionalNumbersTest_C15100() {
		waitAdminPageToLoad();
		driver.findElement(By.xpath("//tr[3]/td[3]/span/a")).click();//нажимаем на нижнее "изменить"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/span")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//form/div/div/div/span")).getText(), "Купить внутренние номера");//проверяем переход по ссылке выбора доп. номера
		}
}