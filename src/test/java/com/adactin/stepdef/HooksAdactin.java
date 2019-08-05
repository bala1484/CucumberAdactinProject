package com.adactin.stepdef;

import java.io.File;
import java.io.IOException;

import com.adactin.baseclass.BaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksAdactin {

	@Before
	public void beforeHooks() {
		System.out.println("Scenario will Run");
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {
		System.out.println("Scenario Completed");
		if (scenario.isFailed()) {
			File takeScreenShot = BaseClass.takeScreenShot(scenario.getName());
			Reporter.addScreenCaptureFromPath(takeScreenShot.getAbsolutePath());
		}

	}

}
