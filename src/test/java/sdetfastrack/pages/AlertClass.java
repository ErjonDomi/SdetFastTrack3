package sdetfastrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdetfastrack.utilities.Driver;

public class AlertClass {
    public AlertClass() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "result")
    public WebElement text;

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    public WebElement clickForJs;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    public WebElement confirmJs;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    public WebElement promptJs;



    //1. Go to website: http://practice.cybertekschool.com/javascript_alerts
    //2.Clicking to the button for alert to be displayed
    //3. Click to OK button from the alert
    //4. Verify "You successfully clicked an alert" text is displayed.
}
