import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogOut {

@Test
    public void logOutTest() {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("react-burger-menu-btn")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();

        driver.quit();
    }
}