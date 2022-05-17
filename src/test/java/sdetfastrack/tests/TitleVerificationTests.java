package sdetfastrack.tests;

import org.testng.annotations.Test;
import sdetfastrack.pages.TitleVerification;
import sdetfastrack.utilities.Driver;

import static org.testng.AssertJUnit.*;

public class TitleVerificationTests {
    TitleVerification titleVerification = new TitleVerification();

    @Test
    public void testFacebookTitle() {
        //TC #1: Facebook Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        Driver.getDriver().get("https://www.facebook.com");
        //Expected: Facebook - Log In or Sign Up
        String expectedTitle = "Facebook - log in or sign up";
        //Actual: we need to get from browser using selenium
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("Title did not match", expectedTitle, actualTitle);

    }

    @Test
    public void testGoogle() {
        //TC #2: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com

        Driver.getDriver().get("https://google.com");
        //3- Click to Gmail from top right.
        titleVerification.gmailButton.click();
        //4- Verify title contains:
        //Expected: Gmail
       //String title=Driver.getDriver().getTitle();
       assertTrue(Driver.getDriver().getTitle().contains("Gmail"));
        //5- Go back to Google by using the .back();
        Driver.getDriver().navigate().back();
        //6- Verify title equals:

        assertTrue(Driver.getDriver().getTitle().contains("Google"));
        //Expected: Google
    }

    @Test
    public void testSearchGoogle(){
        //TC #3: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        Driver.getDriver().get("https://google.com");
        //3- Write “apple” in search box
        //4- Click google search button
        // //(instead of clicking to search button we press ENTER)
        titleVerification.searchApple();
        //5- Verify title:
        //Expected: Title should contain “apple” word
        assertTrue("Apple was not in the title",Driver.getDriver().getTitle().contains("apple"));
    }

}
