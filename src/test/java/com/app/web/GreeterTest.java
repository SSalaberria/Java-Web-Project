package com.app.web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.web.controller.Greeter;

public class GreeterTest {

    @Test
    public void sumTest() {
        Assert.assertEquals((Greeter.getSum("2+2")), 4);
    }
}