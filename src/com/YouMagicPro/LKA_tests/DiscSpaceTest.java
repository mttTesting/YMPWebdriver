package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DiscSpaceTest  extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.id("free_space_all")).isDisplayed();//проверка наличия виджета с отображением свободного места
		driver.findElement(By.id("music_space_all")).isDisplayed();
		
		assertEquals(driver.findElement(By.xpath("//div[6]/div/div/span[2]")).getText(), "191.98 МБ");//проверка отображения свободного места
		
	}
	private void waitAdminPageToLoad()
    {
    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "Вход"
    	driver.switchTo().frame("iframe_autor");
    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//ввод логина пароля
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "Вход"
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    }
}
