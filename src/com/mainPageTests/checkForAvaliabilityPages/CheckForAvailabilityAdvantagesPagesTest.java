package com.mainPageTests.checkForAvaliabilityPages;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

//9. Проверка доступности страниц меню "Преимущества"
public class CheckForAvailabilityAdvantagesPagesTest extends TestBase{
	@Test
	public void  checkForAvailabilityAdvantagesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("//li/ul/li/a"); //Проход по ссылке "Преимущества " -> "Полноценная АТС без расходов на «железо»"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Полноценная АТС без расходов на «железо»"));
		selenium.click("//li/ul/li[3]/a");//Проход по ссылке "Преимущества " -> "Немедленное использование"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Немедленное использование"));
		selenium.click("//li/ul/li[5]/a");//Проход по ссылке "Преимущества " -> "Персональный личный кабинет сотрудника"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Персональный личный кабинет сотрудника"));
		selenium.click("//li/ul/li[7]/a");//Проход по ссылке "Преимущества " -> "Качественное постпродажное обслуживание"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Качественное постпродажное обслуживание"));
		selenium.click("//li/ul/li[9]/a");//Проход по ссылке "Преимущества " -> "5 бесплатных внутренних номеров"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 бесплатных внутренних номеров"));
		selenium.click("//li/ul/li[11]/a");//Проход по ссылке "Преимущества " -> "Удобный кабинет администратора"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Удобный кабинет администратора"));
		selenium.click("//li/ul/li[13]/a");//Проход по ссылке "Преимущества " -> "Квалифицированная поддержка"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Квалифицированная поддержка"));
		selenium.click("//li/ul/li[2]/a");//Проход по ссылке "Преимущества " -> "Бесплатные звонки внутри сети"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Бесплатные звонки внутри сети"));
		selenium.click("//li/ul/li[4]/a");//Проход по ссылке "Преимущества " -> "Высокое качество связи"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Высокое качество связи"));
		selenium.click("//li/ul/li[6]/a");//Проход по ссылке "Преимущества " -> "Мобильность в любое время и в любом месте"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Мобильность в любое время и в любом месте"));
		selenium.click("//li/ul/li[8]/a");//Проход по ссылке "Преимущества " -> "Быстрая онлайн регистрация"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Быстрая онлайн регистрация"));
		selenium.click("//li/ul/li[10]/a");//Проход по ссылке "Преимущества " -> "Уникально низкие цены"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Уникально низкие цены"));
		selenium.click("//li/ul/li[12]/a");//Проход по ссылке "Преимущества " -> "Доступность на всех устройствах"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Доступность на всех устройствах"));
		selenium.click("//li/ul/li[14]/a");//Проход по ссылке "Преимущества " -> "Сравнение с другими АТС"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));	
	}

}
