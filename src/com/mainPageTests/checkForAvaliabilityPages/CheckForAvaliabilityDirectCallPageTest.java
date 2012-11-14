package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityDirectCallPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityDirectCallPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[3]/ul/li/a");//Переход по ссылке "Прямой городской номер"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Прямой городской номер"));
	}

}
