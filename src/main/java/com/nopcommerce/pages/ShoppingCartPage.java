package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement qtyLink;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCartLink;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfServiceCheckboxLink;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement agreeTermsOfServiceCheckbox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement nokiaLumiaCheckoutButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkboxOnShoppingCartPage;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButtonOnShoppingCartPage;

    public void changeTheQtyTo2() throws InterruptedException {
        Thread.sleep(1000);
        // 2.16 Change the Qty to "2"
        Reporter.log("Change the Quantity to 2 " + qtyLink.toString());
        CustomListeners.test.log(Status.PASS, "Change the Quantity to 2 " + qtyLink);
        qtyLink.clear();
        sendTextToElement(qtyLink, "2");
    }


    // Click on "Update shopping cart"
    public void updateTheShoppingCartAfterChangingQty() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Update Shopping Cart button " + updateShoppingCartLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Update Shopping Cart button " + updateShoppingCartLink);
        clickOnElement(updateShoppingCartLink);
    }


    // 2.18 click on checkbox “I agree with the terms of service”
    public void clickTermsOfServiceCheckbox() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on I agree with the terms of service checkbox " + termsOfServiceCheckboxLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on I agree with the terms of service checkbox " + termsOfServiceCheckboxLink);
        clickOnElement(termsOfServiceCheckboxLink);
    }


    //2.19 Click on “CHECKOUT”
    public void clickOnCheckoutButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on checkout button " + checkOutLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on checkout button " + checkOutLink);
        clickOnElement(checkOutLink);
    }


    //2.15 click on checkbox “I agree with the terms of service”
    public void clickOnCheckboxIAgreeWithTheTermsOfService() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on I agree with the terms of service checkbox " + agreeTermsOfServiceCheckbox.toString());
        CustomListeners.test.log(Status.PASS, "Click on I agree with the terms of service checkbox " + agreeTermsOfServiceCheckbox);
        clickOnElement(agreeTermsOfServiceCheckbox);
    }


    //2.16 Click on “CHECKOUT”
    public void clickOnCheckoutButtonAfterAddingNokiaLumia() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Checkout button " + nokiaLumiaCheckoutButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Checkout button " + nokiaLumiaCheckoutButton);
        clickOnElement(nokiaLumiaCheckoutButton);
    }


    //2.25 click on checkbox “I agree with the terms of service”
    public void clickOnTermsOfServiceCheckboxOnShoppingCartPage() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on I agree with the terms of service checkbox " + checkboxOnShoppingCartPage.toString());
        CustomListeners.test.log(Status.PASS, "Click on I agree with the terms of service checkbox " + checkboxOnShoppingCartPage);
        clickOnElement(checkboxOnShoppingCartPage);
    }


    //2.26 Click on “CHECKOUT”
    public void clickCheckoutOnShoppingCartPage() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Checkout button " + checkoutButtonOnShoppingCartPage.toString());
        CustomListeners.test.log(Status.PASS, "Click on Checkout button " + checkoutButtonOnShoppingCartPage);
        clickOnElement(checkoutButtonOnShoppingCartPage);
    }


}
