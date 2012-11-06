package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BuyingAdditionalInternalNumberTest  extends TestBase{
	@Test
	public void expenseStructureTest() {
		waitAdminPageToLoad();
		
		
		driver.findElement(By.xpath("//tr[3]/td[3]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div")));//�������� �������� ��������
		
		driver.findElement(By.id("edit-add-count-employee")).sendKeys("1234");//�������� ����� � ���� ���-�� �������������� �������
		
		assertEquals(driver.findElement(By.xpath("//form/div/div/div/div")).getText(), "��������� ����������� ������ 35.4 ���./���. (� ���)\n����� ����� ������� � ������ ����� �������� ������");//��������� ������� �� ������ ������ ���. ������

		driver.findElement(By.xpath("//div[3]/div/div/div/a")).click();//������� ������ ������
		
		
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
