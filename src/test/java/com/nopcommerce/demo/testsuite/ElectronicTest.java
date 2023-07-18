package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicTest extends BaseTest {

    Electronics electronics = new Electronics();
    CellPhonePage celloPhonesPage = new CellPhonePage();

    ShoppingCart shoppingCartPage = new ShoppingCart();
    SignInPage signInPage = new SignInPage();
    RegisterationPage registrationPage = new RegisterationPage();


    ShippingOptionPage shippingOptionPage = new ShippingOptionPage();
    PaymentPage paymentPage = new PaymentPage();

    ConfrimOrderPage confirmOrder = new ConfrimOrderPage();
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void inIt(){
        electronics = new Electronics();

        celloPhonesPage = new CellPhonePage();

        shoppingCartPage = new ShoppingCart();

      signInPage = new SignInPage();

       registrationPage = new RegisterationPage();

       shippingOptionPage = new ShippingOptionPage();

     paymentPage = new PaymentPage();

     confirmOrder = new ConfrimOrderPage();

       homePage = new HomePage();
    }


    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronics.mouseHoverOnElectronicPageAndClick();
        electronics.getCellPhonesPageWelcomeText();
        electronics.clickOnTheListViewTab();


    }

    @Test(groups = { "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {

        electronics.mouseHoverOnElectronicPageAndClick();
        electronics.getCellPhonesPageWelcomeText();
        electronics.clickOnTheListViewTab();
        //celloPhonesPage.clickOnElement();
        celloPhonesPage.getTextFromNokiaLumiaDisplayText();
        Assert.assertEquals(celloPhonesPage.getTextFromNokiaLumiaDisplayText(), "Nokia Lumia 1020", "Text is not matched");
        celloPhonesPage.getTextFromNokiaLumiaDisplayText();
        Assert.assertEquals(celloPhonesPage.getTextFromNokiaLumiaDisplayText(), "$349.00", "price is not matched");
        celloPhonesPage.clearTheQuantityField();
        celloPhonesPage.UpdatedQuantity0("2");
        celloPhonesPage.clickOnAddToCartButton();
        celloPhonesPage.getProductAddedToCartMessage();
        Assert.assertEquals(celloPhonesPage.getProductAddedToCartMessage(), "The product has been added to your shopping cart", "Add to Cart Message is not displayed correctly");
        celloPhonesPage.closeTheGreenBarByClickingTheCrossButton();
        celloPhonesPage.mouseHoverOnShoppingCartButton();
        celloPhonesPage.clickOnAddToCartButton();
        Assert.assertEquals(shoppingCartPage.getTextFromDisplayMessage(), "Shopping cart", "Not Matching");
        shoppingCartPage.updateTheQuantityField("2");
        Assert.assertEquals(shoppingCartPage.getTextFromAmountElement(), "$698.00", "Not matching");
        shoppingCartPage.clickOnTermsAndConditionsAgreeBox();
        shoppingCartPage.clickOnCheckoutButton();


        Assert.assertEquals(signInPage.getTextFromWelcomeMessage(), "Welcome, Please Sign In!", "Not Matching");
        signInPage.clickOnRegisterTab();
        Assert.assertEquals(registrationPage.getTextFromRegisterMessage(), "Register", "Not Matching");
        registrationPage.enterFirstName("John");
        registrationPage.enterLastName("Smith");
        registrationPage.enterEmail("john" + toString() + "@gmail.com");
        registrationPage.enterPassword("abc123");
        registrationPage.enterConfirmPassword("abc123");
        registrationPage.clickOnRegisterButton();

        Assert.assertEquals(registrationPage.getTextFromRegisterationCompleteMessage(), "Register", "Not Matching");

        Assert.assertEquals(shoppingCartPage.getTextFromDisplayMessage(), "Shopping cart", "Message is not displyed");
        shoppingCartPage.clickOnTermsAndConditionsAgreeBox();
        shoppingCartPage.clickOnCheckoutButton();

        shippingOptionPage.clickOnButton2ndDayAir();
        shippingOptionPage.clickOnContinueButton();

        paymentPage.clickOnCreditCardRadioButton();
        paymentPage.clickOnContinueButton();

        paymentPage.selectCreditCardType(0);
        paymentPage.inputCardHoldersName("Peter Rabit");
        paymentPage.inputCardNumber("5555 5555 5555 4444");
        paymentPage.inputExpireMonth("12");
        paymentPage.inputExpireYear("2025");
        paymentPage.inputCardCode("143");
        paymentPage.clickOnContinueButton();


        Assert.assertEquals(confirmOrder.getTextFromPaymentMethodText(), "Credit Card", "Not Matching");
        confirmOrder.clickOnConfirmButton();


    }
}
