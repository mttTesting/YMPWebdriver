package com.YouMagicPro.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;


public class RegistrationEnterNumberOfEmployees  extends TestBaseReg{
	@Test
	public void  registrationEnterNumberOfEmployees() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");
		selenium.click("//li[4]/a");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");
		selenium.click("//label/input");
		selenium.click("id=edit-next");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-workers-count", "89");
		AssertJUnit.assertEquals("89", selenium.getValue("id=edit-workers-count"));
	}
}
