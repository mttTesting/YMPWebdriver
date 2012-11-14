package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class PhoneChangeContactFirstNameTest extends TestBase{
	@Test
	public void  phoneCreateAndDeleteGroupTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("link=Редактировать контакты");//Нажатие на пункт меню "Редактирование контактов"
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'ред.')])[2]");//Нажатие на кнопку редактирования контакта
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "B1");//добавить контакт ("B1")
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//сохранить
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("B1"));//проверка добавления контакта
		selenium.click("link=Редактировать контакты");//Нажатие на пункт меню "Редактирование контактов"
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'ред.')])[2]");//Нажатие на кнопку редактирования контакта
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "x1");//изменить имя контакта
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//сохранить
		Thread.sleep(4000);
	}
}