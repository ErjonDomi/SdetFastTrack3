package sdetfastrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdetfastrack.utilities.Driver;

public class IframePage {

    public IframePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    public WebElement iframe;

    public String iframeAsString="mce_0_ifr";
    //mce_0_ifr

    public int iframeIndex=0;

    @FindBy(xpath = "//p[text()='Your content goes here.']")
    public WebElement text;

    //1. Go to website: http://practice.cybertekschool.com/iframe
    //2. Locate as WebElement
    //3.Pass index number
    //4.Pass id or name attribute value (IF THERE ARE ANY)
    //5.Assert: "Your content goes here." Text is displayed.
    //6.switch back to default frame
}
