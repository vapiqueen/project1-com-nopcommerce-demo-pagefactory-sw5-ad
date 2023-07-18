package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputerPage computersPage=new ComputerPage();

    @BeforeMethod
    public void inIT(){
        homePage = new HomePage();
      computersPage=new ComputerPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})

    public void verifyPageNavigation(){

        homePage.selectMenu("Computers");
        String expectedMessage1 = "Computers";

       // Assert.assertEquals(computersPage.getComputersPageText(), expectedMessage1, "Page not found");
        homePage.selectMenu("Electronics");
        homePage.selectMenu("Apparel");
        homePage.selectMenu("Digital downloads");
        homePage.selectMenu("Books");
        homePage.selectMenu("Jewelry");
        homePage.selectMenu("Gift Cards");




    }
}
