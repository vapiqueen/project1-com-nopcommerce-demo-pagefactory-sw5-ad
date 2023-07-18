package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignInPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Welcome, Please Sign In!')]" )
    WebElement signInPageWelcomeMessage ;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Register')]" )
    By registerTab = By.xpath("//button[contains(text(),'Register')]");
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Checkout as Guest')]" )
    WebElement checkOutAsGuest ;


    public String getTextFromWelcomeMessage(){
        CustomListeners.test.log(Status.PASS,"Get Text From Welcome Message");
        Reporter.log("Get Text From Welcome Message "+signInPageWelcomeMessage.toString());
        return getTextFromElement(signInPageWelcomeMessage);

    }



    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
        CustomListeners.test.log(Status.PASS,"Click On Customer Register Tab");
        Reporter.log("Click On Customer Register Tab"+registerTab.toString());
    }

    public void clickOnCheckOutAsAGuestTab(){
        clickOnElement(checkOutAsGuest);
        CustomListeners.test.log(Status.PASS,"Click On Check Out As A Guest");
        Reporter.log("Click On Check Out As A Guest "+checkOutAsGuest.toString());
    }
}
