package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath ="Computers" )
    WebElement computersMenu ;
   @CacheLookup
   @FindBy(xpath = "//div[@class='block block-category-navigation']/descendant::a[2]")
   WebElement desktopLink ;
    @CacheLookup
    @FindBy(xpath = "//img[@src='https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg']")
    WebElement addToCart;
    public String getComputersPageText(){
        CustomListeners.test.log(Status.PASS, "Get Computer Page");
        Reporter.log("Get Computer Page" + computersMenu.toString());
        return getTextFromElement(computersMenu);
    }

    public void clickOnDesktopOptionOfComputerTab(){
        clickOnElement(desktopLink);
        CustomListeners.test.log(Status.PASS, "Click On Desktop Option");
        Reporter.log("Click On Desktop Option" +desktopLink.toString());

    }
    public void clickOnAddToCartForBuildYourOwnComputer(){
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click On Add To Cart For Build Your Computer");
        Reporter.log("Click On Add To Cart For Build Your Computer" +addToCart.toString());

    }



}




