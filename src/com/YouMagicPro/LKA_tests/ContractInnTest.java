package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractInnTest  extends TestBase{
	@Test
	public void contractInnTest() {
	waitContractPageToLoad();

	
	sendKeysAndAssert("1","��� ������ �������� �� 10 ��� 12 ��������.");
	sendKeysAndAssert("123456","��� ������ �������� �� 10 ��� 12 ��������.");
	sendKeysAndAssert("asdfghjklq","��� ����� ��������� ������ �����.");

	
	//�������� ����� 10 ���� ��� ��������������-�������� ����� ���
	sendKeysAndAssert("1234321220", "��������� ������������ ���������� �������� � ���������", "//span/ul/li");
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //������� "��������"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	//�������� ����� 10 ���� ��� ��������������-�������� ����� ���
	sendKeysAndAssert("1234321520", "��������� ������������ ���������� �������� � ���������", "//span/ul/li[2]");
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //������� "��������"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	//�������� ����� 10 ���� ��� ��������������-�������� ����� ���
	sendKeysAndAssert("1234321320", "��������� ������������ ���������� �������� � ���������", "//span/ul/li[3]");
	driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click(); //������� "��������"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
	//�������� ����� 12 ���� ��� ��������������-�������� ����� ��
	sendKeysAndAssert("123456332012", "��������� ������������ ���������� �������� � ���������", "//span/ul/li[4]");
	}


	
	private void sendKeysAndAssert(String keys, String errorString)
	{
		driver.findElement(By.id("edit-bank-details-inn")).click();// ��� ����� � ������� ���� �� �����������
		driver.findElement(By.id("edit-bank-details-inn")).clear();
		driver.findElement(By.id("edit-bank-details-inn")).sendKeys(keys);	//������ 10 ���� � ���� ����� ���
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.messages.error")));//�������� �������� ��������
		assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText(), errorString);
	}
	private void sendKeysAndAssert(String keys, String errorString, String xPathDropdownList)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		driver.findElement(By.id("edit-bank-details-inn")).click();// ��� ����� � ������� ���� �� �����������
		driver.findElement(By.id("edit-bank-details-inn")).clear();
		driver.findElement(By.id("edit-bank-details-inn")).sendKeys(keys);	//������ keys � ���� ����� ���
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath(xPathDropdownList)).click();
		driver.findElement(By.id("edit-submit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bDocWrap > h1")));//�������� �������� ��������
		assertEquals(driver.findElement(By.cssSelector("div.section-title")).getText(), errorString);
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
