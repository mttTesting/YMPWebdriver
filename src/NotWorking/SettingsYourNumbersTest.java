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
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//������� ������ "���������"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/div/span")));//�������� �������� ��������
		assertEquals(driver.findElement(By.xpath("//div[3]/span")).getText(), "������������ �����");//��������� ������� �� ������ ������ ���. ������
		
		
		driver.findElement(By.xpath("//div[4]/div/a/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label")));//�������� �������� ��������
		driver.findElement(By.xpath("//li/label/span")).click();//����� ������
		driver.findElement(By.xpath("//li/label/input")).click();
		driver.findElement(By.xpath("//div[2]/input")).click();//������� "���������"
		
		
	}
	private void waitAdminPageToLoad()
    {
    	driver.get("http://umagicpro-pp.rnd.mtt/");//�������� �������
    	driver.findElement(By.xpath("//span")).click();//������� �� ������ "����"
    	driver.switchTo().frame("iframe_autor");
    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//���� ������ ������
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//������� �� ������ "����"
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
    }
}
