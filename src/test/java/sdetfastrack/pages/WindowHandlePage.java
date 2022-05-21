package sdetfastrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdetfastrack.utilities.Driver;

public class WindowHandlePage {

    public WindowHandlePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='example']/a")
    public WebElement clickHereLink;
    //1. Go to website: http://practice.cybertekschool.com/windows
    //2. Assert: Title is “Practice”
    //3. Click to: “Click Here” text
    //4. Switch to new Window.
    //5. Assert: Title is “New Window”
    //6.Switch back to main handle

}
