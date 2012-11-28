package com.YouMagicPro.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationLicenseAgreementFlagOffTest  extends TestBaseReg{
	@Test
	public void  registrationMobilePhoneConfirmationButtonTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		
		selenium.click("//li[4]/a");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");
		selenium.click("id=edit-next");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-last-name", "12314");
		selenium.type("id=edit-first-name", "1234");
		selenium.type("id=edit-middle-name", "1234");
		selenium.type("id=edit-mail", "111@com.com");
		selenium.type("id=edit-personal-phone", "1234");
		selenium.click("id=confirm-link");
		selenium.type("name=smscode", "1234");
		selenium.click("css=span.phone_confirm_text.conf_text");
		selenium.click("edit-next");
		AssertJUnit.assertTrue(selenium.isTextPresent("Персональная информация"));
	
	}
}