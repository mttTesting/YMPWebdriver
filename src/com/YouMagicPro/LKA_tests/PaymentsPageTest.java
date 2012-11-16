package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PaymentsPageTest extends TestBaseReg{
	@Test
	public void soundFilesTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Администратор");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		selenium.click("css=span.modal_cansel_button_text");
	
		selenium.click("link=Платежи"); //Переход в меню "Платежи"->"Платежи и документы"
		Thread.sleep(3000);

		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-from-date-datepicker-popup-0")); //Проверка присутствия на странице соответствующих элементов
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-to-date-datepicker-popup-0"));
		AssertJUnit.assertTrue(selenium.isElementPresent("css=b.trigger"));
	
}
}