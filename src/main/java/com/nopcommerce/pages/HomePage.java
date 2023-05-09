package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerMenuLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsTabLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhonesLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;


    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.linkText(menu));
    }

    // 1.1 Click on Computer Menu.
    public void clickOnComputerMenu() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Computer Menu tab "+computerMenuLink.toString());
        CustomListeners.test.log(Status.PASS,"Click on Computer Menu tab "+computerMenuLink);
        clickOnElement(computerMenuLink);
    }


    //1.2 Click on Desktop
    public void clickOnDesktopFromComputerMenuTab() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Logout LinkDesktop tab "+desktopLink.toString());
        CustomListeners.test.log(Status.PASS,"Click on Logout LinkDesktop tab "+desktopLink);
        clickOnElement(desktopLink);
    }


    public void mouseHoverOnElectronicsTab() {
        //1.1 Mouse Hover on “Electronics” Tab
        //1.2 Mouse Hover on “Cell phones” and click
        Reporter.log("Mouse hover on Electronics tab "+electronicsTabLink.toString());
        CustomListeners.test.log(Status.PASS,"Mouse hover on Electronics tab "+electronicsTabLink);
        Reporter.log("Mouse hover on Cell phones and click "+cellPhonesLink.toString());
        CustomListeners.test.log(Status.PASS,"Mouse hover on Cell phones and click  "+cellPhonesLink);
        actionsMethodForMouseHover(electronicsTabLink, cellPhonesLink);
    }

    //2.43 Click on “Logout” link
    public void clickOnLogoutLink() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on Logout Link "+logOutLink.toString());
        CustomListeners.test.log(Status.PASS,"Click on Logout Link "+logOutLink);
        clickOnElement(logOutLink);
    }


}
