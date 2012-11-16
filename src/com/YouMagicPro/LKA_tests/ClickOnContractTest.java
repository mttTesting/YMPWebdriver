package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnContractTest extends TestBaseReg{
	@Test
public void clickOnContractTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Администратор");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		Thread.sleep(30000);
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("//div[5]/div[2]/span/a"); //Нажатие ссылки " Оформить"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Организационно-правовая форма")); //Проверить, что на странице есть текст "Организационно-правовая форма"
	 }

}