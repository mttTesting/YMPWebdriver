package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class VoiceMenuChooseSoundTest extends TestBase {
	@Test
	public void voiceMailChooseSoundTest_C15294() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[4]/a/div")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[2]/div/span")));//ожидание загрузки страницы
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[3]/div/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label")));
	
	driver.findElement(By.id("edit-ivr-name")).sendKeys("М1");
	driver.findElement(By.xpath("//span/span/span")).click();
	driver.findElement(By.xpath("//span/ul/li[2]")).click();
	driver.findElement(By.xpath("//span/span/span")).click();
	driver.findElement(By.xpath("//li[3]")).click();
	driver.findElement(By.xpath("//span/span/span")).click();
	driver.findElement(By.xpath("//li[4]")).click();
	driver.findElement(By.xpath("//span/span/span")).click();
	driver.findElement(By.xpath("//li[5]")).click();
	driver.findElement(By.id("edit-submit")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div/div/span")));
	
	
	assertEquals(driver.findElement(By.xpath("//div[3]/div/div/span")).getText(), "М1");

	}
}