package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class HomePage extends BasePage {
        public HomePage(WebDriver driver) {
            super(driver);
        }

        private By addtocartButton = By.id("add-to-cart-sauce-labs-backpack");
        private By carticon = By.className("shopping_cart_link");
        private By lagoutButton=By.id("logout_sidebar_link");
        private  By burgerMenu=By.id("react-burger-menu-btn");
        private  By allItems=By.id("inventory_sidebar_link");
        private By about=By.id("about_sidebar_link");
        private By resetAppState=By.id("reset_sidebar_link");


        public void adtocart() {
            driver.findElement(addtocartButton).click();
        }

        public void opencart() {
            driver.findElement(carticon).click();
        }
        public void clicklogoutButton(){
            driver.findElement(lagoutButton).click();
        }
        public void clickburgermenyu(){
            driver.findElement(burgerMenu).click();
        }
        public void clickAllItems(){
            driver.findElement(allItems).click();
        }
        public void clickAbout(){
            driver.findElement(about).click();
        }
        public void clickResetAppState(){
            driver.findElement(resetAppState).click();
        }

    }



