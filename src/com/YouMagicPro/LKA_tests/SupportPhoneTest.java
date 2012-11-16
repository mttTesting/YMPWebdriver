package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SupportPhoneTest extends TestBase{
	@Test
	public void SupportPhoneTest_C25679() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//span[4]/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div/div")));//ожидание загрузки страницы
		
		assertEquals(driver.findElement(By.xpath("//td[2]/div/span")).getText(), "+7 (800) 333-31-40");
	}
}