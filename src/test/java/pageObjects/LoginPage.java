package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@name='username']") WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']") WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']") WebElement btn_submit;
	
	
	public void enter_username(String name)
	{
		txt_username.sendKeys(name);
	}
	
	public void enter_password(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void click_submit()
	{
		btn_submit.click();
	}
	
}
