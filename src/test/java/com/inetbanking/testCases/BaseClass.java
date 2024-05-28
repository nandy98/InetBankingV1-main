package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;
import com.inetbanking.utilities.Reporting;

public class BaseClass extends Reporting{

	ReadConfig readConfig = new ReadConfig();
	public String baseURL = readConfig.getApplicationURL();
	public String username =readConfig.getUsername();
	public String password =readConfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup( @Optional("defaultBrowser") String br) {
		
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome")) {
	
		
		driver = new ChromeDriver();
		}
		
	else if(br.equals("firefox")) {
			driver = new FirefoxDriver();
			test = extent.createTest("Launch Browser");
			test.info(" Driver Running");
	}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		test = extent.createTest("Launch Browser");
		test.info(" Driver Closed");
	}
	
	
	
	
	
}
