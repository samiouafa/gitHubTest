package com.phpTravels.automation;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageBoats extends Base {

	final static Logger logger = Logger.getLogger(HomePageBoats.class); 

	@Test(enabled = true)
	public void gotoHomePageBoats() {
		try {
			driver.get("https://www.phptravels.net/");

			WebElement boatsElem = driver
					.findElement(By.xpath("//*[@id=\"search\"]/div/div/div/div/div/nav/ul/li[3]/a"));
			boatsElem.click();
			Thread.sleep(5*1000);
			
			WebElement destinationBoats = driver.findElement(By.xpath("//*[@id=\"s2id_autogen19\"]"));
			destinationBoats.click();
			Thread.sleep(3 * 1000);

			WebElement boatName = driver
					.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(1) > ul > li:nth-child(2)"));
			boatName.click();
			Thread.sleep(3 * 1000);

			WebElement dateElem = driver.findElement(By.xpath("//*[@id=\"DateTours\"]"));
			dateElem.clear();
			dateElem.sendKeys("15/02/2021");
			Thread.sleep(3 * 1000);

			WebElement increaseBtn1 = driver
					.findElement(By.xpath("//*[@id=\"boats\"]/div/div/form/div/div/div[3]/div/div/div/"
							+ "div/div/div/div[2]/div/div[2]/div/span/button[1]"));
			increaseBtn1.click();
			Thread.sleep(3 * 1000);

			WebElement searchBtn = driver.findElement(
					By.cssSelector("#boats > div > div > form > div > div > div.col-lg-2.col-xs-12 > button"));
			searchBtn.click();

		} catch (Exception e) {
			logger.error("Error: ", e);
		}
	}
	
	@Test(enabled = true)
	public void toursFeatures() {
		try {
			driver.get("https://www.phptravels.net/");
			
			WebElement HongKong = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div/div[2]/div[3]/figure/a"));
			HongKong.click();
			Thread.sleep(2 * 1000);
			
			WebElement bookNowBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button"));
			bookNowBtn.submit();
			
		} catch (Exception e) {
			logger.error("Error: ", e);
		}
	}
	
	@Test(enabled = true)
	public void rentalsFeatures() {
		try {
			driver.get("https://www.phptravels.net/");
			
			WebElement sansonTerrace = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[6]/div/div[2]/div[7]/figure/a"));
			sansonTerrace.click();
			Thread.sleep(2 * 1000);
			
			WebElement description = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]/div/div/div[2]/a"));
			description.click();
			
		} catch (Exception e) {
			logger.error("Error: ", e);
		}
	}
	
	@Test(enabled = true)
	public void visaOption() {
		try {
			driver.get("https://www.phptravels.net/");
			
			WebElement visaOpt = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div/div/div/div/nav/ul/li[7]/a"));
			visaOpt.click();
			Thread.sleep(2 * 1000);
			
			WebElement fromcountry = driver.findElement(By.xpath("//*[@id=\"visa\"]/div/div/form/div/div/div[3]/div/div[2]/input"));
			fromcountry.click();
			fromcountry.sendKeys("02/13/2021");
			fromcountry.submit();
			
		} catch (Exception e) {
			logger.error("Error: ", e);
		}
	}	
}
