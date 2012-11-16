package com.YouMagicPro.mainPageTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.registration.tests.TestBaseReg;


public class CheckForAvaliabilityYourVoiceMenuPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityYourVoiceMenuPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[3]/span[2]");//Переход по ссылке Переадресация (Follow me)
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Переадресация (Follow me)"));

	}

}
