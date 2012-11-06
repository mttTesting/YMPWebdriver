package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractCorAccountTest extends TestBase{
	@Test
	public void contractCorAccountTest() {
	waitContractPageToLoad();
	
	sendKeysAndAssert("1", "���������� ���� � ����.���� ������ ���� 19-20.");//���� ������� � ���� ����� ����������� �����
	sendKeysAndAssert("1234567890", "���������� ���� � ����.���� ������ ���� 19-20.");//���� 10�� ���� � ���� ����� ����������� �����
	sendKeysAndAssert("zxcvbnmasdafg", "����.���� ����� ��������� ������ �����.");//���� ���� � ���� ����� ����������� �����
	sendKeysAndAssert("!;:?*()_+=@#$%^&", "����.���� ����� ��������� ������ �����.");//���� �������� � ���� ����� ����������� �����
	
	driver.findElement(By.id("edit-bank-details-kor-account")).click();// ��� ����� � ������� ���� �� �����������
	driver.findElement(By.id("edit-bank-details-kor-account")).clear();
	driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys("1234567890123456789");	//���� � ���� ����� ���
	driver.findElement(By.id("edit-submit")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//�������� �������� ��������
	assertEquals(driver.findElement(By.cssSelector("div.bDocWrap > h1")).getText(), "������� �� �������� ����� ����� � 100126");
	}
	
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-kor-account")).click();// ��� ����� � ������� ���� �� �����������
		driver.findElement(By.id("edit-bank-details-kor-account")).clear();
		driver.findElement(By.id("edit-bank-details-kor-account")).sendKeys(keys);	//���� � ���� ����� ���
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
