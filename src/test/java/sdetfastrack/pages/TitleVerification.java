package sdetfastrack.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdetfastrack.utilities.Driver;

public class TitleVerification {
//C:\Users\erjon\Desktop"C:\Users\erjon\Desktop\download.jfif"
    public TitleVerification() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Gmail']")
    public WebElement gmailButton;

    @FindBy(name = "q")
    private WebElement googleSearch;

    public void searchApple(){
        googleSearch.sendKeys("apple"+ Keys.ENTER);
    }

    public void signIn(){

    }





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
