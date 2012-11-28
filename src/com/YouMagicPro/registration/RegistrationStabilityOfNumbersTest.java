package com.YouMagicPro.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationStabilityOfNumbersTest extends TestBaseReg{
	@Test
	public void  registrationStabilityOfNumbersTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//li[4]/a");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Бронзовые");
		selenium.click("link=Платиновые");
		AssertJUnit.assertTrue(selenium.isTextPresent("(499)"));
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-city-wrapper']/span/ul/li[2]");
		Thread.sleep(10000);
		selenium.click("link=Платиновые");
		selenium.click("link=Бронзовые");
		selenium.click("link=Обычные");
		AssertJUnit.assertTrue(selenium.isTextPresent("(812)"));
	}
}