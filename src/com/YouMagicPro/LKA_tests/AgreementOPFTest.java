package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AgreementOPFTest extends TestBaseReg{
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
		
		selenium.click("link=Оформить");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[2]"); //Выбор в выпадающем списке "ОАО"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[3]"); //Выбор в выпадающем списке "ЗАО"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[4]"); //Выбор в выпадающем списке "ИП"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[5]"); //Выбор в выпадающем списке "Другая"
		selenium.click("css=span.text");
		selenium.click("css=ul.dropdown > li"); //Выбор в выпадающем списке "ООО"
	}
}