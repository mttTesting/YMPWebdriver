package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneAddNumberToContactTest extends TestBaseReg{
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
		
		selenium.click("//div[4]/nobr/a");// Нажатие на пункт меню "Редактирование контактов"
		Thread.sleep(4000);
		selenium.click("//tr[5]/td[2]/a");//Выбор контакта и нажатие кнопки редактировать
		Thread.sleep(4000);
		selenium.type("id=edit-contact-telephone3", "333");//Добавление номера
		selenium.click("id=edit-save");//Нажатие кнопки "Сохранить"
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//Нажатие кнопки "Сохранить"
		Thread.sleep(4000);
		selenium.click("//dd[2]/a");//Звонок по выбранному номеру
		Thread.sleep(14000);
		//selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[4]/nobr/a");
		Thread.sleep(4000);
		selenium.click("//tr[5]/td[2]/a");
		Thread.sleep(4000);
		selenium.type("id=edit-contact-telephone3", "");//удаление добавленного номера
		selenium.click("id=edit-save");//Нажатие кнопки "Сохранить"
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//Нажатие кнопки "Сохранить"
		Thread.sleep(4000);
	}
}