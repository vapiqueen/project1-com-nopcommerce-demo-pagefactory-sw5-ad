package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShippingOptionPage extends Utility {
    @CacheLookup
    @FindBy(id ="shippingoption_2")
    WebElement radioButton2ndDayAir;
    @CacheLookup
    @FindBy(id ="shippingoption_1" )
    WebElement radioButtonNextDayAir;
   @CacheLookup
   @FindBy(xpath ="//button[@class='button-1 shipping-method-next-step-button']" )
   WebElement continueButton ;

    public void clickOnButton2ndDayAir(){
        clickOnElement(radioButton2ndDayAir);
        CustomListeners.test.log(Status.PASS,"Click On 2nd Day Air Button");
        Reporter.log("Click On 2nd Day Air Button "+radioButton2ndDayAir.toString());
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click On Continue Button");
        Reporter.log(" Click On Continue Button"+continueButton.toString());
    }


    public void clickOnNextDayAirButton(){
        clickOnElement(radioButtonNextDayAir);
        CustomListeners.test.log(Status.PASS,"Click On Next Day Air Button");
        Reporter.log("Click On Next Day Air Button "+radioButtonNextDayAir.toString());
    }

}
