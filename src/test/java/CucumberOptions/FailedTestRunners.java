package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//htm,xml.json,junit,extent
@CucumberOptions(features="@target/failed_scenarios.txt",
glue="StepDefinations",
tags="@PlaceOrder or @OfferPage",
plugin= {"html:target/Cucumber.html","json:target/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedTestRunners extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
