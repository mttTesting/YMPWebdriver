package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class YourNumbersTest  extends TestBaseReg{
	@Test
	public void yourNumbersTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=�������������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
	
		selenium.click("link=���������");// ������� � ���� "���������"
		Thread.sleep(8000);
		
		AssertJUnit.assertTrue(selenium.isElementPresent("id=74997043123"));//�������� ����������� �� �������� ��������������� ���������
		AssertJUnit.assertTrue(selenium.isElementPresent("id=bFilesFind_button_text"));
		
	}
}
