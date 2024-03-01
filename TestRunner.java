package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",snippets = SnippetType.CAMELCASE,glue = "org.stepdefinition",dryRun = false,
plugin = {"pretty","html:src\\test\\resources\\Reports", "junit:src\\test\\resources\\Reports\\reportXML.xml",
		"json:src\\test\\resources\\Reports\\ReportJSON.json"
		}
)

public class TestRunner {

}

