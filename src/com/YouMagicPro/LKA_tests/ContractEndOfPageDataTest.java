package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	public class ContractEndOfPageDataTest  extends TestBase{

    	@Test
    	public void contractEndOfPageDataTest_C15062() {
    		waitContractPageToLoad();
    		
    		driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //Нажатие "Оформить"
    		
    		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
    		
    		assertEquals(driver.findElement(By.xpath("//strong")).getText(), "79857297409"); //проверка мобильного номера пользователя
    		assertEquals(driver.findElement(By.xpath("//tr[2]/td/div/div/strong")).getText(), "74997043123"); //проверка номера аккаунта YM.Pro 
    		assertEquals(driver.findElement(By.xpath("//tr[3]/td/div/div/strong")).getText(), "AT с поддержкой SIP");//Тип абонентского устройства
    		assertEquals(driver.findElement(By.xpath("//td[2]/div/strong")).getText(), "ОАО «МТТ»");//Выбор оператора связи
    		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/strong")).getText(), "Простой");//Тарифный план
    		assertEquals(driver.findElement(By.xpath("//tr[3]/td[2]/div/strong")).getText(), "Авансовая");//Форма расчетов
    	}
 
}
