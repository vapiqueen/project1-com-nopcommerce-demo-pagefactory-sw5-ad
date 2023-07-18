package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WelcomeToOurStorePage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//h2[contains(text(),'Welcome to our store')]" )
    WebElement welcomeToStoreMessage ;
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Log out')]" )
    WebElement logOutLink ;

    public String getTextFromWelcomeToStore(){
        CustomListeners.test.log(Status.PASS,"Get Text For Welcome To Store");
        Reporter.log("Get Text For Welcome To Store "+welcomeToStoreMessage.toString());
        return getTextFromElement(welcomeToStoreMessage);

    }



    public void clickOnLogOutLink(){
        clickOnElement(logOutLink);
        CustomListeners.test.log(Status.PASS,"Click On LogOut Link");
        Reporter.log("Click On LogOut Link"+logOutLink.toString());
    }
    public String verifyUrl() {
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = driver.getCurrentUrl();
        CustomListeners.test.log(Status.PASS,"Verify Url");
        Reporter.log("Verify Url "+actualUrl.toString());
        return actualUrl;
    }

}
