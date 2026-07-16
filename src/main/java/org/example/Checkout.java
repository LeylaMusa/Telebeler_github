package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkout {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack"))).click();
driver.findElement(By.cssSelector("[data-test='shopping-cart-link']")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click();
WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
firstNameInput.sendKeys("Ramil");
WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name")));
lastNameInput.sendKeys("Memmedov");
WebElement postalCodeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code")));
postalCodeInput.sendKeys("6000");
wait.until(ExpectedConditions.elementToBeClickable(By.id("continue"))).click();;
}}
