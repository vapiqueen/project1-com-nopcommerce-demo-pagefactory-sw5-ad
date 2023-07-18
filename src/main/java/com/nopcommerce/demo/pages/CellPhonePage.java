package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020DisplayText;
    @CacheLookup
    @FindBy (xpath = "//span[@id='price-value-20']")
    WebElement Price;
   @CacheLookup
   @FindBy(xpath = "product_enteredQuantity_20")
   WebElement Quantity;
    @CacheLookup
    @FindBy(xpath = "add-to-cart-button-20")
    WebElement AddToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement AddToCartGreenMessage;

    @CacheLookup
    @FindBy(xpath = "span[title='Close']")
    WebElement MessageClosingCrossButton;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement ShoppingCartButton;
   @CacheLookup
   @FindBy(xpath ="//button[text()='Go to cart']" )
   WebElement ShoppingCartButtonsGoToCartOption;


    public String getTextFromNokiaLumiaDisplayText(){
        CustomListeners.test.log(Status.PASS, "Get Display Text For NokiaLumia");
        Reporter.log("Get Display Text For NokiaLumia" +nokiaLumia1020DisplayText.toString());
        return getTextFromElement(nokiaLumia1020DisplayText);
    }



    public String getTextFromPrice(){
        CustomListeners.test.log(Status.PASS, "Get Price Text");
        Reporter.log("Get Price Text" + Price.toString());
        return getTextFromElement(Price);
    }


    public void clearTheQuantityField() {
        driver.findElement((By) Quantity).clear();
        CustomListeners.test.log(Status.PASS, "Clear The Qty Filed");
        Reporter.log("Clear The Qty Filed" + Quantity.toString());
    }

    public void UpdatedQuantity0(String quantity){
        sendTextToElement(Quantity, quantity);
        CustomListeners.test.log(Status.PASS, "Upadte Qty");
        Reporter.log("Upadte Qty" + Quantity.toString());
    }

    public void clickOnAddToCartButton(){
        clickOnElement(AddToCartButton);
        CustomListeners.test.log(Status.PASS, "Click On Add to Cart Button");
        Reporter.log("Click On Add to Cart Button" + AddToCartButton.toString());
    }
    public String getProductAddedToCartMessage(){
        CustomListeners.test.log(Status.PASS, "Get Message for Add product in Cart");
        Reporter.log("Get Message for Add product in Cart" + AddToCartGreenMessage.toString());
        return getTextFromElement(AddToCartGreenMessage);
    }


    public void closeTheGreenBarByClickingTheCrossButton(){
        clickOnElement(MessageClosingCrossButton);
        CustomListeners.test.log(Status.PASS, "Close the Green Bar");
        Reporter.log("Close the Green Bar" + MessageClosingCrossButton.toString());
    }

    public void mouseHoverOnShoppingCartButton(){
        mouseHoverToElement(ShoppingCartButton);
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Shopping Cart Button");
        Reporter.log("Mouse Hover On Shopping Cart Button" +ShoppingCartButton.toString());
    }

    public void clickOnGoToCartButton(){
        clickOnElement(ShoppingCartButtonsGoToCartOption);
        CustomListeners.test.log(Status.PASS, "Click On Go TO Cart Button");
        Reporter.log("Click On Go TO Cart Button" + ShoppingCartButtonsGoToCartOption.toString());
    }
}
