package com.qa.Gembook.stepDefinition;

import com.gemini.generic.ui.utils.DriverAction;
import com.qa.Gembook.Locators.Locator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class gembook extends DriverAction {

    @Given("^Click on Signin Button$")
    public void signIn() {

        if (DriverAction.isExist(Locator.signInbtn)) {
            DriverAction.click(Locator.signInbtn, "Click on Sign In", "Successfully clicked");
        }
        DriverAction.waitSec(2);
    }

    @Then("^user enters the username$")
    public void enterloginDetails() throws InterruptedException {
        List<String> list = new ArrayList<>(getWindowHandles());
        switchToWindow(list.get(1));
        waitUntilElementAppear(Locator.username, 20);
        typeText(Locator.username, "deeksha.singh@geminisolutions.com");
        DriverAction.waitSec(5);
        DriverAction.click(Locator.clickNext);
        waitSec(10);

        waitUntilElementAppear(Locator.password,20);
        typeText(Locator.password,"hello#123");
        click(Locator.clickNext);
        click(Locator.clickNo);
        waitSec(30);
        switchToWindow(list.get(0));
        waitSec(20);
    }

//    @Then("^The user enters the password")
//    public void enterPass(){
//        waitUntilElementAppear(Locator.password,20);
//        typeText(Locator.password,"hello#123");
//        click(Locator.clickNext);
//        click(Locator.clickNo);
//        waitSec(30);
//    }


}

