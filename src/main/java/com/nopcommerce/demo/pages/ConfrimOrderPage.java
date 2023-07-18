package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ConfrimOrderPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Credit Card')]" )
    WebElement creditCard ;
    @CacheLookup
    @FindBy(xpath ="li[class='shipping-method'] span[class='value']" )
    WebElement shippingMethod ;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$698.00')]")
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'$2,950.00')]" )
    WebElement totalAmountComputers ;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;




    public String getTextFromPaymentMethodText(){
        CustomListeners.test.log(Status.PASS, "Get PaymentMethod Text");
        Reporter.log("Get PaymentMethod Text" + creditCard.toString());
        return getTextFromElement(creditCard);
    }


    public String getTextFromShippingMethodText(){
        CustomListeners.test.log(Status.PASS, "Get Shipping Method Text");
        Reporter.log("Get Shipping Method Textn" + shippingMethod.toString());
        return getTextFromElement(shippingMethod);
    }





    public String getTextFromTotalAmountComputersField(){
        CustomListeners.test.log(Status.PASS, "Get Total Amount Text");
        Reporter.log("Get Total Amount Text" + totalAmountComputers.toString());
        return getTextFromElement(totalAmountComputers);
    }


    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
        CustomListeners.test.log(Status.PASS, "Click On Confrim Button");
        Reporter.log("Click On Confrim Button" + confirmButton.toString());
    }
}
