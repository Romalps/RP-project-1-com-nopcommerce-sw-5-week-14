package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listViewTab;
    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement productNokiaLumiaLink;

    // 2.4 Click on List View Tab
    public void clickOnListViewTab() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on List view tab" + listViewTab.toString());
        clickOnElement(listViewTab);
        CustomListeners.test.log(Status.PASS, "Click on List view tab" + listViewTab);
    }


    public void clickOnProductNameNokiaLumiaLink() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Click on product name Nokia Lumia link " + productNokiaLumiaLink.toString());
        clickOnElement(productNokiaLumiaLink);
        CustomListeners.test.log(Status.PASS, "Click on product name Nokia Lumia link " + productNokiaLumiaLink);
    }


}
