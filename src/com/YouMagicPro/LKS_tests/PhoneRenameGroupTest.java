package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class PhoneRenameGroupTest extends TestBase{
	@Test
	public void settingsPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("link=Редактировать контакты");//нажатие кнопки "Редактировать контакты"
		Thread.sleep(4000);
		selenium.click("//tr[2]/td[2]/a"); //нажатие на "карандаш"
		Thread.sleep(4000);
		selenium.type("id=edit-group-name", "test1");//редактирование имени группы
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("test1"));//проверка наличия текста "test1"
		selenium.click("//tr[2]/td[2]/a");//нажатие на "карандаш"
		Thread.sleep(4000);
		selenium.type("id=edit-group-name", "test");//ввод нового имени группы
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//сохранить
		Thread.sleep(4000);
	}
}