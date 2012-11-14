package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpenseStructureChooseIntNumbersPageTest extends TestBase{
	@Test
	public void expenseStructureChooseIntNumbersPageTest_C15102() {
		waitAdminPageToLoad();
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//нажимаем на dth[ytt "изменить"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//form/div/div/div/div")).getText(), "Выбор номера");//проверяем переход по ссылке выбора доп. номера
		}
}