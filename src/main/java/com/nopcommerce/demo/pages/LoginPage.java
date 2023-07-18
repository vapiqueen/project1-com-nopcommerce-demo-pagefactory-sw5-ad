package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "h1")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "Email")
    WebElement emailField ;

    @CacheLookup
    @FindBy(xpath = "password")
    WebElement passwordField ;

    public void getWelcomeText(){
        CustomListeners.test.log(Status.PASS, "get  welcome text ");
        Reporter.log("get welcome text" + welcomeText.toString());

    }
    public void enterEmailAddress(){
        sendTextToElement(emailField,"ada@gmail.com");
        CustomListeners.test.log(Status.PASS, "enter Email Address");
        Reporter.log("enter Email Address" +emailField .toString());

    }
    public void enterPassword(){
        sendTextToElement(passwordField,"Helloworld");
        CustomListeners.test.log(Status.PASS, "enter Password");
        Reporter.log("enter Password" +passwordField .toString());

    }
}
