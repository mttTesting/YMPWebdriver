package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class LogoTest  extends TestBaseReg{
	@Test
	public void  logoTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //¬ход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=—отрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и парол€
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "¬ход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		AssertJUnit.assertTrue(selenium.isElementPresent("css=img.imagecache.imagecache-customer-logo")); //проверка наличи€ элемента с лого на странице
	}
}
