package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class PhoneAddEmptyContactTest extends TestBase{
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
		///
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");//нажатие на кнопку добавления контакта
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "A1");//Создать новый контакт(A1), не заполнив данные
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("A1"));//Проверить наличие на странице текста "A1"
		selenium.click("link=Редактировать контакты");//// Нажатие на пункт меню "Редактирование контактов"
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'уд.')])[3]");//// Нажатие на кнопку "Корзина"
		selenium.click("id=edit-submit");//
		Thread.sleep(4000);

	}
}