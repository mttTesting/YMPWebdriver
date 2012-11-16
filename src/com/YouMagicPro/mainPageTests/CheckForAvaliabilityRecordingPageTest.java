package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityRecordingPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityRecordingPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=s3");
		selenium.click("//div[3]/div/div/table/tbody/tr/td[2]/h3/a");//Переход по ссылке "Запись разговоров"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Запись разговоров"));
		
	}

}
