package com.YouMagicPro.mainPageTests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationFieldChoiceTest extends TestBaseReg{
	@Test
	public void  registrationFieldChoiceTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//li[4]/a");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=div.bLayout__eBody");
		selenium.click("css=span.text");
		selenium.click("css=li");
		selenium.click("css=span.text");
		selenium.click("//li[2]");
		selenium.click("css=span.text");
		selenium.click("//li[3]");
		selenium.click("css=span.text");
		selenium.click("//li[4]");
		selenium.click("css=span.text");
		selenium.click("//li[5]");
		selenium.click("css=span.text");
		selenium.click("//li[6]");
		selenium.click("css=span.text");
		selenium.click("//li[7]");
		selenium.click("css=span.text");
		selenium.click("//li[8]");
	}
}