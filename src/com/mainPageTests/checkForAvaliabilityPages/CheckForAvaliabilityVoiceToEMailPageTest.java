package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityVoiceToEMailPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityVoiceToEMailPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=s2");
		selenium.click("//div[2]/div/div/table/tbody/tr/td[2]/h3/a");//Переход по ссылке "Голосовая почта"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовая почта (Voice to Email)"));
		
	}
}
