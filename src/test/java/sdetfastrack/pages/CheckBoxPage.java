package sdetfastrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdetfastrack.utilities.Driver;

public class CheckBoxPage {

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "box1")
    public WebElement checkBoxOne;

    @FindBy(id = "box2")
    public WebElement checkBoxTwo;

    @FindBy(id = "layered_id_attribute_group_1")
    public WebElement sizeSmallCheckbox;

    @FindBy(id = "layered_id_attribute_group_2")
    public WebElement sizeMediumCheckbox;

    @FindBy(id = "layered_id_attribute_group_3")
    public WebElement sizeLargeCheckbox;

    @FindBy(id = "layered_category_8")
    public WebElement dressCheckbox;

    //TC #1:checkboxes
    //1. Go to http://practice.cybertekschool.com/checkboxes
    //2. Confirm checkbox #1 is NOT selected by default
    //3. Confirm checkbox #2 is SELECTED by default.
    //4. Click checkbox #1 to select it.
    //5. Click checkbox #2 to deselect it.
    //6. Confirm checkbox #1 is SELECTED.
    //7. Confirm checkbox #2 is NOT selected.
//

    //1. Go to http://automationpractice.com/index.php?id_category=3&controller=category#/
    //2. Click checkbox Size #S to select it.
    //3. Assert that URL contains size-s.
    //4.Click checkbox Size #M to select it.
    //5. Assert that URL contains size-s-m.
    //6. Click checkbox Size #L to select it.
    //7. Assert that URL contains size-s-m-l.
    //8. Click checkbox Categories #Dresses to select it.
    //9. Assert that URL contains categories-dresses.

}
