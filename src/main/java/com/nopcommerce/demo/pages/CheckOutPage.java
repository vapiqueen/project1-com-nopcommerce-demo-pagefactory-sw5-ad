package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_FirstName']" )
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName ;
    @CacheLookup
    @FindBy(xpath ="#BillingNewAddress_Email" )
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath ="//select[@id='BillingNewAddress_CountryId']" )
    WebElement country;
   @CacheLookup
   @FindBy(xpath ="#BillingNewAddress_City" )
   WebElement  city;
    @CacheLookup
    @FindBy(xpath = "#BillingNewAddress_Address1")
    WebElement address;
    @CacheLookup
    @FindBy(xpath = "#BillingNewAddress_ZipPostalCode")
    WebElement zipPostalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
   @CacheLookup
   @FindBy(xpath = "//button[@onclick='Billing.save()']")
   WebElement continueButton ;
    @CacheLookup
    @FindBy(xpath = "shippingoption_1")
    WebElement nextDayAirRadio;
    @CacheLookup
    @FindBy(xpath ="paymentmethod_1" )
    WebElement creditCardButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//button[@name='save' and @class='button-1 payment-method-next-step-button']")
    WebElement continueButton2;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'$698.00')]" )
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'$2,950.00')]" )
    WebElement totalAmountComputers ;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouMessage;
   @CacheLookup
   @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
   WebElement successfulOrderMessage ;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCard ;
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
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;





    public void selectDataFromCountryDropDown(int index) {
        selectByIndexFromDropDown(country, index);
        CustomListeners.test.log(Status.PASS, "Select Country ");
        Reporter.log("Select Country" +country.toString());
    }

    public void enterDataInTheCityField(String cityName) {
        sendTextToElement(city, cityName);
        CustomListeners.test.log(Status.PASS, "Enter City Name");
        Reporter.log("Enter City Name" + city.toString());
    }

    public String getTextFromTotalAmountComputersField(){
        CustomListeners.test.log(Status.PASS, "Total Amount of Computer Field Text");
        Reporter.log("Total Amount of Computer Field Text" +totalAmountComputers.toString());
        return getTextFromElement(totalAmountComputers);
    }


   public void enterDataInTheAddressField(String add1) {
        sendTextToElement(address, add1);
        CustomListeners.test.log(Status.PASS, "Enter data in address1 field");
       Reporter.log("Enter data in address1 field" + address.toString());
    }

    public void enterDataInTheZipPostalCodeField(String pCode) {
        sendTextToElement(zipPostalCode, pCode);
        CustomListeners.test.log(Status.PASS, "Enter Zip Code");
        Reporter.log("Enter Zip Code" + zipPostalCode.toString());
    }

    public void enterDataInTheMobileNumberField(String mobile) {
        sendTextToElement(phoneNumber, mobile);
        CustomListeners.test.log(Status.PASS, "Enter Mobile Numeber");
        Reporter.log("Enter Mobile Numeber" + phoneNumber.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button");
        Reporter.log("Click On Continue Button" +continueButton.toString());
    }

    public void enterNameInTheFirstNameField(String name) {
        sendTextToElement(firstName, name);
        CustomListeners.test.log(Status.PASS, "Enter First Name");
        Reporter.log("Enter First Name" + firstName.toString());

    }

    public void enterLastNameInTheLastNameField(String lastname) {
        sendTextToElement(lastName, lastname);
        CustomListeners.test.log(Status.PASS, "Enter Last Name");
        Reporter.log("Enter Last Name" +lastname.toString());

    }

    public void enterRandomEmailInTheEmailField(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter Email");
        Reporter.log("Enter Email" + emailField.toString());
    }



    public void clickOnNextDayRadioButton() {
        clickOnElement(nextDayAirRadio);
        CustomListeners.test.log(Status.PASS, "Click On Next day Radio Button");
        Reporter.log("Click On Next day Radio Button" + nextDayAirRadio.toString());
    }


    public void clickOnCreditCard() {
        clickOnElement(creditCardButton);
        CustomListeners.test.log(Status.PASS, "Click on Credit Card");
        Reporter.log("Click on Credit Card" + creditCard.toString());
    }
    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button1");
        Reporter.log("Click On Continue Button1" + continueButton1.toString());
    }
    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button2");
        Reporter.log("Click on Continue Button2" + continueButton2.toString());
    }
    public String getTextFromThankYouMessage() {
        CustomListeners.test.log(Status.PASS, "Get Thank You Text");
        Reporter.log("Get Thank You Text" +thankYouMessage.toString());
        return getTextFromElement(thankYouMessage);
    }


    public String getTextFromOrderProcessedSuccessfullyMessage() {
        CustomListeners.test.log(Status.PASS, "Get Text For Order Process Successfully");
        Reporter.log("Get Text For Order Process Successfullyn" + successfulOrderMessage.toString());
        return getTextFromElement(successfulOrderMessage);
    }


    public void clickOnButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click On  Continue Button");
        Reporter.log("Click On  Continue Button" + continueButton.toString());
    }

    public void selectCreditCardType(int index){
        selectByIndexFromDropDown(creditCard, index);
        CustomListeners.test.log(Status.PASS, "Select Type of Credit Card");
        Reporter.log("Select Type of Credit Card" + creditCard.toString());
    }

    public void inputCardHoldersName(String name){
        sendTextToElement(cardHolderName, name);
        CustomListeners.test.log(Status.PASS, "Input Card Holder Name");
        Reporter.log("Input Card Holder Namen" + cardHolderName.toString());
    }

    public void inputCardNumber(String num){
        sendTextToElement(cardNumber, num);
        CustomListeners.test.log(Status.PASS, "Input Card Number");
        Reporter.log("Input Card Holder Name" + cardNumber.toString());
    }

    public void inputExpireMonth(String mon){
        sendTextToElement(expiryMonth, mon);
        CustomListeners.test.log(Status.PASS, "Input Expire Month");
        Reporter.log("Input Expire Month" + expiryMonth.toString());
    }

    public void inputExpireYear(String yr) {
        sendTextToElement(expiryYear, yr);
        CustomListeners.test.log(Status.PASS, "Input Expire Year");
        Reporter.log("Input Expire Year" + expiryYear.toString());
    }

    public void inputCardCode(String code) {

        sendTextToElement(cardCode, code);
        CustomListeners.test.log(Status.PASS, "Input Cardcode");
        Reporter.log("Input Cardcode" + cardNumber.toString());
    }


}

