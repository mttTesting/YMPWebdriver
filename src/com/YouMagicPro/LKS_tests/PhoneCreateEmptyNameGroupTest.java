package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class PhoneCreateEmptyNameGroupTest extends TestBase{
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
		Thread.sleep(15000);
		selenium.click("link=Добавить группу");//Нажатие на кнопку "Добавить группу"
		Thread.sleep(3000);
		selenium.click("id=edit-save");//Нажатие кнопки "Сохранить"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Имя"));//Проверка, есть ли на странице текст "Имя" (признак того, что сохранение отменилось)

	}
}