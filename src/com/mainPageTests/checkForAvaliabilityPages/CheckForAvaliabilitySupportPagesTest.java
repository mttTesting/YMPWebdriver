package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class CheckForAvaliabilitySupportPagesTest extends TestBase{
	@Test
	public void checkForAvaliabilitySupportPagesTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/");

		selenium.click("//li[5]/ul/li/a");//Переход по ссылке "Обратная связь"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Обратная связь"));
		selenium.click("//li[5]/ul/li[2]/a");//Переход по ссылке "Общие вопросы"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Общие вопросы"));
		selenium.click("//li[5]/ul/li[3]/a");//Переход по ссылке "Обучение"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Обучение"));
	}
}
