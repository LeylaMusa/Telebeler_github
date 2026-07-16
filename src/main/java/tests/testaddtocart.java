package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class testaddtocart {
    public class BasePage {
        protected WebDriver driver;
        protected WebDriverWait wait;
        public BasePage(WebDriver driver){
            this.driver=driver;
            this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            @BeforeMethod
            public void setUp() {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.saucedemo.com/");
            }

            @AfterMethod
            public void tearDown() {
                if (driver != null) {
                    driver.quit();
                    



        }}}}}
