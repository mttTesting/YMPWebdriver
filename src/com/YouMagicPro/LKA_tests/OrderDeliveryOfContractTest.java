package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderDeliveryOfContractTest  extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//span/span/span")).click();//проверка работоспособности выпадающего списка типа доставки
		driver.findElement(By.xpath("//span/ul/li[2]")).click();
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath("//li[3]")).click();
		
		driver.findElement(By.xpath("//div/div/div[3]/div/a")).click();//нажатие кнопки ќтменить
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[3]/div/div[2]/div/div/div")));//ожидание загрузки страницы
		driver.findElement(By.xpath("//td[3]/div/div[2]/div/div/div")).isDisplayed();
	}
	private void waitAdminPageToLoad()
    {
    	driver.get("http://umagicpro-pp.rnd.mtt/");//открытие портала
    	driver.findElement(By.xpath("//span")).click();//нажатие на кнопку "¬ход"
    	driver.switchTo().frame("iframe_autor");
    	driver.findElement(By.id("edit-name-1")).sendKeys("100174");//ввод логина парол€
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//нажатие на кнопку "¬ход"
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    }
}

