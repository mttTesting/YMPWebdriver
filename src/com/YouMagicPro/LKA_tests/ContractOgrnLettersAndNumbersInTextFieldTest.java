package com.YouMagicPro.LKA_tests;


import org.testng.annotations.Test;

public class ContractOgrnLettersAndNumbersInTextFieldTest  extends TestBase{
	@Test
	public void contractOgrnLettersAndNumbersInTextFieldTest_C15057() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_ogrn("as123454jklq","ОГРН может содержать только цифры.");//вводим буквы и цифры в поле ввода ОГРН
	}

}
