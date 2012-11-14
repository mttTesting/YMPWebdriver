package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityChooseYourNumbersPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityAboutCompanyPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//div[3]/div/div/span[2]");//Переход по ссылке "Красивые номера"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Красивые номера"));

	}
}