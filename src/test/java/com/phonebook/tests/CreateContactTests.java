package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition (){
        if (!app.getHeader().isLoginLinkPresent()){
            app.getHeader().clickOnSignOutButton();
        }
        app.getHeader().clickOnLoginLink();

        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("k_iv07@ukr.net")
                .setPassword("12345678Com$"));

        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest(){
        app.getHeader().cklickOnAddLink();
        app.getContact().fillAddContactForm(new Contact().setName("Kate")
                .setLastName("Ivanova")
                .setPhone ( "1234567890")
                .setEmail("add@gmail.com")
                .setAddress("Munchen")
                .setDesc("Kate"));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated("Kate"));

        ;
    }

    @AfterMethod
    public void postCondition() {
        app.getContact().removeContact();
    }



}
