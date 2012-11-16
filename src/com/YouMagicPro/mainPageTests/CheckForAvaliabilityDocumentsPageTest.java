package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityDocumentsPageTest extends TestBaseReg{
		@Test
		public void  checkForAvaliabilityDocumentsPageTest() throws Exception {
			selenium.open("http://umagicpro-pp.rnd.mtt/");
			selenium.click("//h6[3]/a");//Переход по ссылке "Документы"
			selenium.waitForPageToLoad("30000");
			AssertJUnit.assertTrue(selenium.isTextPresent("Документы"));
			
		}
}
