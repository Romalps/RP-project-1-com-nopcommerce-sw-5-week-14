package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import sun.awt.windows.WBufferStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(id="products-orderby")
    WebElement nameZToALink;
    By productNameListLink = By.className("product-item");

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement nameAToZLink;
    //By addToCartLink = By.xpath("//button[@type='button'][normalize-space()='Add to cart'])[1]");
@CacheLookup
@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCartLink;
    // 1.3 Select Sort By position "Name: Z to A"
    public void selectSortByPositionNameZToA() throws InterruptedException {
        Thread.sleep(2000);
       CustomListeners.test.log(Status.PASS,"Select Name : Z to A from sort by Position"+ nameZToALink);
        selectByVisibleTextFromDropDown(nameZToALink, "Name: Z to A");
        // Get all the product and store them in list
        List<WebElement> productList = driver.findElements(productNameListLink);
        List<String> productName = new ArrayList<>();

        for (WebElement product : productList) {

            productName.add(product.findElement(By.className("product-title")).getText());

        }
        // sort the product names in descending order
        List<String> sortedProductNameList = new ArrayList<>(productName);
        Collections.sort(sortedProductNameList, Collections.reverseOrder());


    }


    //2.3 Select Sort By position "Name: A to Z"
    public void selectSortByPositionNameAToZ() throws InterruptedException {
        Thread.sleep(2000);
//        Reporter.log("Select Name : A to Z from sort by Position"+ nameAToZLink.toString());
//        CustomListeners.test.log(Status.PASS,"Select Name : A to Z from sort by Position"+ nameAToZLink);
        selectByVisibleTextFromDropDown(nameAToZLink, "Name: A to Z");
    }
    // 2.4 Select "Build your own computer" and  Click on "Add To Cart"

    public void clickOnAddToCArtButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(addToCartLink);
//        try {
//            WebElement addToCartButton = waitUntilVisibilityOfElementLocated(addToCartLink, 10);
//            addToCartButton.click();
//        } catch (StaleElementReferenceException e) {
//            // Try to locate the element again
//            WebElement addToCartButton = waitUntilVisibilityOfElementLocated(addToCartLink, 10);
//            addToCartButton.click();
//        }
    }


}
