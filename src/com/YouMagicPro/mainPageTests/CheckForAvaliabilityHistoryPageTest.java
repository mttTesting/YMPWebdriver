package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityHistoryPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityHistoryPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");	
		selenium.click("id=s3");
		selenium.click("//div[3]/div[3]/div/table/tbody/tr/td[2]/h3/a");//Переход по ссылке "История и детализация звонков"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("История и детализация звонков"));
		
	}

}
