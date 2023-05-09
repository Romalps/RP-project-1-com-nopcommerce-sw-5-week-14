package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumia1020Page extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartTab;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement crossButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCartButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCartButton;


    //2.8 Change quantity to 2
    public void changeQuantityTo2() throws InterruptedException {
        Thread.sleep(1000);

        Reporter.log("Change Quantity to 2 " + qty.toString());
        CustomListeners.test.log(Status.PASS, "Change Quantity to 2 " + qty);
        qty.clear();
        sendTextToElement(qty, "2");
    }


    //2.9 Click on “ADD TO CART” tab
    public void clickAddToCartTab() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Add to cart tab " + addToCartTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on Add to cart tab " + addToCartTab);
        clickOnElement(addToCartTab);
    }


    // After that close the bar clicking on the cross button.
    public void afterThatCloseTheBarClickingOnTheCrossButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on cross button on the bar " + crossButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on cross button on the bar " + crossButton);
        clickOnElement(crossButton);
    }


    // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void moseHoverOnShoppingCartAndClickOnGoToCartButton() throws InterruptedException {

        Thread.sleep(3000);
        Reporter.log("Mouse hover on Shopping Cart link " + shoppingCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Shopping Cart link " + shoppingCartButton);
        Reporter.log("Click on Go TO Cart button " + goToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Go TO Cart button " + goToCartButton);
        actionsMethodForMouseHover(shoppingCartButton, goToCartButton);
    }


}
