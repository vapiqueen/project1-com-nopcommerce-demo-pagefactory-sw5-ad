package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerMessage;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
            WebElement processor;

   @CacheLookup
   @FindBy(xpath = "product_attribute_2")
   WebElement ram;

    @CacheLookup
    @FindBy(xpath = "product_attribute_3_7")
    WebElement hdd;

    @CacheLookup
    @FindBy(xpath = "product_attribute_4_9")
    WebElement os;
   @CacheLookup
   @FindBy(xpath = "product_attribute_5_12")
   WebElement softwareBox2;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement actualTotal;
    @CacheLookup
    @FindBy(xpath = "add-to-cart-button-1")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath ="//p[text()='The product has been added to your ']" )
    WebElement productAddedMessage;
    @CacheLookup
    @FindBy(xpath ="//span[@title='Close']" )
    WebElement closingBarButton;
    @CacheLookup
    @FindBy(xpath =".cart-label" )
    WebElement shoppingCartOption;
   @CacheLookup
   @FindBy(xpath = ".button-1.cart-button")
   WebElement goToCartButton;
   @CacheLookup
   @FindBy(xpath = "//span[@id='price-value-1']")
   WebElement price;
    @CacheLookup
    @FindBy(xpath ="//p[@class='content']" )
    WebElement verifyText;



    public String getTextFromBuildYourOwnComputerMessage() {
        Reporter.log("Get Build Your Own Computer Text"+buildYourOwnComputerMessage.toString());
        CustomListeners.test.log(Status.PASS,"Get Build Your Own Computer Text");
        return getTextFromElement(buildYourOwnComputerMessage);
    }

   /* public void verifyTheBuildYourOwnComputerMessage() {
        String expectedMessage1 = "assertEquals";
        Assert.assertEquals(desktop.verifyTotal(), "£74.73", "Total not matched");
       // String actualMessage = getTextFromBuildYourOwnComputerMessage();
        Assert.assertEquals(getTextFromBuildYourOwnComputerMessage(),"assertEquals","page not found");
        //Assert.assertequal(expectedMessage, actualMessage, "Build your own computer Message is not displayed correctly");
    }*/

    public void selectGhzIntelPentiumDualCore() {
        selectByValueFromDropDown(processor,"1");
        CustomListeners.test.log(Status.PASS,"Select processor GhzIntelPentiumDualCore");
        Reporter.log("Select processor GhzIntelPentiumDualCore"+processor.toString());
    }

    public void selectRamAs8Gb(int index) {
        selectByIndexFromDropDown(ram, index);
        CustomListeners.test.log(Status.PASS,"Select 8Gb Ram");
        Reporter.log("Select 8gb Ram"+ram.toString());
    }

    public void selectHDDRadio() {
        clickOnElement(hdd);
        CustomListeners.test.log(Status.PASS,"Select HDD");
        Reporter.log("Select HDD"+hdd.toString());
    }

    public void selectOSRadioButton() {
        clickOnElement(os);
        CustomListeners.test.log(Status.PASS,"Select OS");
        Reporter.log("Select OS"+os.toString());
    }

    public void clickOnTotalCommander() {
        clickOnElement(softwareBox2);
        CustomListeners.test.log(Status.PASS,"Click On Commander");
        Reporter.log("Click on Commander"+softwareBox2.toString());
    }



    public String getTextFromActualTotal(){
        CustomListeners.test.log(Status.PASS,"Get Actual Total");
        Reporter.log("Get Actual Total"+actualTotal.toString());
        return getTextFromElement(actualTotal);

    }

    public String verifyThePrice() {
        CustomListeners.test.log(Status.PASS,"Verify the total price");
        Reporter.log("Verify the total price"+price.toString());
        return getTextFromElement(price);

    }


    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS,"Click On Add To Cart Button");
        Reporter.log("Click On Add To Cart Button"+addToCartButton.toString());
    }

    public String getTextFromProductHasBeenAddedToYourShoppingCart(){
        CustomListeners.test.log(Status.PASS,"Get text for product has been add to cart");
        Reporter.log("Get text for product has been add tocart"+productAddedMessage.toString());
        return getTextFromElement(productAddedMessage);
    }


    public void closeTheBarByClickingOnCrossButton(){
        clickOnElement(closingBarButton);
        CustomListeners.test.log(Status.PASS,"Close the bar by x button");
        Reporter.log("Close the bar by x button"+closingBarButton.toString());
    }

    public void mouseHoverOnShoppingCart(){
        clickOnElement(shoppingCartOption);
        CustomListeners.test.log(Status.PASS,"Mouse hover on shopping Cart");
        Reporter.log("Mouse hover on shopping cart"+shoppingCartOption.toString());
    }

    public void clickOnGoToCartButton(){
        clickOnElement(goToCartButton);
        CustomListeners.test.log(Status.PASS,"Click On Go To Cart Button");
        Reporter.log("Click On Go To Cart Button"+goToCartButton.toString());
    }
    public String verifyTheMessage() {
        CustomListeners.test.log(Status.PASS,"Verify the Message");
        Reporter.log("Verify the Message"+verifyText.toString());
        return getTextFromElement(verifyText);
    }


}
