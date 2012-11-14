package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilitySettingsPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilitySettingsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[2]/div/div/div/div/table/tbody/tr/td[2]/a");//Переход по ссылке "Настройка"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка"));
		
	}

}
