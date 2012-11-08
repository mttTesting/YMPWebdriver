package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractOgrnTest  extends TestBase{
	@Test
	public void contractFillBankAccountTest() {
	waitContractPageToLoad();

	sendKeysAndAssert("1","Количество цифр в ОГРН должно быть от 13 до 15.");//вводим 1 в поле ввода ОГРН
	sendKeysAndAssert("123456","Количество цифр в ОГРН должно быть от 13 до 15.");//вводим 1 в поле ввода ОГРН
	sendKeysAndAssert("asdfghjklq","ОГРН может содержать только цифры.");//вводим буквы в поле ввода ОГРН
	sendKeysAndAssert("as123454jklq","ОГРН может содержать только цифры.");//вводим буквы и цифры в поле ввода ОГРН
	sendKeysAndAssert("!;:?*()_+=@#$%^&","ОГРН может содержать только цифры.");//вводим символы и цифры в поле ввода ОГРН
	
	}

}
