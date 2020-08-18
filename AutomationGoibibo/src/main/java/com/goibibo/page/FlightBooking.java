package com.goibibo.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class FlightBooking {
	

	@FindBy (xpath = "//*[@id='header']/div[1]/ul/li[1]/a/i")
	private WebElement flightbookele;
	@FindBy (xpath = "//*[@id='roundTrip']")
	private WebElement roundtripele;
	//@FindBy (xpath = "//*[@id='option1.getText()]")
	@FindBy (id="gosuggest_inputSrc")
	private WebElement fromele;
	@FindBy (xpath = "//*[@id='gosuggest_inputDest']")
	private WebElement Toele;
	@FindBy (xpath = "//*[@id='departureCalendar']")
	private WebElement Departureele;
	@FindBy (xpath = "//*[@id='returnCalendar']")
	private WebElement Returnele;
	@FindBy (xpath = "//*[@id='pax_link_common']/span")
	private WebElement travelerele;
	@FindBy (xpath = "//div[@class='DayPicker-Body']")
	private WebElement datepicker;
	@FindBy (xpath = "//*[@id='adultPaxPlus']")
	private WebElement adltpls;
	@FindBy (xpath = "//*[@id='childPaxPlus']")
	private WebElement childpls;
	@FindBy (xpath = "//*[@id='infantPaxPlus']")
	private WebElement infantpls;
	@FindBy (xpath = "//*[@id='gi_class']")
	private WebElement selecttype;
	@FindBy (xpath = "//*[@id='gi_search_btn']")
	private WebElement search;
	@FindBy (xpath = "(//*[@id='PRICE']/span)[1]")
	private WebElement sort;
	@FindBy (xpath = "//div//span//input[@id='NAV42#:G8268G8307radioBtn']")
	private WebElement flightckeckbox;
	@FindBy (xpath = "//div//span//input[@value='BOOK']")
	private WebElement bookbtn;
	@FindBy (id="Adulttitle1")
	private WebElement title;
	@FindBy (id="AdultfirstName1")
	private WebElement firstname;
	@FindBy (id="email")
	private WebElement email;
	@FindBy (id="mobile")
	private WebElement phonenumber;
	@FindBy (xpath="//*[@id='travellerForm']/div[2]/button")
	private WebElement proceed;
	@FindBy (xpath="(//div//input[@value='Delhi (DEL)'])[2]")
	private WebElement fromele1;
	@FindBy (xpath="(//div//input[@value='Mumbai (BOM)'])[2]")
	private WebElement Toele1;
	
	WaitUtils wlib;
	public FlightBooking(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void bookRoundTrip(WebDriver driver,String frmplce,String toplace,String date1,String date2,String frstname,String emailid,String phone) throws InterruptedException
	{
		JavascriptExecutor js;
		wlib = new WaitUtils();
		//flightbookele.click();
		roundtripele.click();
		fromele.sendKeys(frmplce);
		wlib.explicitWait_elementToBeClickable(driver, 50, fromele1);
		fromele1.click();
		
	Toele.sendKeys(toplace);
	wlib.explicitWait_elementToBeClickable(driver, 50, Toele1);
	 Toele1.click();
	//Toele.sendKeys(Keys.ENTER);
 Departureele.click();
	 wlib.explicitWaitvisibility(driver, 20,  datepicker);
js=(JavascriptExecutor)driver;

 js.executeScript("arguments[0].setAttribute('value','"+date1+"');",Departureele);
 Returnele.click();
 js.executeScript("arguments[0].setAttribute('value','"+date2+"');",Returnele);
	
 
//Returnele.sendKeys(returndate);
 travelerele.click();
 adltpls.click();
	childpls.click();
	infantpls.click();
 Select s = new Select(selecttype);
 s.selectByIndex(0);
 
 search.click();

 sort.click();
flightckeckbox.click();
 bookbtn.click();
 js.executeScript("window.scrollBy(0,900)", "");
 Select s2 = new Select(title);
s2.selectByIndex(1);
firstname.sendKeys(frstname);
email.sendKeys(emailid);
phonenumber.sendKeys(phone);
proceed.click();
	Reporter.log("Booking details added successfully");
		
	}

	
	
}
