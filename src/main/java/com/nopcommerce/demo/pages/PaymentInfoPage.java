package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentInfoPage extends Utility {
    @CacheLookup
    @FindBy
    WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath ="//select[@id='ExpireMonth']" )
    WebElement expiryMonth ;
    @CacheLookup
    @FindBy(xpath ="//select[@id='ExpireYear']" )
    WebElement expiryYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode ;
    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 payment-info-next-step-button']" )
    WebElement continueButton ;

    public void selectCreditCardType(int index) {
        selectByIndexFromDropDown(creditCard, index);
        CustomListeners.test.log(Status.PASS,"Select Credit Card Type");
        Reporter.log("Add Customer"+creditCard.toString());
    }

    public void inputCardHoldersName(String name) {
        sendTextToElement(cardHolderName, name);
        CustomListeners.test.log(Status.PASS,"Input Card Holder Name");
        Reporter.log("Input Card Holder Name"+cardHolderName.toString());
    }

    public void inputCardNumber(String num) {
        sendTextToElement(cardNumber, num);
        CustomListeners.test.log(Status.PASS,"Input Card Number");
        Reporter.log("Input Card Number"+cardNumber+"to card number field"+cardNumber.toString());
    }

    public void inputExpireMonth(String mon) {
        sendTextToElement(expiryMonth, mon);
        CustomListeners.test.log(Status.PASS,"Input Expire Month");
        Reporter.log("Input Expire Mont"+expiryMonth+"to expiry Month"+expiryMonth.toString());
    }

    public void inputExpiryYear(String yr) {
        sendTextToElement(expiryYear, yr);
        CustomListeners.test.log(Status.PASS,"Input Expiry Year");
        Reporter.log("Input Expiry Year"+expiryYear+"to expiry Year"+expiryYear.toString());
    }

    public void inputCardCode(String code) {
        sendTextToElement(cardCode, code);
        CustomListeners.test.log(Status.PASS,"Input Card Code");
        Reporter.log("Input Card Code"+expiryYear+"to expiry Year"+expiryYear.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click On Continue Button");
        Reporter.log("Click On Continue Button"+continueButton.toString());
    }

}
