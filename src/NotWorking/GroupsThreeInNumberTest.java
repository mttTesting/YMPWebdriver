package NotWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.YouMagicPro.LKA_tests.TestBase;

public class GroupsThreeInNumberTest extends TestBase{
	@Test
	public void groupsThreeInNumberTest_C15189() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "Группы"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//div[3]/a/div")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
		driver.findElement(By.xpath("//td[2]/div/span")).click();//закрываем всплывающее окно
		
		driver.findElement(By.xpath("//a/div/span")).click();//нажимаем на кнопку добавления группы
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label")));
		driver.findElement(By.id("edit-group-name")).sendKeys("Группа");//заполняем данные группы
		driver.findElement(By.id("edit-group-id")).sendKeys("111");//заполняем данные группы
		driver.findElement(By.id("edit-submit")).click();//нажимаем сохранить
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));
		assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), "Длинна номера группы должна быть от 3 до 4 цифр.");//проверяем, вывелась ли ошибка
	}
}