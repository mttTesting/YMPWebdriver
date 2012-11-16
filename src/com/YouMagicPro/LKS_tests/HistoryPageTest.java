package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class HistoryPageTest  extends TestBaseReg{
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
		
		selenium.click("//div/span[3]/a");//Нажатие на кнопку "История"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-from-date-datepicker-popup-0"));//проверка наличия календаря
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-to-date-datepicker-popup-0"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-account-filter"));
	}

}