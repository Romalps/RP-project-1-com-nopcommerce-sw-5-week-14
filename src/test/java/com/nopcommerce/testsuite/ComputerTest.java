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
public class ComputerTest extends BaseTest {

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
    }

    @Test(groups = {"sanity"})
    public void verifyPageNavigation() throws InterruptedException {
        homePage.selectMenu("Computers");
        Assert.assertEquals(getTextFromElement(By.linkText("Computers")), "Computers");
    }

    @Test(groups = {"smoke"})
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {

        homePage.selectMenu("Computers");
        homePage.clickOnComputerMenu(); //1.1 Click on Computer Menu.
        homePage.clickOnDesktopFromComputerMenuTab(); // 1.2 Click on Desktop
        //1.3 Select Sort By position "Name: Z to A"

        desktopPage.selectSortByPositionNameZToA();
        // 1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(getTextFromElement(By.xpath("//a[normalize-space()='Lenovo IdeaCentre 600 All-in-One PC']")), "Lenovo IdeaCentre 600 All-in-One PC");

    }

    @Test(groups = {"regression"})
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {
        // 2.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        homePage.clickOnComputerMenu();
        //2.2 Click on Desktop
        homePage.clickOnDesktopFromComputerMenuTab();
        // 2.3 Select Sort By position "Name: A to Z" and
        desktopPage.selectSortByPositionNameAToZ();
        //  2.4 Click on "Add To Cart"
        desktopPage.clickOnAddToCArtButton();
        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Build your own computer']")), "Build your own computer");
        buildYourOwnComputerPage.buildYourOwnComputer();
        // 2.11 Verify the price "$1,475.00"
        //Assert.assertEquals(getTextFromElement(By.xpath("//span[@id='price-value-1']")), "$1475.00");
        // 2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickOnAddToCartButton();

        // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(getTextFromElement(By.className("content")), "The product has been added to your shopping cart");
        // After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.closeTheBarClickingOnTheCrossButton();
        // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.mouseHoverOnShoppingCartAndClickOnGoTOCartButton();
        // 2.15 Verify the message "Shopping cart"
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Shopping cart']")), "Shopping cart");
        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeTheQtyTo2();
        shoppingCartPage.updateTheShoppingCartAfterChangingQty();

        // 2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")), "$2,950.00");
        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickTermsOfServiceCheckbox();
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']")), "Welcome, Please Sign In!");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        loginPage.clickOnCheckoutAsGuestTab();
        // 2.22 Fill the all mandatory field
        checkoutPage.fillAllMandatoryFieldInBillingAddressForm();
        // 2.23 Click on “CONTINUE”
        checkoutPage.ClickOnContinueButtonAfterFillingTheForm();
        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        checkoutPage.clickOnRadioBtnForNextDayAir();
        // 2.25 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonAfterClickingTheNextDayAirRadioButton();
        // 2.26 Select Radio Button “Credit Card”
        checkoutPage.selectRadioButtonForCreditCard();
        //2.27 Select “Master card” From Select credit card dropdown
        checkoutPage.clickOnContinueButtonAfterSelectingCreditCard();
        checkoutPage.selectMasterCardFromCreditCardDropdown();
        //2.28 Fill all the details
        checkoutPage.fillAllPaymentDetails();
        //2.29 Click on “CONTINUE”
        checkoutPage.clickOnContinueAfterPaymentCardDetails();
        // 2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[normalize-space()='Credit Card']")), "Credit Card");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[normalize-space()='Next Day Air']")), "Next Day Air");
        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")), "$2,950.00");
        // 2.34 Click on “CONFIRM”
        checkoutPage.clickOnConfirmButton();
        // 2.35 Verify the Text “Thank You”
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[normalize-space()='Thank you']")), "Thank you");
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(getTextFromElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']")), "Your order has been successfully processed!");
        //2.37 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonAfterPlacingOrderSuccessfully();
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(getTextFromElement(By.xpath("//h2[normalize-space()='Welcome to our store']")), "Welcome to our store");


    }
}