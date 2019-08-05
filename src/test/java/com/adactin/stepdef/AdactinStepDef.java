package com.adactin.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SearchPage;
import com.adactin.pom.loginPage;
import com.adactin.testrunner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDef extends BaseClass {
	
	public  WebDriver driver = TestRunner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User is able to Launch the application$")
	public void user_is_able_to_Launch_the_application() throws Throwable {
		getUrl("http://adactin.com/HotelApp");
	}

	@When("^User is able to enter the UserName in the Login page$")
	public void user_is_able_to_enter_the_UserName_in_the_Login_page(String args) throws Throwable {
		//loginPage lp = new loginPage(driver);
		inputValuestoWebelement(pom.getLp().getUsername(), args);
	}

	@When("^User is able to enter the Password in the Login page$")
	public void user_is_able_to_enter_the_Password_in_the_Login_page() throws Throwable {
		loginPage lp = new loginPage(driver);
		inputValuestoWebelement(lp.getPassword(), "123456");
	}

	@When("^User is able to click the login button$")
	public void user_is_able_to_click_the_login_button() throws Throwable {
		loginPage lp  = new loginPage(driver);
		clickonWebelement(lp.getLogin());
	}

	  @Then("^User verify the account name$")
	  public void user_verify_the_account_name() throws Throwable { 
		 loginPage lp = new	  loginPage(driver);
		 String text = lp.getAccountname().getAttribute("value");
		 Assert.assertEquals("Hello Ayappakkam!",text );
		 System.out.println("Test Passed"); 
		 }
	  @When("^User able to select the location$")
	  public void user_able_to_select_the_location() throws Throwable {
		  SearchPage sp = new SearchPage(driver);
		  selectDropDownOption(sp.getLocation(), "value", "Sydney");
	  }

	  @When("^User able to select the hotel$")
	  public void user_able_to_select_the_hotel() throws Throwable {
		  SearchPage sp = new SearchPage(driver);
		  selectDropDownOption(sp.getHotels(), "visibletext", "Hotel Creek");
	  }

	  @When("^User able to select the room type$")
	  public void user_able_to_select_the_room_type() throws Throwable {
		  SearchPage sp = new SearchPage(driver);
		  selectDropDownOption(sp.getRoomType(), "index", "1");
	  }

	  @When("^User able to select number of rooms$")
	  public void user_able_to_select_number_of_rooms() throws Throwable {
		  SearchPage sp = new SearchPage(driver);
		  selectDropDownOption(sp.getNoofRooms(), "value", "2");
	  }

	  @When("^User able to select '(.*)' in checkin date box$")
	  public void user_able_to_select_in_checkin_date_box(String indate) throws Throwable {
		  SearchPage sp = new SearchPage(driver);
		  sp.getInDate().clear();
		  inputValuestoWebelement(sp.getInDate(), indate);
	  }

	  @When("^User able to select '(.*)' in checkout date box$")
	  public void user_able_to_select_in_checkout_date_box(String outdate) throws Throwable {
		  SearchPage sp = new SearchPage(driver);
		  sp.getOutDate().clear();
		  inputValuestoWebelement(sp.getOutDate(), outdate);
	  }

	  @Then("^User able to click the search button$")
	  public void user_able_to_click_the_search_button() throws Throwable {
		  SearchPage sp = new SearchPage(driver);
		  clickonWebelement(sp.getSearchbtn());
	  }

	  @Then("^User able to logout the application$")
	  public void user_able_to_logout_the_application() throws Throwable {
		  SearchPage sp = new SearchPage(driver);
		  clickonWebelement(sp.getLogOutbtn());
	  }
}
