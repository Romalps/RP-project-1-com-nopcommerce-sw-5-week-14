package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram8GB;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hDD400GBRadioButton;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement oSVistaPremiumRadioButton;
    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement softwareCheckboxesForMSOffice;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareCheckboxesForCommander;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartBtn;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement crossButtonLink;


    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCartLink = By.xpath("//button[normalize-space()='Go to cart']");

    public void buildYourOwnComputer() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Build your own Computer with processor " + processor.toString());
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");
        CustomListeners.test.log(Status.PASS, "Build your own Computer with processor " + processor);
        // 2.7.Select "8GB [+$60.00]" using Select class.
        Reporter.log("Build your own Computer with 8GB RAM " + ram8GB.toString());
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(ram8GB, "8GB [+$60.00]");
        CustomListeners.test.log(Status.PASS, "Build your own Computer with 8GB RAM " + ram8GB);
        Thread.sleep(1000);
        // 2.8 Select HDD radio "400 GB [+$100.00]"
        Reporter.log("Build your own Computer with 400GB HDD " + hDD400GBRadioButton.toString());
        clickOnElement(hDD400GBRadioButton);
        CustomListeners.test.log(Status.PASS, "Build your own Computer with 400GB HDD " + hDD400GBRadioButton);
        Thread.sleep(1000);
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        Reporter.log("Build your own Computer with OS Vista Premium " + oSVistaPremiumRadioButton.toString());
        clickOnElement(oSVistaPremiumRadioButton);
        CustomListeners.test.log(Status.PASS, "Build your own Computer with OS Vista Premium " + oSVistaPremiumRadioButton);
        Thread.sleep(1000);
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        Thread.sleep(1000);
        Reporter.log("Build your own Computer with Microsoft Office and Total Commander " + softwareCheckboxesForCommander.toString());
        clickOnElement(softwareCheckboxesForCommander);
        CustomListeners.test.log(Status.PASS, "Build your own Computer with Microsoft Office and Total Commander  " + softwareCheckboxesForCommander);
        Thread.sleep(2000);

    }


    // 2.12 Click on "ADD TO CARD" Button.
    public void clickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Add to Cart Button " + addToCartBtn.toString());
        clickOnElement(addToCartBtn);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart Button " + addToCartBtn);
    }


    // After that close the bar clicking on the cross button.
    public void closeTheBarClickingOnTheCrossButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Close the bar by clicking on the cross button " + crossButtonLink.toString());
        clickOnElement(crossButtonLink);
        CustomListeners.test.log(Status.PASS, "Close the bar by clicking on the cross button " + crossButtonLink);
    }


    // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCartAndClickOnGoTOCartButton() throws InterruptedException {
        Thread.sleep(1000);
        try {
            Actions actions = new Actions(driver);
            WebElement shoppingCartElement = waitUntilVisibilityOfElementLocated(shoppingCart, 10);
            actions.moveToElement(shoppingCartElement).perform();
            WebElement goToCartButton = waitUntilElementToBeClickable(goToCartLink, 10);
            goToCartButton.click();
        } catch (ElementNotInteractableException e) {
            // Handle the exception
        }

    }

}
