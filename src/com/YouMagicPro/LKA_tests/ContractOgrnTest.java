package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractOgrnTest  extends TestBase{
	@Test
	public void contractFillBankAccountTest() {
	waitContractPageToLoad();

	sendKeysAndAssert("1","���������� ���� � ���� ������ ���� �� 13 �� 15.");//������ 1 � ���� ����� ����
	sendKeysAndAssert("123456","���������� ���� � ���� ������ ���� �� 13 �� 15.");//������ 1 � ���� ����� ����
	sendKeysAndAssert("asdfghjklq","���� ����� ��������� ������ �����.");//������ ����� � ���� ����� ����
	sendKeysAndAssert("as123454jklq","���� ����� ��������� ������ �����.");//������ ����� � ����� � ���� ����� ����
	sendKeysAndAssert("!;:?*()_+=@#$%^&","���� ����� ��������� ������ �����.");//������ ������� � ����� � ���� ����� ����
	
	}

}
