package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityForPartnersPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityForPartnersPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//h6[4]/a");//Переход по ссылке "Партнерам"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Партнерам"));
		
	}
	


}
