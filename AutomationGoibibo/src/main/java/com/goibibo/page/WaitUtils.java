package com.goibibo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils{
	

		public void implictWaitForSeconds(WebDriver driver, int time){
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		
		public void implictWaitForMinutes(WebDriver driver, int time){
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
		}
		
		public void explicitWait(WebDriver driver, int time, By locator){
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public void explicitWaitvisibility(WebDriver driver, int time, WebElement element){
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		public void explicitiWaitlocated(WebDriver driver, int time, By locator){
			WebDriverWait iwait = new WebDriverWait(driver, time);
			iwait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
		}
		public void explicitWait_elementToBeClickable(WebDriver driver, int time, WebElement element){
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeClickable(element));	
		}
		

	
}
