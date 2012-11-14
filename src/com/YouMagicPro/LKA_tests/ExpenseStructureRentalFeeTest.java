package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpenseStructureRentalFeeTest extends TestBase{
	@Test
	public void expenseStructureRentalFeeTest_C15096() {
		waitAdminPageToLoad();
		assertEquals(driver.findElement(By.xpath("//div[4]/div/table/tbody/tr/td[2]/span")).getText(), "354");//проверяем абон.плату
		}
}