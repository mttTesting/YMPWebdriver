package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


public class CheckForAvaliabilityYourVoiceMenuPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityYourVoiceMenuPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[3]/span[2]");//Переход по ссылке Переадресация (Follow me)
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Переадресация (Follow me)"));

	}

}
