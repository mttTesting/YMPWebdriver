package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBikLettersInTextFieldTest  extends TestBase{
	@Test
	public void contractBikTestLettersInTextField_C15023() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_bik("asdfghjklm", "БИК может содержать только цифры.");//Ввод букв в поле ввода БИК
	}

}
