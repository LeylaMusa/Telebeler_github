package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;
import pages.CartPage;
import pages.CheckoutPage;
import utils.TestData;

public class CheckoutTest extends BaseTest {

    @Test
    public void testSuccessfulCheckout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(TestData.USERNAME, TestData.PASSWORD);
        HomePage homePage = new HomePage(driver);
        homePage.adtocart();
        homePage.opencart();
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterCheckoutInformation("Ali", "Aliyev", "AZ1000");
        checkoutPage.clickContinue();
        checkoutPage.clickFinish();
        String actualMessage = checkoutPage.getSuccessMessageText();
        String expectedMessage = "Thank you for your order!";

        Assert.assertEquals(actualMessage, expectedMessage, "Sifariş uğurla tamamlanmadı!");
    }
}