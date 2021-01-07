package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YotubePage {

    private WebDriver driver;
    private By emailField = By.id("identifierId");
    private By passwordField = By.xpath("//input[@type='password']");
    private By nextButton = By.xpath("//span[text()='Next']//ancestor::button");
    private By searchField = By.xpath("//input[@id='search']");
    private By firstVideo = By.xpath("(//ytd-video-renderer[@class='style-scope ytd-item-section-renderer'])[1]//a[@id='thumbnail']");
    private By likeButton = By.xpath("//*[@id='top-level-buttons']/ytd-toggle-button-renderer[1]/a");
    private By moreButton = By.xpath("(//yt-icon[@id='guide-icon']//ancestor::button)[1]");
    private By likedVideos = By.xpath("//*[text()='Filmy, które mi się podobają']");
    private By channel = By.xpath("(//yt-formatted-string[@class='style-scope ytd-channel-name'])[1]");
    private By subscribeButton = By.xpath("(//*[@id='subscribe-button']//*[text()='Subskrybuj'])[2]");
    private By allSubscriptions = By.xpath("(//a[@id='endpoint']//*[text()='Subskrypcje'])[1]");

    public YotubePage(WebDriver driver) { this.driver = driver; }

    public void setEmailField(String email) { driver.findElement(emailField).sendKeys(email);}

    public void clickNextButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(nextButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setPasswordField(String password) {driver.findElement(passwordField).sendKeys(password);}

    public void clickSearch(String video) {
        driver.findElement(searchField).sendKeys(video);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }

    public void clickFirstVideo(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(firstVideo).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickLikeButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(likeButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickMoreButton(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(moreButton).click();
    }

    public void checkLikedVideos() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(likedVideos).click();
    }

    public void chooseChannel(){
        driver.findElement(channel).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickSubscribeButton(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(subscribeButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkSubscription(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(allSubscriptions).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
