package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class HistorySwitchOnlyYearAndMonth extends TestBase{
	@Test
	public void historyPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("link=История"); //Нажатие на кнопку "История"
		Thread.sleep(3000);
		selenium.click("id=edit-from-date-datepicker-popup-0");//Нажатие на иконку даты
		selenium.click("//tbody[3]/tr[2]/td[3]/a/span");
		selenium.click("id=edit-from-date-datepicker-popup-0");//Выбор года
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("id=edit-from-date-datepicker-popup-0");//Выбор месяца
		selenium.click("link=Янв");//
		selenium.click("id=edit-from-date-datepicker-popup-0");//Выбор дня
		AssertJUnit.assertEquals(selenium.getValue("id=edit-from-date-datepicker-popup-0"), "2012-09-01"); //проверка
	}
}