package testCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	
	
	@Test(priority=1)
	public void openBRoswser() throws InterruptedException
	{
		
//		
//		WebDriver driver = new ChromeDriver();
//
//		// giving the chrome driver path
//
//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
//
//		
		WebDriver driver=new ChromeDriver();
		
		System.setProperty(System.getProperty("user.dir"), "\\src\\main\\java\resources\\chromedriver.exe");
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println("THis is my first test case");
		
	}

	@Test(priority=2)
	public void LoginBtnTest1()
	{
		System.out.println("THis is my first test case");
		
	}
	@Test(priority=3)
	public void LoginBtnTest2()
	{
		System.out.println("THis is my first test case");
		
	}
	@Test(priority=4)
	public void LoginBtnTest3()
	{
		System.out.println("THis is my first test case");
		
	}
}
