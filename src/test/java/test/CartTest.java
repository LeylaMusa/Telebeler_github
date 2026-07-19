package test;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.HomePage;
import pages.LoginPage;
import utils.TestData;
import pages.LoginPage;
    public class CartTest extends BaseTest {


        @Test
        public void AddToCartTest(){
            LoginPage loginPage=new LoginPage(driver);
            loginPage.login(TestData.USERNAME,TestData.PASSWORD);
            Assertion assertion=new Assertion();
            assertion.assertEquals(driver.getCurrentUrl(),TestData.INVENTORY_URL);
            assertion.assertEquals(driver.getTitle(),TestData.HOME_PAGE_TITLE);
            HomePage homePage=new HomePage(driver);
            homePage.adtocart();
            homePage.opencart();
}}
