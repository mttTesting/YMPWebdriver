package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityShedulesPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityShedulesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=s2");
		selenium.click("//div[2]/div[4]/div/table/tbody/tr/td[2]/h3/a");//Переход по ссылке "Настройка расписаний"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка расписаний"));
		
	}

}
