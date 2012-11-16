package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneEmptySearchTest extends TestBaseReg{
	@Test
	public void settingsPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //¬ход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=—отрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и парол€
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "¬ход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		AssertJUnit.assertTrue(selenium.isTextPresent("111"));//проверка наличи€ текста "111"
		AssertJUnit.assertTrue(selenium.isTextPresent("222"));//проверка наличи€ текста "222"
	}
}