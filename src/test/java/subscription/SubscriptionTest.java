package subscription;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.YotubePage;

public class SubscriptionTest extends BaseTests {
    @Test
    public void testSuccessfulSubscription() {
        YotubePage yotubePage = homePage.clickSignInButton();
        yotubePage.setEmailField("testest234143@gmail.com");
        yotubePage.clickNextButton();
        yotubePage.setPasswordField("Test1234!");
        yotubePage.clickNextButton();
        yotubePage.clickSearch("mai pm");
        yotubePage.chooseChannel();
        yotubePage.clickSubscribeButton();
        yotubePage.checkSubscription();
    }
}
