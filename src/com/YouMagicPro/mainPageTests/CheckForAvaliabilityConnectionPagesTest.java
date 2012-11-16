package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityConnectionPagesTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityConnectionTest() throws Exception {
	selenium.open("http://umagicpro-pp.rnd.mtt/");
	selenium.waitForPageToLoad("30000");
	selenium.click("//li[4]/ul/li/a");//Переход по ссылке "Регистрация"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Регистрация"));
	selenium.click("//li[4]/ul/li[2]/a");//Переход по ссылке "Настройка"
	selenium.waitForPageToLoad("30000");
	selenium.click("//h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("Настройка"));
	selenium.click("//li[4]/ul/li[3]/a");//Переход по ссылке "Дисковое пространство"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Дисковое пространство"));
	selenium.click("//li[4]/ul/li[4]/a");//Переход по ссылке "Оборудование"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Оборудование"));
	selenium.click("//li[4]/ul/li[5]/a");//Переход по ссылке "Приложения"
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Приложения"));
	selenium.click("//li[4]/ul/li[6]/a");//Переход по ссылке "Сравнение с другими АТС"
	selenium.waitForPageToLoad("30000");
	selenium.click("css=h1");
	AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));
	}
}
