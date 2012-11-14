package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpenseStructureInternalNumbersFeeTest extends TestBase{
	@Test
	public void expenseStructureInternalNumbersFeeTest_C15101() {
		waitAdminPageToLoad();
		assertEquals(driver.findElement(By.xpath("//div[4]/div/table/tbody/tr[3]/td[2]/span")).getText(), "35.4");//проверяем плату за внутренние номер
		}
}