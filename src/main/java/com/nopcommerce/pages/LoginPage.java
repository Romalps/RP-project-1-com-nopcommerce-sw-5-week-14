package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutAsGuestLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButtonLink;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement registerTabLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    //2.21Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckoutAsGuestTab() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Checkout As Guest tab " + checkoutAsGuestLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Checkout As Guest tab " + checkoutAsGuestLink);
        clickOnElement(checkoutAsGuestLink);
    }


    //2.18 Click on “REGISTER” tab
    public void clickOnRegisterTab() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Register tab " + registerTabLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Register tab " + registerTabLink);
        clickOnElement(registerTabLink);
    }

    //Click On Login Link
    public void clickOnLoginLink() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Login Link " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Login Link " + loginLink);
        clickOnElement(loginLink);
    }

    // Enter Email field element and send element
    public void enterEmailField() {
        Reporter.log("Enter Email " + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email " + emailField);
        sendTextToElement(emailField, "prime8912@gmail.com");
    }


    // Enter Password field element and send element
    public void enterPasswordFiled() {
        Reporter.log("Enter password " + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter password " + passwordField);
        sendTextToElement(passwordField, "Prime8912");
    }

    // Click on login button link

    public void clickOnLoginButtonLink() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Login Button " + loginButtonLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Login Button " + loginButtonLink);
        clickOnElement(loginButtonLink);
    }


}
