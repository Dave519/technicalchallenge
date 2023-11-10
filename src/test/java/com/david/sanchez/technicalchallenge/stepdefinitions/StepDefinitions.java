package com.david.sanchez.technicalchallenge.stepdefinitions;


import com.david.sanchez.technicalchallenge.model.UserData;
import com.david.sanchez.technicalchallenge.questions.Answers;
import com.david.sanchez.technicalchallenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That user wants to sign up on the Utest platform$")
    public void that_user_wants_to_sign_up_on_the_Utest_platform() {
        OnStage
                .theActorCalled("David")
                .wasAbleTo(UtestHomePage.webSite());
    }

    @When("^User clicks on the signup button$")
    public void user_clicks_on_the_sign_up_button() {
        OnStage
                .theActorInTheSpotlight()
                .attemptsTo(SignUp.enterData());
    }

    @When("^User fills out the form to sign up$")
    public void user_fills_out_the_form_to_sign_up(List<UserData> userData) {
        OnStage
                .theActorInTheSpotlight()
                .attemptsTo(
                        FillOutAboutYou.goOn(userData),
                        FillOutAddress.goOn(userData),
                        FillOutDevice.finalStep(),
                        FillOutFinish.toFinish(userData));
    }

    @Then("^User verifies that the new user has been successfully created$")
    public void user_verifies_that_the_new_user_has_been_successfully_created(List<UserData> Userdata) {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen
                        .seeThat(Answers
                                .toThe(Userdata.get(0)
                                        .getStrVerifyRegister())));
    }

}