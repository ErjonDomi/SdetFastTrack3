package sdetfastrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sdetfastrack.utilities.Driver;

public class RadioButtonPage {
    public RadioButtonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "red")
    public WebElement redRadioButton;

    @FindBy(id = "blue")
    public WebElement blueRadioButton;

    public boolean selectSport(String sportType) {
        WebElement sport=Driver.getDriver().findElement(By.xpath("//input[@id='" + sportType + "']"));
        sport.click();
       return sport.isSelected();
    }

    //TC #1:radio buttons
    //1.GO TO: http://practice.cybertekschool.com/radio_buttons
    //2. Confirm radio button #Blue is enabled by default
    //3. Confirm radio button #Red is NOT enabled by default
    //4. Click radio button #Red to select it.
    //5. Verify “Radio button 'Red' is selected.
    //6. Verify “Radio button 'Blue' is NOT selected.
    //7. Select each sport verify each is selected.


}
