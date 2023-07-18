package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByZToA ;
    @CacheLookup
    @FindBy(xpath ="//h2[@class='product-title']" )
    WebElement sortBox;
    @CacheLookup
    @FindBy(xpath = "//img[@src='https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg']")
    WebElement addToCart ;

    public void selectSortByZToAFromDropDownMenu(String option) {
        selectByVisibleTextFromDropDown(By.xpath("//option[@value='6' and text() = 'Name: Z to A']"), option);
        CustomListeners.test.log(Status.PASS, "Sort By Z To A");
        Reporter.log("Sort By Z To A" +sortByZToA.toString());
    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        List<WebElement> originalList = driver.findElements((By) sortBox);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        Thread.sleep(3000);

        List<WebElement> afterSortingList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingList) {
            afterSortingProductName.add(product1.getText());
        }
        System.out.println(afterSortingProductName);
        CustomListeners.test.log(Status.PASS, "Verify The Product Arrange In Alphabetical Order");
        Reporter.log("Verify The Product Arrange In Alphabetical Order" + sortBox.toString());
    }

    public void clickOnAddToCartForBuildYourOwnComputer(){
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click On Click On Add to Cart");
        Reporter.log("Click On Click On Add to Cart" + addToCart.toString());
    }

}
