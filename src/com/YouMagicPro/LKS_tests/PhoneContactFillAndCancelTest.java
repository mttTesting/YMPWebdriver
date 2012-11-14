package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class PhoneContactFillAndCancelTest extends TestBase{
	@Test
	public void  phoneContactFillAndCancelTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");//Нажатие на кнопку "Добавить контакт"
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "x3");//Ввод данных контакта ("x3", "333")
		selenium.type("id=edit-contact-last-name", "x3");
		selenium.type("id=edit-contact-middle-name", "x3");
		selenium.type("id=edit-contact-telephone1", "333");
		selenium.click("id=edit-cancel");//нажатие кнопки 'отмена'
		AssertJUnit.assertFalse(selenium.isTextPresent("x3"));//проверка, есть ли на странице строка "x3"
	}
}
