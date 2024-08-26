package testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC01_LoginTest extends BaseClass
{
	
	@Test
	public void verify_login()
	{
		try
		{
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		logger.info("*** Login Test Started ***");
		
		LoginPage lp=new LoginPage(driver);
		lp.enter_username("Admin");
		logger.info("entered username");
		lp.enter_password(p.getProperty("username"));
		logger.info(p.getProperty("password"));
		lp.click_submit();
		logger.info("clicked on submit button");
		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		alertwindow.accept();
		logger.info("clicked on alert pop-up");
		boolean status=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		if(status)
		{
			System.out.println("passed");
			Assert.assertEquals(status, true);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("failed");
			Assert.fail();
			
		}
		
		
	}
	
	
}
