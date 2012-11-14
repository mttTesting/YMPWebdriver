package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityIncomingCallsPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityIncomingCallsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("id=s2");
		selenium.click("//div[2]/div[3]/div/table/tbody/tr/td[2]/h3/a");//Переход по ссылке "Обработка входящих вызовов"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Обработка входящих вызовов"));
		
	}

}
