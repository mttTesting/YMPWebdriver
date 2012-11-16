package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneCreateAndDeleteGroupTest extends TestBaseReg{
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
		
		selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
		Thread.sleep(7000);
		selenium.click("link=Добавить группу");//Нажатие на кнопку "Добавить группу"
		Thread.sleep(3000);
		selenium.type("id=edit-group-name", "g1");//Ввод имени группы (g1)	
		selenium.click("id=edit-save");//Нажатие кнопки "Сохранить"
		selenium.click("id=edit-submit");
		Thread.sleep(7000);
		selenium.click("xpath=(//dt[@onclick='contactsGroupAccordion(this);'])[2]");
		AssertJUnit.assertTrue(selenium.isTextPresent("g1"));//Проверка, есть ли на странице текст с названием группы (g1)
		selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
		Thread.sleep(5000);
		selenium.click("//td[2]/a[2]");//Удалить группу g1
		Thread.sleep(7000);
		selenium.click("id=edit-submit");//Нажатие кнопки "Сохранить"
		Thread.sleep(7000);
		AssertJUnit.assertFalse(selenium.isTextPresent("g1"));//Проверка, есть ли на странице текст с названием группы (g1)
	}
}
