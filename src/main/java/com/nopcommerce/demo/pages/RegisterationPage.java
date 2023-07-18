package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterationPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#Email")
    WebElement randomEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='ConfirmPassword']" )
    WebElement confirmPassword ;
    @CacheLookup
    @FindBy(xpath ="//button[@id='register-button']" )
    WebElement registerButton ;

    @CacheLookup
    @FindBy(xpath ="//div[@class='result']" )
    WebElement registrationCompleteMessage ;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab ;


    public String getTextFromRegisterMessage() {
        CustomListeners.test.log(Status.PASS,"Get Register Text");
        Reporter.log("Get Register Text "+registerMessage.toString());
        return getTextFromElement(registerMessage);
    }


    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
        CustomListeners.test.log(Status.PASS,"Enter First Name");
        Reporter.log("Get Register Text "+firstName+"fName"+firstName.toString());
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastName, lName);
        CustomListeners.test.log(Status.PASS,"Enter Last Name");
        Reporter.log("Enter Last Name "+lastName+"lname"+lastName.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(randomEmail, toString());
        CustomListeners.test.log(Status.PASS,"Enter Email Address");
        Reporter.log(" Enter Email Address"+randomEmail+"email"+randomEmail.toString());
    }

    public void enterPassword(String pWord) {
        sendTextToElement(password, pWord);
        CustomListeners.test.log(Status.PASS,"Enter Password");
        Reporter.log("Enter Password "+password+"pWord"+password.toString());
    }

    public void enterConfirmPassword(String cPWord) {
        sendTextToElement(confirmPassword, cPWord);
        CustomListeners.test.log(Status.PASS,"Enter Confirm Password");
        Reporter.log("Enter Confirm Password "+confirmPassword+"cPWord"+confirmPassword.toString());
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"Click On Register Button");
        Reporter.log("Click On Register Button"+registerButton.toString());
    }

    public String getTextFromRegisterationCompleteMessage() {
        CustomListeners.test.log(Status.PASS,"Get Registeration Complete Text ");
        Reporter.log("Get Registeration Complete Text "+registrationCompleteMessage.toString());
        return getTextFromElement(registrationCompleteMessage);

    }


    public void clickOnTheContinueButton() {
        clickOnElement(continueTab);
        CustomListeners.test.log(Status.PASS,"Click On The Continue Button");
        Reporter.log("Click On The Continue Button "+continueTab.toString());
    }

}
