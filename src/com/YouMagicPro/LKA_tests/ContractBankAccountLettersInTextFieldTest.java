package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBankAccountLettersInTextFieldTest extends TestBase{
	@Test
	public void contractBankAccountLettersInTextFieldTest_C14995() {
		waitContractPageToLoad();
		
		sendKeysAndAssert_bankAccount("abcdefgh", "Номер банковского счета может содержать только цифры.");//Ввод букв в поле ввода банковского счета
	}

}
