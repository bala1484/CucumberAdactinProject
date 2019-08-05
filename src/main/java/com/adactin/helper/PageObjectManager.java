package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.SearchPage;
import com.adactin.pom.loginPage;

public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver bdriver) {
		this.driver = bdriver;
	}
	
	public loginPage lp;

	public loginPage getLp() {
		if (lp==null) {
			lp=new loginPage(driver);			
		}
		return lp;
	}
	
	public SearchPage sp;

	public SearchPage getSp() {
		if (sp==null) {
			sp=new SearchPage(driver);			
		}
		return sp;
	}
}
