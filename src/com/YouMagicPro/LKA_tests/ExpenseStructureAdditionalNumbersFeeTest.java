package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpenseStructureAdditionalNumbersFeeTest extends TestBase{
	@Test
	public void expenseStructureAdditionalNumbersFeeTest_C15096() {
		waitAdminPageToLoad();
		assertEquals(driver.findElement(By.xpath("//div[4]/div/table/tbody/tr[2]/td[2]/span")).getText(), "116.82");//проверяем плату по доп.номерам
		}
}