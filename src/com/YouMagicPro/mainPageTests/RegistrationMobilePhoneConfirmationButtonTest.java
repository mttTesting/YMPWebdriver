package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationMobilePhoneConfirmationButtonTest extends TestBaseReg{
	@Test
	public void  registrationMobilePhoneConfirmationButtonTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//li[4]/a");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");
		selenium.click("//label/input");
		selenium.click("id=edit-next");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=confirm-link");
		AssertJUnit.assertTrue(selenium.isTextPresent("Номер мобильного телефона"));
		selenium.type("id=edit-personal-phone", "899878787878");
		selenium.click("id=confirm-link");
		AssertJUnit.assertTrue(selenium.isTextPresent("В течение нескольких"));
	}
}