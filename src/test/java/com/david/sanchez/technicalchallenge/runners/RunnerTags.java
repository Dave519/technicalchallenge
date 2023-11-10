package com.david.sanchez.technicalchallenge.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/userstory.feature",
        tags = "@stories",
        glue = "com.david.sanchez.technicalchallenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
