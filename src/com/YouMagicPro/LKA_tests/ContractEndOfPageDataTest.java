package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	public class ContractEndOfPageDataTest  extends TestBase{

    	@Test
    	public void contractEndOfPageDataTest() {
    	waitContractPageToLoad();
    		
    		WebDriverWait wait = new WebDriverWait(driver, 10);
    		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
    		
    		driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //������� "��������"
    		
    		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
    		
    		assertEquals(driver.findElement(By.xpath("//strong")).getText(), "79857297409"); //�������� ���������� ������ ������������
    		assertEquals(driver.findElement(By.xpath("//tr[2]/td/div/div/strong")).getText(), "74997043123"); //�������� ������ �������� YM.Pro 
    		assertEquals(driver.findElement(By.xpath("//tr[3]/td/div/div/strong")).getText(), "AT � ���������� SIP");//��� ������������ ����������
    		assertEquals(driver.findElement(By.xpath("//td[2]/div/strong")).getText(), "��� ���һ");//����� ��������� �����
    		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/strong")).getText(), "�������");//�������� ����
    		assertEquals(driver.findElement(By.xpath("//tr[3]/td[2]/div/strong")).getText(), "���������");//����� ��������
    		

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
	    }
}
