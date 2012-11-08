package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractKppOneNumberInTextFieldTest extends TestBase{
	@Test
	public void contractKppTest_C15048_C15052() {
	waitContractPageToLoad();

	sendKeysAndAssert("1","Количество цифр в КПП должно быть 9.");//вводим 1 в поле ввода КПП
	sendKeysAndAssert("123456","Количество цифр в КПП должно быть 9.");//вводим 1 в поле ввода КПП
	sendKeysAndAssert("asdfghjklq","КПП может содержать только цифры.");//вводим буквы в поле ввода КПП
	sendKeysAndAssert("as123454jklq","КПП может содержать только цифры.");//вводим буквы и цифры в поле ввода КПП
	sendKeysAndAssert("!;:?*()_+=@#$%^&","КПП может содержать только цифры.");//вводим символы и цифры в поле ввода КПП
	
	}

}
