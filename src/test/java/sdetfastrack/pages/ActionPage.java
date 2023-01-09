package sdetfastrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdetfastrack.utilities.Driver;

public class ActionPage {

    public ActionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//img[@alt='User Avatar'])[1]")
    public WebElement imageOne;

    @FindBy(xpath = "(//img[@alt='User Avatar'])[2]")
    public WebElement imageTwo;

    @FindBy(xpath = "(//img[@alt='User Avatar'])[3]")
    public WebElement imageThree;

    @FindBy(xpath = "//h5[text()='name: user2']")
    public WebElement userTwo;

    @FindBy(xpath = "//h5[text()='name: user1']")
    public WebElement userOne;

    @FindBy(xpath = "//h5[text()='name: user3']")
    public WebElement userThree;

    @FindBy(id = "hot-spot")
    public WebElement hotSpotButton;

    //TC#1
    //1. Go to http://practice.cybertekschool.com/hovers
    //2. Hover over to first image
    //3. Assert: “name: user1” is displayed
    //4. Hover over to second image
    //5. Assert: “name: user2” is displayed
    //6. Hover over to third image
    //7. Assert: “name: user2” is displayed


    //TC#2
    //1. Go	to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    //2. Switch	to iframe.
    //3. Double	click on the text “Double-click	me to change my	text color.”
    // 4. Assert: Text’s “style” attribute value contains “red”

    //TC#3
    //1. Go	to https://the-internet.herokuapp.com/context_menu
    //2. Right click to the	box.
    //3. Alert will open.
    //4. Accept	alert.
}
