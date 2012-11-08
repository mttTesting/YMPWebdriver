package NotWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.YouMagicPro.LKA_tests.TestBase;

public class SettingsYourNumbersTest extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажатие кнопки "настройки"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/div/span")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//div[3]/span")).getText(), "Определяемый номер");//проверяем переход по ссылке выбора доп. номера
		
		
		driver.findElement(By.xpath("//div[4]/div/a/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label")));//ожидание загрузки страницы
		driver.findElement(By.xpath("//li/label/span")).click();//выбор номера
		driver.findElement(By.xpath("//li/label/input")).click();
		driver.findElement(By.xpath("//div[2]/input")).click();//нажатие "сохранить"
		
		
	}
}
