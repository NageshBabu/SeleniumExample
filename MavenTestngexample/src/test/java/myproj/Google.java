package myproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google 
{
    WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void search(String br) 
	{	   
	   if(br.matches("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","E:/Testing/Seliniumsoftwares/chromedriver/chromedriver.exe");	
	       driver=new ChromeDriver();
	   }
	   if(br.matches("firefox"))
	   {   
		   System.setProperty("webdriver.gecko.driver","E:/Testing/Seliniumsoftwares/geckodriver17/geckodriver.exe");
		   driver=new FirefoxDriver();
	   }
	   
	   driver.get("http://www.google.com");	      
	   driver.findElement(By.name("q")).sendKeys("selenium");
	   driver.findElement(By.name("btnG")).click();
	}
}
