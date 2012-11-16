package com.YouMagicPro.mainPageTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.registration.tests.TestBaseReg;



//10. Проверка доступности страниц меню "Услуги"
public class CheckForAvaliabilityServicesPagesTest extends TestBaseReg{
	@Test
	public void checkForAvaliabilityServicesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		
		
		selenium.click("//li[3]/ul/li/a");//Переход по ссылке "Прямой городской номер"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Прямой городской номер"));
		selenium.click("//li[3]/ul/li[3]/a");//Переход по ссылке "Настройка сотрудников и групп"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка сотрудников и групп"));
		selenium.click("//li[3]/ul/li[5]/a");//Переход по ссылке "Голосовая почта"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовая почта (Voice to Email)"));
		selenium.click("//li[3]/ul/li[7]/a");//Переход по ссылке "Обработка входящих вызовов"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Обработка входящих вызовов"));
		selenium.click("//li[3]/ul/li[9]/a");//Переход по ссылке "Настройка расписаний"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка расписаний"));
		selenium.click("//li[3]/ul/li[11]/a");//Переход по ссылке "Черный список"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Черный список"));
		selenium.click("//li[3]/ul/li[2]/a");//Переход по ссылке "Неограниченное количество..."
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Неограниченное количество"));
		selenium.click("//li[3]/ul/li[4]/a");//Переход по ссылке "Голосовое меню"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовое меню"));
		selenium.click("//li[3]/ul/li[6]/a");//Переход по ссылке "Виртуальный факс"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Виртуальный факс"));
		selenium.click("//li[3]/ul/li[8]/a");//Переход по ссылке "Переадресация"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Переадресация"));
		selenium.click("//li[3]/ul/li[10]/a");//Переход по ссылке "История и детализация звонков"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("История и детализация звонков"));
		selenium.click("//li[3]/ul/li[12]/a");//Переход по ссылке "Сравнение с другими АТС"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));
	}

}
