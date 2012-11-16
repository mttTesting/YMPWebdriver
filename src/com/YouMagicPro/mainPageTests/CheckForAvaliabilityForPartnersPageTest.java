package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityForPartnersPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityForPartnersPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//h6[4]/a");//Переход по ссылке "Партнерам"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Партнерам"));
		
	}
	


}
