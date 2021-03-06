package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderByEmailOrderWithoutDocTypeCheckedTest  extends TestBase{
	@Test
	public void orderByEmailOrderWithoutDocTypeCheckedTest_C25656() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//�������� �������� ��������
		
		driver.findElement(By.xpath("//span/span/span")).click();//���� �� ����������� ������, ����� ���� �������� - e-mail
		driver.findElement(By.xpath("//li[3]")).click();
		
		driver.findElement(By.xpath("//form/div/div/div/div/div/span")).click();//������� ������� � ����� ����������
		driver.findElement(By.xpath("//div/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//form/div/div/div/div/div[3]/span")).click();
		driver.findElement(By.xpath("//div[4]/span")).click();
		
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//������� �� "���������"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div[2]/div/div/div/div")));//�������� �������� ��������
		assertEquals(driver.findElement(By.xpath("//div/div/div[2]/div/div/div/div")).getText(), "���������� ������� ��� ���������.");
		
	}
}