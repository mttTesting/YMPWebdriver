package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;



public class HistoryCalendarWorkingTest extends TestBase{
	@Test
	public void historyCalendarWorkingTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		Thread.sleep(30000);
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("//div/span[3]/a");//Нажатие на кнопку "История"
		Thread.sleep(5000);
		selenium.click("id=edit-from-date-datepicker-popup-0");//проверка работоспособности календаря
		selenium.click("//tbody[3]/tr[2]/td[3]/a/span");
		selenium.click("//tr[2]/td[3]/a/span");
		selenium.click("//tr[3]/td[5]/a/span");
	}
}
