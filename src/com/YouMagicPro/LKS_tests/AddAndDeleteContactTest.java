package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class AddAndDeleteContactTest   extends TestBase{
	@Test
	public void addAndDeleteContactTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //¬ход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=—отрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и парол€
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "¬ход"
		Thread.sleep(7000);
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("//td[2]/a");//нажатие кнопки добавлени€ контакта
		Thread.sleep(7000);
		selenium.type("//div[2]/input", "x3");// ввод данных контакта
		selenium.type("id=edit-contact-telephone1", "333");
		selenium.click("id=edit-save"); //"сохранить"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isTextPresent("333")); //проверка на наличие номера "333" в списках контактов
		AssertJUnit.assertTrue(selenium.isTextPresent("x3"));
		selenium.click("link=–едактировать контакты"); //нажатие на кнопку редактировани€ контактов
		Thread.sleep(5000);
		selenium.click("xpath=(//a[contains(text(),'уд.')])[3]"); //удаление контакта
		selenium.click("id=edit-submit");//"сохранить"
		Thread.sleep(10000);
		AssertJUnit.assertFalse(selenium.isTextPresent("333")); //проверка на наличие номера "333" в списках контактов
		
		

	}
}