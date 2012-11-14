package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityFiveNumbersPageTest  extends TestBase{
	@Test
	public void  checkForAvaliabilityFiveNumbersPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[2]/span[2]");//Переход по ссылке "5 бесплатных внутренних номеров"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 бесплатных внутренних номеров"));

	}

}
