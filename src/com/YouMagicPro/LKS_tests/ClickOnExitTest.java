package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class ClickOnExitTest  extends TestBase{
	@Test
	public void clickOnExitTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("//span[3]/a"); //������� ������ "�����"
		selenium.waitForPageToLoad("30000");
		Thread.sleep(7000);
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� ����������� ������� ��� �� ��������� �����!"));//�������� ������� �� �������� ������ "����������� ����������� ������� ��� �� ��������� �����!"
	}

}