package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityIVRPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityIVRPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[4]/div/table/tbody/tr/td[2]/h3/a");//Переход по ссылке "Голосовое меню (IVR)"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовое меню (IVR)"));
		
	}

}
