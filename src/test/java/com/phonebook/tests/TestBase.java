package com.phonebook.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static AppLicationManager app = new AppLicationManager(System.getProperty("browser", Browser.CHROME.browserName()));

   // @BeforeMethod
    @BeforeSuite
    public void setUp (){
        app.init();

    }


    //@AfterMethod(enabled = false)
    @AfterSuite (enabled = false)
    public void tearDown(){
        app.stop();
    }

}
