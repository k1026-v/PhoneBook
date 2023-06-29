package com.phonebook.tests;

import com.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{

    //precondition : user should be logged out (проверяем, что нет кнопки LOGIN,
    // найди кнопку Sing OUT и кликни)

    @BeforeMethod
    public void ensurePrecondition (){
        if (!app.getHeader().isLoginLinkPresent()){
            app.getHeader().clickOnSignOutButton();
        }
        app.getHeader().clickOnLoginLink();
    }

    @Test
    public void existedUserRegistrationNegativeTest(){
        //[placeholder='Email']
        // [placeholder='Password']
        //[name='registration']

        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("k_iv07@ukr.net")
                .setPassword("12345678Com$"));

        app.getUser().clockOnRegistrationButton();

        Assert.assertTrue(app.getUser().isAlertPresent());

    }


}
