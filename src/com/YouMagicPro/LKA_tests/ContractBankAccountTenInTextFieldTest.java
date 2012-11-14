package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBankAccountTenInTextFieldTest extends TestBase{
	@Test
	public void contractBankAccountTenInTextFieldTest_C14994() {
		waitContractPageToLoad();
		
		sendKeysAndAssert_bankAccount("1234567890", "ƒлина номера банковского счета должна быть равна 20 цифрам.");//¬вод 10ти цифр в поле ввода банковского счета
	}

}
