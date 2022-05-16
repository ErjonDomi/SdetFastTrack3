package sdetfastrack.pages;


public class TitleVerification {

    //TC #1: Facebook Title Verification
    //1. Open Chrome browser
    //2. Go to https://www.facebook.com
    //Expected: Facebook - Log In or Sign Up
    //Actual: we need to get from browser using selenium

    //TC #2: Back and forth navigation
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Click to Gmail from top right.
    //4- Verify title contains:
    //Expected: Gmail
    //5- Go back to Google by using the .back();
    //6- Verify title equals:
    //Expected: Google

    //TC #3: Google search
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write “apple” in search box
    //4- Click google search button
    // //(instead of clicking to search button we press ENTER)
    //5- Verify title:
    //Expected: Title should contain “apple” word
}
