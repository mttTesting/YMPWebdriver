package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CallForwardingAddNumberTest extends TestBase{
	@Test
	public void callForwardingAddNumberTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("120000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("link=Переадресация вызовов");//нажатие кнопки "Переадресация вызовов"
		Thread.sleep(5000);
		selenium.click("id=edit-schedule-add-number");//нажатие кнопки добавления номера
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-schedule-1-followme-number"));//проверка наличия элементов
		AssertJUnit.assertTrue(selenium.isElementPresent("id=1_always"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-schedule-1-schedule-from-week-day"));
	}
}