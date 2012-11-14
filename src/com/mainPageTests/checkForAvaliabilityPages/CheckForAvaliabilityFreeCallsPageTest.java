package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityFreeCallsPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityFreeCallsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[3]/span[2]/a");//Переход по ссылке "5 бесплатных внутренних номеров"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 бесплатных внутренних номеров"));
		
	}

}
