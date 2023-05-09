package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueTabOnRegisterPage;


    //2.20 Fill the mandatory fields
    public void fillTheMandatoryFieldsForRegistration() throws InterruptedException {
        Thread.sleep(1000);
        // Find First name field element and send element
        Reporter.log("Enter First name " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "Enter First name " + firstName);
        sendTextToElement(firstName, "Prime" + getRandomString(4));
        // Find Last name field element and send element
        Reporter.log("Enter Last name " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "Enter Last name " + lastName);
        sendTextToElement(lastName, "Tester" + getRandomString(4));
        // Find Email field element and send element
        Reporter.log("Enter Email " + email.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email " + email);
        sendTextToElement(email, "primetester" + getRandomString(4) + "@gmail.com");
        // Find Password field element and send element
        Reporter.log("Enter password " + password.toString());
        CustomListeners.test.log(Status.PASS, "Enter password " + password);
        sendTextToElement(password, "Prime54tester32");
        // Find Confirm Password field element and send element
        Reporter.log("Enter Confirm password " + confirmPassword.toString());
        CustomListeners.test.log(Status.PASS, "Enter Confirm password " + confirmPassword);
        sendTextToElement(confirmPassword, "Prime54tester32");
    }

    //2.21 Click on “REGISTER” Button
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Register button " + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Register button " + registerButton);
        clickOnElement(registerButton);
    }

    //2.23 Click on “CONTINUE” tab
    public void clickOnContinueTabOnRegisterPage() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Continue tab " + continueTabOnRegisterPage.toString());
        CustomListeners.test.log(Status.PASS, "Click on Continue tab " + continueTabOnRegisterPage);
        clickOnElement(continueTabOnRegisterPage);
    }


}
