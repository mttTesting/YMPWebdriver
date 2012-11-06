package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExampleTest  extends TestBase{

    	@Test
    	public void exampleTest() {
    		
    		driver.get("http://umagicpro-pp.rnd.mtt/");//�������� �������
    		
    		driver.findElement(By.xpath("//span")).click();//������� �� ������ "����"
    		driver.switchTo().frame("iframe_autor");
    		driver.findElement(By.id("edit-name-1")).sendKeys("100126");//���� ������ ������
    		driver.findElement(By.id("edit-pass-1")).sendKeys("1234");		
    		driver.findElement(By.id("edit-submit-1")).click();//������� �� ������ "����"
    		
    		WebDriverWait wait = new WebDriverWait(driver, 10);
    		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
    		
    		assertEquals(driver.findElement(By.cssSelector("div.bContent__innerHeader")).getText(), "������");
    		
    }
}