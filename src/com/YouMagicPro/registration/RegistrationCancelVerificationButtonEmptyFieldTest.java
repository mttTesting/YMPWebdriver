package com.YouMagicPro.registration;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationCancelVerificationButtonEmptyFieldTest extends TestBaseReg{
	@Test
	public void  registrationCancelVerificationButtonEmptyFieldTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//li[4]/a");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");
		selenium.click("//label/input");
		selenium.click("id=edit-next");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=confirm-link");
		selenium.type("name=smscode", "1234");
		selenium.click("css=span.modal_cansel_button_text");

	}
}