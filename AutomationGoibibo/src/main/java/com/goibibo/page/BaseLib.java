package com.goibibo.page;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;






public class BaseLib {
	
	
		public WebDriver driver;
		WaitUtils wLib;
		@BeforeMethod
		public void preCondition () throws MalformedURLException, InterruptedException {
			 
					//Save Chrome Opions
					ChromeOptions options = new ChromeOptions();
								options.addArguments("--test-type");

					System.setProperty("webdriver.chrome.driver", "C:\\Nomisma\\AutomationGoibibo\\Executables\\chromedriver.exe");
					driver = new ChromeDriver(options);
					Reporter.log("Chrome browser is Launched", true);
					driver.manage().window().maximize();
					driver.get("https://www.goibibo.com");
					wLib = new WaitUtils();
					wLib.implictWaitForSeconds(driver, 40);
				}
				

		
		 @AfterMethod
			public void postCondition(ITestResult r) throws IOException{
				
				driver.close();
				Reporter.log("Browser Closed", true);
				
}
}