package com.phonebook.tests;

import com.phonebook.model.Contact;
import com.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase{

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

        app.getHeader().cklickOnAddLink();
        app.getContact().fillAddContactForm(new Contact().setName("Kate")
                .setLastName("Ivanova")
                .setPhone ( "1234567890")
                .setEmail("add@gmail.com")
                .setAddress("Munchen")
                .setDesc("Kate"));
        app.getContact().clickOnSaveButton();
    }

    @Test
    public void removeContactTest(){


        int sizeBefore = app.getContact().sizeOfContats();

        app.getContact().removeContact1("Kate");

        app.getContact().pause(1000);

        int sizeAfter = app.getContact().sizeOfContats();

        Assert.assertEquals(sizeAfter, sizeBefore-1);
    }


}
