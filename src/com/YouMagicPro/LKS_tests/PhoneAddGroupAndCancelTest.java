package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class PhoneAddGroupAndCancelTest extends TestBase{
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
		
		selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
		Thread.sleep(3000);
		selenium.click("link=Добавить группу");//Нажатие на кнопку "Добавить группу"
		Thread.sleep(3000);
		selenium.type("//div[2]/input", "g1");//Ввод имени группы ("g1")
		selenium.click("css=a.bPopup__eClose.close");//Нажатие кнопки "Отменить"
		selenium.click("//div[@id='contacts-block-wrapper']/dl[2]/dt/div");
		AssertJUnit.assertFalse(selenium.isTextPresent("g1"));//Проверка, есть ли на странице текст "g2"
	}
}