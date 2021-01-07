package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By signInButton = By.xpath("(//*[text()='Sign in'])[last()]");

    public HomePage(WebDriver driver) { this.driver = driver; }

    public YotubePage clickSignInButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(signInButton).click();
        return new YotubePage(driver);
    }



}
