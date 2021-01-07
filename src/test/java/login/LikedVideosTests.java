package login;

import base.BaseTests;
import org.testng.annotations.*;
import pages.YotubePage;

public class LikedVideosTests extends BaseTests{

    @Test
    public void testSuccessfulLogin() {
        YotubePage yotubePage = homePage.clickSignInButton();
        yotubePage.setEmailField("testest234143@gmail.com");
        yotubePage.clickNextButton();
        yotubePage.setPasswordField("Test1234!");
        yotubePage.clickNextButton();
        yotubePage.clickSearch("dogs");
        yotubePage.clickFirstVideo();
        yotubePage.clickLikeButton();
        yotubePage.clickMoreButton();
        yotubePage.checkLikedVideos();
    }
}
