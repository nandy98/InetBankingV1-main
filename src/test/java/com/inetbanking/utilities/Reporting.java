package com.inetbanking.utilities;

import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting extends TestListenerAdapter{

	public static ExtentReports extent = new ExtentReports();
	public static ExtentTest test;
	
	@BeforeTest
	public void beforeTest() {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
		extent.attachReporter(spark);
		

	}
	@AfterTest
	public void afterTest() {
		extent.flush();
}
	
//	@Test
//	public void f1() {
//		 test = extent.createTest("Launch Browser");
//		
//		 test.log(Status.PASS, "user is able to login");
//		 test.pass("user loggedIN");
//	}
//	@Test
//	public void f2() {
//		 test = extent.createTest("Verify Login");
//		 test.info("Verify Logining");
//		 test.pass("user logged into application");
//		 test.warning("Reset password alerts displaying");
//	}
//	@Test
//	public void f3() {
//		 test = extent.createTest("Verfiy Login Dashboard");
//		 test.skip("Verify dashboard skipped");
//	}
//	@Test
//	public void f4() {
//		 test = extent.createTest("Verify user and send email from test application");
//		 test.fail("unable to email due server down");
//	}
//	@Test
//	public void f5() {
//		 test = extent.createTest("Verify reports and analytics");
//	test.fail("reports getting crashed");
//	}
//	@Test
//	public void f6() {
//			
//		 test = extent.createTest("Verfiy logout");
//		 test.pass("User logged out from application");
//		 test.info("User is redirected to login page");
//		 extent.createTest("Exception! <hELLO>")
//         .fail(new RuntimeException("A runtime exception occurred!"));
//	}
//	@Test
//	public void f7() {
//		test = extent.createTest("f7! <Hey")
//        .fail(new RuntimeException("A runtime ex-ception occurred!"));
//	}

}
