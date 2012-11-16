package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationAdminNoFieldsFilledTest extends TestBase{
			@Test
			public void authorizationNoLoginTest() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();
				driver.switchTo().frame("iframe_autor");
				
				driver.findElement(By.id("edit-submit-1")).click();
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/div")));//ожидание загрузки страницы
				assertEquals(driver.findElement(By.xpath("//td/div/div")).getText(), "Логин обязателен для заполнения");
			}
			
}
