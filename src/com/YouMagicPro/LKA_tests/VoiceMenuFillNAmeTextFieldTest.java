package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class VoiceMenuFillNAmeTextFieldTest extends TestBase {
	@Test
	public void voiceFillNAmeTextFieldTest_C15293() {
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
	
	driver.findElement(By.xpath("//div[4]/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div[2]/div/div/div/span/span/b")));
	driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/span/span/b")).click();
	driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/span/ul/li[2]")).click();
	driver.findElement(By.xpath("//div[2]/span/span/span")).click();
	driver.findElement(By.xpath("//div[2]/span/ul/li[2]")).click();
	}
}