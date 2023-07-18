package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="paymentmethod_1" )
    WebElement creditCardRadioButton ;

    @CacheLookup
    @FindBy(xpath = "//button[@name='save' and @class='button-1 payment-method-next-step-button']")
    WebElement continueButton ;
    @CacheLookup
    @FindBy(xpath ="//select[@id='CreditCardType']" )
    WebElement creditCard ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath ="//select[@id='ExpireMonth']" )
    WebElement expiryMonth ;
   @CacheLookup
   @FindBy(xpath = "//select[@id='ExpireYear']")
   WebElement expiryYear ;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement continueButton1 ;


    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRadioButton);
        CustomListeners.test.log(Status.PASS,"Click On Credit Card");
        Reporter.log("Click On Credit Card"+creditCardRadioButton.toString());
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click On Continue Button");
        Reporter.log("Click On Continue Button "+continueButton.toString());
    }
    public void selectCreditCardType(int index) {
        selectByIndexFromDropDown(creditCard, index);
        CustomListeners.test.log(Status.PASS,"Select Type of Credit Card");
        Reporter.log("Select Type of Credit Card"+creditCard+"index"+creditCard.toString());
    }

    public void inputCardHoldersName(String name) {
        sendTextToElement(cardHolderName, name);
        CustomListeners.test.log(Status.PASS,"Input Card Holders Name");
        Reporter.log("Input Card Holders Name"+cardHolderName+"name"+cardHolderName.toString());
    }

    public void inputCardNumber(String num) {
        sendTextToElement(cardNumber, num);
        CustomListeners.test.log(Status.PASS,"Input Card Number");
        Reporter.log("Input Card Number"+cardNumber+"num"+cardNumber.toString());
    }

    public void inputExpireMonth(String mon) {
        sendTextToElement(expiryMonth, mon);
        CustomListeners.test.log(Status.PASS,"Input Expire Month");
        Reporter.log("Input Expire Month"+expiryMonth+"num"+expiryMonth .toString());
    }

    public void inputExpireYear(String yr) {
        sendTextToElement(expiryYear, yr);
        CustomListeners.test.log(Status.PASS,"Select Type of Credit Card");
        Reporter.log("Select Type of Credit Card"+creditCard.toString());
    }

    public void inputCardCode(String code) {
        sendTextToElement(cardCode,code);
        CustomListeners.test.log(Status.PASS,"Select Type of Credit Card Code");
        Reporter.log("Select Type of Credit Card Code"+cardCode+"code"+cardCode.toString());
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click On Continue Button1");
        Reporter.log("Click On Continue Button1"+continueButton.toString());
    }
}
