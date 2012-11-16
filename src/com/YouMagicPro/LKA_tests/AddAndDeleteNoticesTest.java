package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteNoticesTest extends TestBaseReg{
	@Test
	public void addAndDeleteNoticesTest() throws Exception {
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
		
		selenium.click("link=Настройки"); //Переход в меню "Настройки"->" Уведомления "
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[7]/a/div");
		Thread.sleep(10000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-balance-threshold")); //Проверка, присутствуют ли на странице элементы 
		AssertJUnit.assertTrue(selenium.isElementPresent("css=span.mycheckbox"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-notification-mail-list"));
		AssertJUnit.assertTrue(selenium.isElementPresent("//form[@id='porta-support-notification-form']/div/div/table/tbody/tr[3]/td/span"));		
	}
}
