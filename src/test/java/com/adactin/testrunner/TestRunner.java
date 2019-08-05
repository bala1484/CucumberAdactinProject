package com.adactin.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.ConfigReader;
import com.adactin.helper.FileReadManager;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
										"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\adactin\\report\\extentreport.html",
										"html:src\\test\\resource\\com\\adactin\\report",
										"json:src\\test\\resource\\com\\adactin\\report.json",
										"junit:src\\test\\resource\\com\\adactin\\report.xml"
										},
		features="src\\test\\java\\com\\adactin\\feature\\",
		glue="com.adactin.stepdef",
		strict=true,
	//	dryRun = true,
		monochrome = true
		
		)
//strict = false -> implementation part shows all as pass
//strict = True -> implementation part pass will show pass & fail will show fail

public class TestRunner {	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Exception {
	 try {
		 
		 String browserMain = FileReadManager.getInstan().getCr().getBrowser();
		 //ConfigReader cr = new ConfigReader();
		 //String browserName = cr.getBrowser();
		driver = BaseClass.getBrowser(browserMain);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception();
		}
	 }

	@AfterClass
	public static void quit() {
		driver.quit();
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\adactin\\properties\\Extent-config.xml"));

	}
}
