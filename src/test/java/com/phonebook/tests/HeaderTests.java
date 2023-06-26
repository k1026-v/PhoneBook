package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @Test
    public void isLogoExist() {
        Assert.assertTrue(app.getHeader().isLogoPresent());
    }

    @Test
    public void isHomeElementExist() {
       Assert.assertTrue(app.getHeader().isHomeLinkPresent());
    }


    @Test
    public void isAboutElementExist() {
        Assert.assertTrue(app.getHeader().isAboutLinkPresent());
    }

    @Test
    public void isLoginElementExist() {
        Assert.assertTrue(app.getHeader().isLoginLinkPresent());
    }
}
