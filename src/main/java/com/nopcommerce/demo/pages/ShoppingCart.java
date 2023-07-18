package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCart extends Utility {

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Shopping cart')]" )
    WebElement shoppingCartDisplayMessage ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsAndConditionsBox ;
    @CacheLookup
    @FindBy(xpath ="//button[@id='checkout']" )
    WebElement checkoutButton;
    @CacheLookup
    @FindBy(xpath ="//input[@class='qty-input']" )
    WebElement quantityBox ;
    @CacheLookup
    @FindBy(xpath = "//div[@class='common-buttons']/child::button[1]")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath ="//span[@class='product-subtotal']" )
    WebElement totalAmount ;
    @CacheLookup
    @FindBy(id ="termsofservice" )
    WebElement termsAndCBox ;

    public String getTextFromDisplayMessage() {
        CustomListeners.test.log(Status.PASS,"Get Text From Display Message");
        Reporter.log("Get Text From Display Message "+shoppingCartDisplayMessage.toString());
        return getTextFromElement(shoppingCartDisplayMessage);
    }


    public void clickOnTermsAndConditionsAgreeBox() {
        clickOnElement(termsAndConditionsBox);
        CustomListeners.test.log(Status.PASS,"Click On Term And Condition");
        Reporter.log("Click On Term And Condition "+termsAndConditionsBox.toString());
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
        CustomListeners.test.log(Status.PASS,"Click On Checkout Button");
        Reporter.log("Click On Checkout Button"+checkoutButton.toString());
    }

    public void clearTheQuantityField() {
        driver.findElement((By) quantityBox).clear();
        CustomListeners.test.log(Status.PASS,"Clear The Quantity Field");
        Reporter.log("Clear The Quantity Field"+quantityBox.toString());
    }

    public void updateTheQuantityField(String quantity) {
        sendTextToElement(quantityBox, quantity);
        CustomListeners.test.log(Status.PASS,"Update The quantity Field");
        Reporter.log("Update The quantity Field "+quantityBox.toString());
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
        CustomListeners.test.log(Status.PASS,"Click On Update Shopping Cart");
        Reporter.log("Click On Update Shopping Cart"+updateShoppingCart.toString());
    }

    public String getTextFromAmountElement() {
        CustomListeners.test.log(Status.PASS,"Get Text From Amount Element");
        Reporter.log("Get Text From Amount Element "+totalAmount.toString());
        return getTextFromElement(totalAmount);
    }


    public void agreeWithTermsAndConditions() {
        clickOnElement(termsAndCBox);
        CustomListeners.test.log(Status.PASS,"Agree Terms And Condition");
        Reporter.log("Agree Terms And Condition "+termsAndCBox.toString());
    }
}

