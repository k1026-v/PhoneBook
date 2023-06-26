package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends BaseHelper {
    public HeaderHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginLink() {
        click(By.xpath("//a[text()='LOGIN']"));
    }

    public void clickOnSignOutButton() {
        click(By.xpath("//button[.='Sing Out']"));
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.xpath("//a[text()='LOGIN']"));
    }

    public boolean isSignOutButtonPresent() {
        return isElementPresent1(By.xpath("//button[.='Sign Out']"));
    }

    public void cklickOnAddLink() {
        click(By.cssSelector("[href='/add']"));
    }

    public boolean isLogoPresent() {
        return isElementPresent1(By.xpath("//h1[text()='PHONEBOOK']"));
    }

    public boolean isHomeLinkPresent() {
        return isElementPresent1(By.xpath("//a[text()='HOME']"));
    }

    public boolean isAboutLinkPresent() {
        return isElementPresent1(By.xpath("//a[text()='ABOUT']"));
    }
}
