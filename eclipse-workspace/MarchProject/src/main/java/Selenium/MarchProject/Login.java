package Selenium.MarchProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mobilebtn =  driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobilebtn.click();
		
	// Hover concepts
		
		WebElement AccountList = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(AccountList).build().perform();
		
		WebElement youraccount = driver.findElement(By.xpath("//span[text()='Your Account']"));
		youraccount.click();		
		
	// Radio button concepts
		
		WebElement flagbtn =  driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
		flagbtn.click();
		WebElement HiRadio = driver.findElement(By.xpath("//input[@value='hi_IN']//following-sibling::i[@class='a-icon a-icon-radio']"));
		boolean selectstatus = HiRadio.isSelected();
		System.out.println("Status of Radio button is ->"+selectstatus);
		if(HiRadio.isSelected())
		{
			System.out.println("Radio button is already selected");
		}
		else
		{
			HiRadio.click();
		}

	// Drop down
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		//s1.selectByIndex(11);
		//s1.selectByValue("search-alias=audible");
		s1.selectByVisibleText("Baby");
		//driver.close();
	}

}
