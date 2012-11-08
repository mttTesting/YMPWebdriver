package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Buying804NumberCostOfNumberTest  extends TestBase{
	@Test
	public void buying804NumberCostOfNumberTest_C25623() {
		waitAdminPageToLoad();
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();//нажатие на "»зменить" верхнее
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));
		driver.findElement(By.xpath("//span/span/span")).click();//выбор 
		driver.findElement(By.xpath("//li[3]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));
		
		assertEquals(driver.findElement(By.xpath("//ul/span/span")).getText(), "јбонентска€ плата 116.82 руб. (с Ќƒ—) в мес€ц согласно тарифу");
	}
}
