package com.qa.Gembook.stepDefinition;

import com.gemini.generic.exception.GemException;
import com.gemini.generic.ui.utils.DriverManager;

import io.cucumber.java.Before;


public class GembookHooks {

    @Before
    public void startBrowser() throws GemException {
        DriverManager.setUpBrowser();
    }
}
