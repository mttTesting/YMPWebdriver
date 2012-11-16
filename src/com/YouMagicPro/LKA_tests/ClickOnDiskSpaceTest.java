package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnDiskSpaceTest extends TestBaseReg{
	@Test
public void clickOnDiskSpaceTest () throws Exception {	 
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
		
		selenium.click("css=a > span.lMenuBlocks__hrefs"); //Нажатие ссылки со свободным местом на диске
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=free_space_all"));//Проверить, что на странице есть текст  “ Звуковые файлы“
	 }
}