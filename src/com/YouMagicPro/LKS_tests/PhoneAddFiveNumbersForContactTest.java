package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;



public class PhoneAddFiveNumbersForContactTest extends TestBase{
	@Test
	public void  phoneAddGroupAndCancelTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");//Нажатие на кнопку "Добавить номер"
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "t1");//Ввод имени и 5 номеров для контакта
		selenium.type("id=edit-contact-telephone1", "001");
		selenium.type("id=edit-contact-telephone2", "002");
		selenium.type("id=edit-contact-telephone3", "003");
		selenium.type("id=edit-contact-telephone4", "004");
		selenium.type("id=edit-contact-telephone5", "005");
		selenium.click("id=edit-save");//Нажатие кнопки "Сохранить"
		Thread.sleep(8000);
		selenium.click("//div[@onclick='callByContacts(\"005\"); return false;']");//Осуществление вызовов по 5 номерам
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='callByContacts(\"004\"); return false;']");
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='callByContacts(\"003\"); return false;']");
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='callByContacts(\"002\"); return false;']");
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
		Thread.sleep(5000);
		selenium.click("//td[2]/a[2]");//Удаление контакта
		selenium.click("id=edit-submit");
		Thread.sleep(3000);
	}
}