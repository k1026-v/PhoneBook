package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition (){
        if (!app.getHeader().isLoginLinkPresent()){
            app.getHeader().clickOnSignOutButton();
        }
        app.getHeader().clickOnLoginLink();
    }

    @Test
    public void loginPositiveTest(){
        //[placeholder='Email']
        // [placeholder='Password']
        //[name='registration']

        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("k_iv07@ukr.net")
                .setPassword("12345678Com$"));

        app.getUser().clickOnLoginButton();

        Assert.assertTrue(app.getHeader().isSignOutButtonPresent());

    }

    @Test
    public void loginNegativeWhithoutPasswordTest(){


        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("k_iv07@ukr.net"));

        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());



    }

}
