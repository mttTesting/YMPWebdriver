package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBankAccountTest extends TestBase{
	@Test
	public void contractFillBankAccountTest() {
		waitContractPageToLoad();
	
		sendKeysAndAssert("1", "����� ������ ����������� ����� ������ ���� ����� 20 ������.");//���� ������� � ���� ����� ����������� �����
		sendKeysAndAssert("1234567890", "����� ������ ����������� ����� ������ ���� ����� 20 ������.");//���� 10�� ���� � ���� ����� ����������� �����
		sendKeysAndAssert("abcdefgh", "����� ����������� ����� ����� ��������� ������ �����.");//���� ���� � ���� ����� ����������� �����
		sendKeysAndAssert("abcdefgh12345", "����� ����������� ����� ����� ��������� ������ �����.");//���� ���� � ���� � ���� ����� ����������� �����
		sendKeysAndAssert("!;:?*()_+=@#$%^&", "����� ����������� ����� ����� ��������� ������ �����.");//���� ��������� ���� ����� ����������� �����
	}

}
