package com.goibibo.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.goibibo.page.BaseLib;
import com.goibibo.page.FlightBooking;

public class Flightbooktest extends BaseLib {
	
	FlightBooking Fbook;
	@Test
	public void bookRoundTrip() throws InterruptedException
	{
		Fbook = new FlightBooking(driver);
		Fbook.bookRoundTrip(driver,"Delhi (DEL)","Mumbai (BOM)", "Mon, 17 Aug", "Thu, 20 Aug","Shilpi","viltoriashilpi9@gmail.com","1234567890");
		Reporter.log("Flight for round trip booked successfully");
	}

}
