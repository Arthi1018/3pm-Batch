package com.adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactin.feature" , glue = "com\\adactin\\stepdef\\Step_Def"
,monochrome = true, dryRun = false, plugin =  {"com.cucumber.listener.ExtentCucumberFormatterCucu Report/Cucu.html"})
public class Test_Runner {

}
