package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilityHistoryPageTest extends TestBase{
	@Test
	public void  checkForAvaliabilityHistoryPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");	
		selenium.click("id=s3");
		selenium.click("//div[3]/div[3]/div/table/tbody/tr/td[2]/h3/a");//Переход по ссылке "История и детализация звонков"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("История и детализация звонков"));
		
	}

}
