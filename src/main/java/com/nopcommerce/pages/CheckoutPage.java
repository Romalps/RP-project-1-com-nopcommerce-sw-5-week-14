package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1Field;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postcodeField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueBtnLink;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement radioBtnNextDayAirLink;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButtonLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueBtnAfterCreditCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement masterCardFromDropdownLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberFiled;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expirationDateField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expirationYearField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueAfterPaymentCardDetails;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueAfterSuccessful;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButtonLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonAfterPlacingOrder;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButtonOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement radioButton2ndDayAir;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueBtnOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement radioButtonOnCreditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueBtnOnCreditCard;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement visaCreditCard;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expirationMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expirationYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueAfterCreditCardDetail;


    // 2.22 Fill the all mandatory field
    public void fillAllMandatoryFieldInBillingAddressForm() throws InterruptedException {
        Thread.sleep(1000);
        // Find the First name field element and send firstname element
        Reporter.log("Enter First name " + firstNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter First name " + firstNameField);
        sendTextToElement(firstNameField, "Prime543" + getRandomString(4));
        // Find the Last name field element and send last name element
        Reporter.log("Enter Last name " + lastNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Last name " + lastNameField);
        sendTextToElement(lastNameField, "Tester" + getRandomString(4));
        //Find Email field element and send email element
        Reporter.log("Enter Email " + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email " + emailField);
        sendTextToElement(emailField, "prime" + getRandomString(4) + "@gmail.com");
        // Select the country from country field element
        Reporter.log("Select Country " + countryField.toString());
        CustomListeners.test.log(Status.PASS, "Select Country " + countryField);
        selectByVisibleTextFromDropDown(countryField, "United Kingdom");
        // Find City field element and send city element
        Reporter.log("Enter City " + cityField.toString());
        CustomListeners.test.log(Status.PASS, "Enter City " + cityField);
        sendTextToElement(cityField, "London");
        //Find address1 field element and send address1 element
        Reporter.log("Enter Address " + address1Field.toString());
        CustomListeners.test.log(Status.PASS, "Enter Address " + address1Field);
        sendTextToElement(address1Field, "123,High Road");
        //Find postcode field element and send postcode element
        Reporter.log("Enter Postcode " + postcodeField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Postcode " + postcodeField);
        sendTextToElement(postcodeField, "HA5 7AL");
        //Find phone number field element and send phone number element
        Reporter.log("Enter phone number " + phoneNumberField.toString());
        CustomListeners.test.log(Status.PASS, "Enter phone number " + phoneNumberField);
        sendTextToElement(phoneNumberField, "07412589000");
    }


    // 2.23 Click on “CONTINUE”
    public void ClickOnContinueButtonAfterFillingTheForm() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on continue button " + continueBtnLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue button " + continueBtnLink);
        clickOnElement(continueBtnLink);
    }


    // 2.24 Click on Radio Button “Next Day Air($0.00)”
    public void clickOnRadioBtnForNextDayAir() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Next Day Air radio button " + radioBtnNextDayAirLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Next Day Air radio button " + radioBtnNextDayAirLink);
        clickOnElement(radioBtnNextDayAirLink);
    }


    // 2.25 Click on “CONTINUE”
    public void clickOnContinueButtonAfterClickingTheNextDayAirRadioButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on continue button " + continueButtonLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue button " + continueButtonLink);
        clickOnElement(continueButtonLink);
    }


    //2.26 Select Radio Button “Credit Card
    public void selectRadioButtonForCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Select Credit card radio button" + creditCardRadioButton.toString());
        CustomListeners.test.log(Status.PASS, "Select Credit card radio button" + creditCardRadioButton);
        clickOnElement(creditCardRadioButton);
    }


    // click on continue button
    public void clickOnContinueButtonAfterSelectingCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Continue button " + continueBtnAfterCreditCard.toString());
        CustomListeners.test.log(Status.PASS, "Click on Continue button " + continueBtnAfterCreditCard);
        clickOnElement(continueBtnAfterCreditCard);
    }


    // 2.27 Select “Master card” From Select credit card dropdown
    public void selectMasterCardFromCreditCardDropdown() {
        Reporter.log("Select Master card from dropdown " + masterCardFromDropdownLink.toString());
        CustomListeners.test.log(Status.PASS, "Select Master card from dropdown " + masterCardFromDropdownLink);
        selectByVisibleTextFromDropDown(masterCardFromDropdownLink, "Master card");
    }


    // 2.28 Fill all the details
    public void fillAllPaymentDetails() {
        // Find cardholder name field element and send element
        Reporter.log("Enter Card Holder name " + cardHolderNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Card Holder name " + cardHolderNameField);
        sendTextToElement(cardHolderNameField, "Prime543");

        // Find card number field element and send element
        Reporter.log("Enter Card number " + cardNumberFiled.toString());
        CustomListeners.test.log(Status.PASS, "Enter Card number " + cardNumberFiled);
        sendTextToElement(cardNumberFiled, "5105105105105100");

        // Find Expiration date field element and send element
        Reporter.log("Enter Expiration Date " + expirationDateField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Expiration Date " + expirationDateField);
        selectByVisibleTextFromDropDown(expirationDateField, "10");

        Reporter.log("Enter Expiration Year " + expirationYearField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Expiration Year " + expirationYearField);
        selectByVisibleTextFromDropDown(expirationYearField, "2028");

        //  Find Card code field element and send element
        Reporter.log("Enter Card Code " + cardCodeField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Card Code " + cardCodeField);
        sendTextToElement(cardCodeField, "456");
    }


    // 2.29 Click on “CONTINUE”
    public void clickOnContinueAfterPaymentCardDetails() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on continue button " + continueAfterPaymentCardDetails.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue button " + continueAfterPaymentCardDetails);
        clickOnElement(continueAfterPaymentCardDetails);
    }


    // 2.34 Click on “CONFIRM”
    public void clickOnConfirmButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Confirm button " + confirmButtonLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Confirm button " + confirmButtonLink);
        clickOnElement(confirmButtonLink);
    }


    //2.37 Click on “CONTINUE”
    public void clickOnContinueButtonAfterPlacingOrderSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Continue button " + continueButtonAfterPlacingOrder.toString());
        CustomListeners.test.log(Status.PASS, "Click on Continue button " + continueButtonAfterPlacingOrder);
        clickOnElement(continueButtonAfterPlacingOrder);
    }


    //2.27 Fill the Mandatory fields
    public void fillTheMandatoryFieldsOnCheckoutPage() throws InterruptedException {

        // Find Country field element and select element
        Reporter.log("Enter Country " + country.toString());
        CustomListeners.test.log(Status.PASS, "Enter Country " + country);
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(country, "India");
        // Find City field element and send element
        Reporter.log("Enter City " + city.toString());
        CustomListeners.test.log(Status.PASS, "Enter City " + city);
        sendTextToElement(city, "Mumbai");
        // Find Address1 field element and send element
        Reporter.log("Enter Address " + address1.toString());
        CustomListeners.test.log(Status.PASS, "Enter Address " + address1);
        sendTextToElement(address1, "45,Joohu Lane");
        // Find Postcode field element and send element
        Reporter.log("Enter Postcode " + postcode.toString());
        CustomListeners.test.log(Status.PASS, "Enter Postcode " + postcode);
        sendTextToElement(postcode, "385698");
        // Find Phone Number field element and send element
        Reporter.log("Enter phone number " + phoneNumber.toString());
        CustomListeners.test.log(Status.PASS, "Enter phone number " + phoneNumber);
        sendTextToElement(phoneNumber, "0981385698");
    }


    //2.28 Click on “CONTINUE”
    public void clickOnContinueOnCheckoutPage() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on continue button " + continueButtonOnCheckout.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue button " + continueButtonOnCheckout);
        clickOnElement(continueButtonOnCheckout);
    }


    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    public void clickOnRadioButton2ndDayAir() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on 2nd Day Air radio button " + radioButton2ndDayAir.toString());
        CustomListeners.test.log(Status.PASS, "Click on 2nd Day Air radio button " + radioButton2ndDayAir);
        clickOnElement(radioButton2ndDayAir);
    }


    //2.30 Click on “CONTINUE”
    public void clickOnContinueButtonOnCheckoutPage() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Continue button  " + continueBtnOnCheckout.toString());
        CustomListeners.test.log(Status.PASS, "Click on Continue button  " + continueBtnOnCheckout);
        clickOnElement(continueBtnOnCheckout);
    }


    //2.31 Select Radio Button “Credit Card”
    public void selectRadioButtonOnCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Select Credit Card radio button " + radioButtonOnCreditCard.toString());
        CustomListeners.test.log(Status.PASS, "Select Credit Card radio button " + radioButtonOnCreditCard);
        clickOnElement(radioButtonOnCreditCard);
    }


    // Click on continue button
    public void clickOnContinueOnCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Continue button " + continueBtnOnCreditCard.toString());
        CustomListeners.test.log(Status.PASS, "Click on Continue button " + continueBtnOnCreditCard);
        clickOnElement(continueBtnOnCreditCard);
    }


    //2.32 Select “Visa” From Select credit card dropdown
    public void selectVisaFromCreditCardDropdown() {
        Reporter.log("Select Visa from drop down " + visaCreditCard.toString());
        CustomListeners.test.log(Status.PASS, "Select Visa from drop down " + visaCreditCard);
        selectByVisibleTextFromDropDown(visaCreditCard, "Visa");
    }


    //2.33 Fill all the details
    public void fillAllTheDetailsInCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        // Find Cardholder name field element and send element
        Reporter.log("Enter Card holder name " + cardHolderName.toString());
        CustomListeners.test.log(Status.PASS, "Enter Card holder name " + cardHolderName);
        sendTextToElement(cardHolderName, "Prime");
        // Find Card Number field element and send element
        Reporter.log("Enter Card number " + cardNumber.toString());
        CustomListeners.test.log(Status.PASS, "Enter Card number " + cardNumber);
        sendTextToElement(cardNumber, "5555555555554444");
        // Find Expiration date field element and select element
        Reporter.log("Select Expiration Month " + expirationMonth.toString());
        CustomListeners.test.log(Status.PASS, "Select Expiration date " + expirationMonth);
        selectByValueFromDropDown(expirationMonth, "10");

        Reporter.log("Select Expiration Year " + expirationYear.toString());
        CustomListeners.test.log(Status.PASS, "Select Expiration date " + expirationYear);
        selectByValueFromDropDown(expirationYear, "2027");
        // Find Card code number name field element and send element
        Reporter.log("Enter Card code number " + cardCodeNumber.toString());
        CustomListeners.test.log(Status.PASS, "Enter Card code number " + cardCodeNumber);
        sendTextToElement(cardCodeNumber, "789");
    }


    //2.34 Click on “CONTINUE”
    public void clickOnContinueAfterCreditCardDetails() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Continue button " + continueAfterCreditCardDetail.toString());
        CustomListeners.test.log(Status.PASS, "Enter phone number " + "Click on Continue button " + continueAfterCreditCardDetail);
        clickOnElement(continueAfterCreditCardDetail);
    }


    //2.38 Click on “CONFIRM”
    public void clickOnConfirmAfterPaymentMethod() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Confirm button " + confirmLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Confirm button " + confirmLink);
        clickOnElement(confirmLink);
    }


    //2.41 Click on “CONTINUE”
    public void clickContinueButtonAfterSuccessfulOrder() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Continue button " + continueAfterSuccessful.toString());
        CustomListeners.test.log(Status.PASS, "Click on Continue button " + continueAfterSuccessful);
        clickOnElement(continueAfterSuccessful);
    }


}
