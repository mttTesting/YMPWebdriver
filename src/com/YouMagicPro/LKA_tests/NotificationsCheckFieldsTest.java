package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class NotificationsCheckFieldsTest  extends TestBase{
	@Test
	public void orderByEmailCancelButtonTest_C15141() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[7]/a/div")));
		
		driver.findElement(By.xpath("//div[7]/a/div")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div")));
		
		driver.findElement(By.xpath("//td/span")).click();
		driver.findElement(By.xpath("//tr[2]/td/span")).click();
		driver.findElement(By.xpath("//tr[3]/td/span")).click();
		driver.findElement(By.id("edit-balance-threshold")).sendKeys("100");
		
		driver.findElement(By.id("edit-notification-save")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div")));
		
		driver.findElement(By.id("edit-notification-save")).isDisplayed();
		driver.findElement(By.xpath("//div[7]/a/div")).click();
	}
}
