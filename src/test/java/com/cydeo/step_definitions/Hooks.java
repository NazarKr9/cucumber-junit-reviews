package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before // should come from cucumber java NOT JUNIT
    public void setUp() {
        System.out.println("SET UP BEFORE EACH SCENARIO");
    }

    @After  // should come from cucumber java NOT JUNIT
    public void tearDown() {
        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }
}
