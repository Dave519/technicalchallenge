package com.david.sanchez.technicalchallenge.questions;

import com.david.sanchez.technicalchallenge.userinterface.FinishRegistration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answers implements Question<Boolean> {

    private String strVerifyRegister;

    public Answers(String strVerifyRegister) {
        this.strVerifyRegister = strVerifyRegister;
    }
    public static Answers toThe(String strVerifyRegister ) {
        return new Answers(strVerifyRegister);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String outcome = Text.of(FinishRegistration.CONFIRM_REGISTER).viewedBy(actor).asString();
        result = strVerifyRegister.equals(outcome);
        return result;
    }

}
