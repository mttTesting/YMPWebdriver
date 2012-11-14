package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



//10. Проверка доступности страниц меню "Цены"
public class CheckForAvaliabilityPricesPagesTest extends TestBase{
	@Test
	public void checkForAvaliabilityPricesPageTest() throws Exception {
	selenium.open("http://umagicpro-pp.rnd.mtt/");
	
	selenium.click("//li[2]/ul/li/a");//Переход по ссылке "Красивые номера"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Красивые номера"));
	selenium.click("//li[2]/ul/li[2]/a");//Переход по ссылке "Тарифы на звонки"
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion01']/div[2]/h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("Тарифы на звонки"));
	selenium.click("//li[2]/ul/li[3]/a");//Переход по ссылке "Абонентская плата и другие услуги"
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion01']/div/h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("Абонентская плата и другие услуги"));
	selenium.click("//li[2]/ul/li[4]/a");
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion01']/div/h1");//Переход по ссылке "Дисковое пространство"
	AssertJUnit.assertTrue(selenium.isTextPresent("Дисковое пространство"));
	selenium.click("//li[2]/ul/li[5]/a");
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion06']/div/h1");//Переход по ссылке "Настройка оборудования"
	AssertJUnit.assertTrue(selenium.isTextPresent("Настройка оборудования"));
	selenium.click("//li[2]/ul/li[6]/a");//Переход по ссылке "Доставка документов"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Доставка документов"));
	selenium.click("//li[2]/ul/li[7]/a");//Переход по ссылке "Сравнение с другими АТС"
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[@id='ipBlock-seccion01']/div/h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));
	
	}
}
