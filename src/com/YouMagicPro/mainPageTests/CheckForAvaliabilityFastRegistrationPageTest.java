package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityFastRegistrationPageTest  extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityFastRegistrationPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[3]/div/div/div/div/table/tbody/tr/td[2]/a");//Переход по ссылке "Быстрая онлайн регистрация"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Быстрая онлайн регистрация"));
	}
}
