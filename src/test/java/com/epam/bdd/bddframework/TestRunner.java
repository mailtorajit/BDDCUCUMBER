package com.epam.bdd.bddframework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.epam.bdd.bddframework.utils.BaseSelenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features/"
        , glue = {"com.epam.bdd.bddframework.steps"}
)

public class TestRunner {

	@BeforeClass
	public static void initSelenium(){BaseSelenium.init();}
	
    @AfterClass
    public static void closeDriver() {
        System.out.println("close the browser here");
        BaseSelenium.close();
    }
}