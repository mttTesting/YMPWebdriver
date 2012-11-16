package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationEmployeeNoPasswordTest extends TestBase{
			@Test
			public void authorizationNoPasswordTest() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();
				driver.switchTo().frame("iframe_autor");
				driver.findElement(By.xpath("//div[3]/a")).click();
				
				driver.findElement(By.id("edit-name-1")).sendKeys("100126");
				driver.findElement(By.id("edit-submit-1")).click();
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li")));//ожидание загрузки страницы
				assertEquals(driver.findElement(By.xpath("//li")).getText(), "Пароль обязателен для заполнения");
			}
			
}
