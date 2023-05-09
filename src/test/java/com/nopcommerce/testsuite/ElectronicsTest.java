package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {

    CellPhonesPage cellPhonesPage ;
    NokiaLumia1020Page nokiaLumia1020Page ;
    RegisterPage registerPage;
    HomePage homePage;
    DesktopPage desktopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ShoppingCartPage shoppingCartPage;
    LoginPage loginPage;
    CheckoutPage checkoutPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        desktopPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        shoppingCartPage = new ShoppingCartPage();
        loginPage = new LoginPage();
        checkoutPage = new CheckoutPage();
        cellPhonesPage = new CellPhonesPage();
        nokiaLumia1020Page = new NokiaLumia1020Page();
        registerPage  = new RegisterPage();

    }

    @Test(groups = {"sanity","smoke"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on “Electronics” Tab
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnElectronicsTab();
        //1.3 Verify the text “Cell phones”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Cell phones']")), "Cell phones");

    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatTheProductAddedToSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        //2.1 Mouse Hover on “Electronics” Tab
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnElectronicsTab();
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Cell phones']")), "Cell phones");
        // 2.4 Click on List View Tab
        cellPhonesPage.clickOnListViewTab();

        // 2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnProductNameNokiaLumiaLink();
        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Nokia Lumia 1020']")), "Nokia Lumia 1020");
        //2.7 Verify the price “$349.00”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@id='price-value-20']")), "$349.00");
        //2.8 Change quantity to 2
        nokiaLumia1020Page.changeQuantityTo2();
        //2.9 Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickAddToCartTab();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(getTextFromElement(By.xpath("//p[@class='content']")), "The product has been added to your shopping cart");
        // After that close the bar clicking on the cross button.
        nokiaLumia1020Page.afterThatCloseTheBarClickingOnTheCrossButton();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.moseHoverOnShoppingCartAndClickOnGoToCartButton();
        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Shopping cart']")), "Shopping cart");
        //2.13 Verify the quantity is 2
        // Assert.assertEquals(getTextFromElement(By.xpath("(//tbody//td[@class='quantity']//input[@id='itemquantity11236']")), "2");
        //2.14 Verify the Total $698.00
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]")), "$698.00");
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckboxIAgreeWithTheTermsOfService();
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButtonAfterAddingNokiaLumia();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")), "Welcome, Please Sign In!");
        //2.18 Click on “REGISTER” tab
        loginPage.clickOnRegisterTab();
        //2.19 Verify the text “Register”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Register']")), "Register");
        //2.20 Fill the mandatory fields
        registerPage.fillTheMandatoryFieldsForRegistration();
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //2.22 Verify the message “Your registration completed”
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), "Your registration completed");
        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueTabOnRegisterPage();
        //2.24 Verify the text “Shopping cart”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Shopping cart']")), "Shopping cart");
        loginPage.clickOnLoginLink();
        loginPage.enterEmailField();
        loginPage.enterPasswordFiled();
        loginPage.clickOnLoginButtonLink();
        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckboxOnShoppingCartPage();
        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickCheckoutOnShoppingCartPage();
        //2.27 Fill the Mandatory fields
        checkoutPage.fillTheMandatoryFieldsOnCheckoutPage();
        //2.28 Click on “CONTINUE”
        checkoutPage.clickOnContinueOnCheckoutPage();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkoutPage.clickOnRadioButton2ndDayAir();
        //2.30 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonOnCheckoutPage();
        //2.31 Select Radio Button “Credit Card”
        checkoutPage.selectRadioButtonOnCreditCard();
        // Click on continue button
        checkoutPage.clickOnContinueOnCreditCard();
        //2.32 Select “Visa” From Select credit card dropdown
        checkoutPage.selectVisaFromCreditCardDropdown();
        //2.33 Fill all the details
        checkoutPage.fillAllTheDetailsInCreditCard();
        //2.34 Click on “CONTINUE”
        checkoutPage.clickOnContinueAfterCreditCardDetails();
        //2.35 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[normalize-space()='Credit Card']")), "Credit Card");
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[normalize-space()='2nd Day Air']")), "2nd Day Air");

        //2.37 Verify Total is “$698.00”
        //Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]")), "$698.00");
        //2.38 Click on “CONFIRM”
        checkoutPage.clickOnConfirmAfterPaymentMethod();
        //2.39 Verify the Text “Thank You”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Thank you']")), "Thank you");
        //2.40 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(getTextFromElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']")), "Your order has been successfully processed!");
        //2.41 Click on “CONTINUE”
        checkoutPage.clickContinueButtonAfterSuccessfulOrder();
        //2.42 Verify the text “Welcome to our store”
        Assert.assertEquals(getTextFromElement(By.xpath("//h2[normalize-space()='Welcome to our store']")), "Welcome to our store");
        //2.43 Click on “Logout” link
        homePage.clickOnLogoutLink();
        //2.44 Verify the URL is “https://demo.nopcommerce.com/
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://demo.nopcommerce.com/");


    }


}
