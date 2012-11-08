package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBankAccountTest extends TestBase{
	@Test
	public void contractFillBankAccountTest() {
		waitContractPageToLoad();
	
		sendKeysAndAssert("1", "Длина номера банковского счета должна быть равна 20 цифрам.");//Ввод единицы в поле ввода банковского счета
		sendKeysAndAssert("1234567890", "Длина номера банковского счета должна быть равна 20 цифрам.");//Ввод 10ти цифр в поле ввода банковского счета
		sendKeysAndAssert("abcdefgh", "Номер банковского счета может содержать только цифры.");//Ввод букв в поле ввода банковского счета
		sendKeysAndAssert("abcdefgh12345", "Номер банковского счета может содержать только цифры.");//Ввод букв и цифр в поле ввода банковского счета
		sendKeysAndAssert("!;:?*()_+=@#$%^&", "Номер банковского счета может содержать только цифры.");//Ввод симвволов поле ввода банковского счета
	}

}
