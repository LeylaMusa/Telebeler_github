package utils;
import java.util.Random;
    public class TestData {
        Random random=new Random();
        public String Fristname(){
            return "nari"+random.nextInt(100);
        }
        public static final String USERNAME = "standard_user";
        public static final String PASSWORD = "secret_sauce";
        public static final String LOGIN_URL = "https://www.saucedemo.com/";
        public static final String INVENTORY_URL = "https://www.saucedemo.com/inventory.html";
        public static final String CART_URL = "https://www.saucedemo.com/cart.html";
        public static final String CHECKOUT_STEP_ONE_URL = "https://www.saucedemo.com/checkout-step-one.html";
        public static final String CHECKOUT_STEP_TWO_URL = "https://www.saucedemo.com/checkout-step-two.html";
        public static final String CHECKOUT_COMPLETE_URL = "https://www.saucedemo.com/checkout-complete.html";
        public  static final String FALSE_CART_URL = "https://www.saucedemo.com/login.html";
        public static final String FIRST_NAME = "Narmin";
        public static final String LAST_NAME = "Osmanova";
        public static final String POSTAL_CODE = "AZ1000";
        public static final String HOME_PAGE_TITLE = "Swag Labs";
    }


