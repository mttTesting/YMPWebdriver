package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBikTest  extends TestBase{
	@Test
	public void contractBikTest() {
	waitContractPageToLoad();
	
	sendKeysAndAssert("1", "���������� ���� � ��� ������ ���� 9.");//���� ������� � ���� ����� ���
	sendKeysAndAssert("asdfghjklm", "��� ����� ��������� ������ �����.");//���� ���� � ���� ����� ���
	sendKeysAndAssert("asdfgh121212", "��� ����� ��������� ������ �����.");//���� ���� � ���� � ���� ����� ���
	sendKeysAndAssert("!;:?*()_+=@#$%^&", "��� ����� ��������� ������ �����.");//���� ���� � ���� � ���� ����� ���

	}
	
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-bik")).click();// ��� ����� � ������� ���� �� �����������
		driver.findElement(By.id("edit-bank-details-bik")).clear();
		driver.findElement(By.id("edit-bank-details-bik")).sendKeys(keys);	//���� � ���� ����� ���
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
		assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	}
	
	private void waitContractPageToLoad()
    {
    	driver.get("http://umagicpro-pp.rnd.mtt/");//�������� �������
    	
    	driver.findElement(By.xpath("//span")).click();//������� �� ������ "����"
    	driver.switchTo().frame("iframe_autor");
    	driver.findElement(By.id("edit-name-1")).sendKeys("100126");//���� ������ ������
    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    	driver.findElement(By.id("edit-submit-1")).click();//������� �� ������ "����"
    	
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
    	
    	driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //������� "��������"
    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
    }
}
