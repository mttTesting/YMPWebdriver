package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractBikLettersInTextFieldTest  extends TestBase{
	@Test
	public void contractBikTestLettersInTextField_C15023() {
	waitContractPageToLoad();
	
	sendKeysAndAssert("asdfghjklm", "��� ����� ��������� ������ �����.");//���� ���� � ���� ����� ���
	}

}
