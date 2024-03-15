package com.stepdef;

import com.utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@Before
	public void beforeMethods() {
		getDriver("chrome");
		searchUrl("https://accounts.vmmaps.com");
	}

	@After
	public void afterMethods(Scenario sce) {
		if (sce.isFailed()) {
			sce.attach(screenshotBase(), "name/png", sce.getName());
		}
		quit();
	}

}
