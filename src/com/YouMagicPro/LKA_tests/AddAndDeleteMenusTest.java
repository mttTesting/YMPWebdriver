package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteMenusTest extends TestBaseReg{
	@Test
	public void addAndDeleteMenusTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Администратор");
		selenium.waitForPageToLoad("90000");
		selenium.type("id=edit-name-1", "100126"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("60000");
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("link=Настройки"); //Переход в меню "Настройки"->" Голосовое меню"
		selenium.waitForPageToLoad("60000");
		selenium.click("//div[4]/a/div");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[3]/div[2]/a/span"); //Клик по ссылке "Добавить меню"
		Thread.sleep(17000);
		
		
		
		selenium.click("id=edit-ivr-name"); //Ввод названия и предназначения меню
		selenium.type("id=edit-ivr-name", "Меню");
		selenium.click("id=edit-submit"); //Нажатие кнопки "Сохранить"
		Thread.sleep(8000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Меню")); //Проверка наличия на странице текста с названием добавленного меню
		selenium.click("css=span.bSongdelete.bSongFiles_MarginControls"); //Клик по пиктограмме удаления меню
		selenium.click("css=span.phone_confirm_text"); //Подтверждение удаления
		Thread.sleep(14000);
		AssertJUnit.assertFalse(selenium.isTextPresent("Меню")); //Проверка отсутствия на странице текста с названием удаленного меню
	}
}
