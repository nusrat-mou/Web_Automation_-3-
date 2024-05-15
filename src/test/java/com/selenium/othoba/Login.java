package com.selenium.othoba;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Login extends Basedriver {
	
	
	
	
	String url = "https://www.othoba.com/";
	
	@Test
	public void LoginTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		String expectedTitle = "Hassle-free online shopping in Bangladesh | Othoba.com";
		String actualTitle = driver.getTitle();
		
//		WebElement clickLogin = driver.findElement(By.linkText("Sign In"));
//		
//		clickLogin.click();
//		Thread.sleep(3000);
		
//		WebElement clickRegister = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
//		clickRegister.click();
//		Thread.sleep(3000);
//		
//		WebElement phoneValue = driver.findElement(By.id("Phone"));
//		phoneValue.sendKeys("897498890");
//		Thread.sleep(3000);
//		
//		WebElement emailValue = driver.findElement(By.id("Email"));
//		emailValue.sendKeys("nus.mou@gmail.com");
//		Thread.sleep(3000);
//		
//		WebElement genderSelect = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
//		genderSelect.click();
//		Thread.sleep(3000);
//		
//		WebElement scroll = driver.findElement(By.xpath("//button[@id='register-button']"));
//        Actions action = new Actions(driver);
//		
//		action.moveToElement(scroll).perform();
//		Thread.sleep(5000);
//		
//		
//		WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
//		firstName.sendKeys("Nusrat jahan");
//		Thread.sleep(3000);
//		
//		WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
//		lastName.sendKeys("Mou");
//		Thread.sleep(3000);
//		
//		WebElement DOB = driver.findElement(By.xpath("//body/div[2]/main[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/select[1]"));
//		DOB.click();
//		Thread.sleep(3000);
//		
//		WebElement clickDate = driver.findElement(By.xpath("//body/div[2]/main[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/select[1]/option[5]"));
//		clickDate.click();
//		Thread.sleep(3000);
//		
//		WebElement MOB = driver.findElement(By.xpath("//body/div[2]/main[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/select[2]"));
//		MOB.click();
//		Thread.sleep(3000);
//		
//		WebElement clickMonth = driver.findElement(By.xpath("//option[contains(text(),'May')]"));
//		clickMonth.click();
//		Thread.sleep(3000);
//		
//		WebElement YOB = driver.findElement(By.xpath("//body/div[2]/main[1]/main[1]/div[2]/div[1]/form[1]/div[6]/div[1]/select[3]"));
//		YOB.click();
//		Thread.sleep(3000);
//		
//		WebElement clickYear = driver.findElement(By.xpath("//option[contains(text(),'1916')]"));
//		clickYear.click();
//		Thread.sleep(3000);
//		
//		WebElement password = driver.findElement(By.id("Password"));
//		password.sendKeys("lkff1`23");
//		Thread.sleep(3000);
//		
//		WebElement confirmPass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
//		confirmPass.sendKeys("lkff1`23");
//		Thread.sleep(3000);
//		
//		WebElement submit = driver.findElement(By.id("register-button"));
//		submit.click();
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		
//		WebElement scroll2 = driver.findElement(By.xpath("//h2[contains(text(),'Recommended For You')]"));
//		action.moveToElement(scroll2).perform();
//		Thread.sleep(5000);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("food");
		Thread.sleep(3000);
		
		
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement scroll3 = driver.findElement(By.xpath("//label[contains(text(),'Filter by Rating')]"));
		Actions action = new Actions(driver);
		action.moveToElement(scroll3).perform();
		Thread.sleep(5000);
		
		
		WebElement clickItem = driver.findElement(By.xpath("//img[@id='cataloglist_prductid_239773']"));
		clickItem.click();
		Thread.sleep(3000);
		
		WebElement add = driver.findElement(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/button[1]"));
		add.click();
		Thread.sleep(3000);
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-button-239773']"));
		addToCart.click();
		Thread.sleep(3000);
		
		WebElement enterPhoneNo = driver.findElement(By.xpath("//input[@id='customerPhone']"));
		enterPhoneNo.sendKeys("9897786767");
		Thread.sleep(3000);
		
		WebElement clickSubmit = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"));
		clickSubmit.click();
		Thread.sleep(3000);
		
	    String printValidationMessage = driver.findElement(By.xpath("//span[@id='customerPhoneValidation']")).getText();
		System.out.println("Error: "+ printValidationMessage);
		
		WebElement clickClose = driver.findElement(By.xpath("//button[contains(text(),'×')]"));
		clickClose.click();
		Thread.sleep(3000);
		
		WebElement scroll4 = driver.findElement(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[1]/div[1]/section[4]/div[1]/a[1]"));
		action.moveToElement(scroll4).perform();
		Thread.sleep(3000);
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Assert passed");
		

	}

}
