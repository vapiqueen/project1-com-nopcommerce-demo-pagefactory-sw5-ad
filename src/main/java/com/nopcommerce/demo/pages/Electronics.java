package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics extends Utility {

    @CacheLookup
    @FindBy(xpath = "Electronics")
    WebElement electronics;
    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[text()='Cell phones ']" )
    WebElement cellPhones ;

   @CacheLookup
   @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
   WebElement cellPhonesPageText ;
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'List')]" )
    WebElement listViewTab;


    public void mouseHoverOnElectronicPageAndClick() {
        mouseHoverToElement(electronics);
        mouseHoverToElementAndClick(cellPhones);
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Electronic Page And Click");
        Reporter.log("Mouse Hover On Electronic Page And Click" + electronics.toString());
    }

    public String getCellPhonesPageWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Get Welcome Text On Cell Phone Page");
        Reporter.log("Get Welcome Text On Cell Phone Page"+cellPhonesPageText.toString());
        return getTextFromElement(cellPhonesPageText);
    }

    public void clickOnTheListViewTab() {
        CustomListeners.test.log(Status.PASS, "Click On The View Tab");
        Reporter.log("Click On The View Tab"+listViewTab.toString());
        clickOnElement(listViewTab);
    }


}
