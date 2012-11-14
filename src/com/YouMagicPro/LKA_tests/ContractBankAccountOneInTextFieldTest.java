package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBankAccountOneInTextFieldTest extends TestBase{
	@Test
	public void contractBankAccountOneInTextFieldTest_C14993() {
		waitContractPageToLoad();
	
		sendKeysAndAssert_bankAccount("1", "ƒлина номера банковского счета должна быть равна 20 цифрам.");//¬вод единицы в поле ввода банковского счета
	}

}
