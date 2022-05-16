package sdetfastrack.pages;

import org.openqa.selenium.support.PageFactory;
import sdetfastrack.utilities.Driver;

public class RadioButtonPage {
public RadioButtonPage(){
    PageFactory.initElements(Driver.getDriver(),this);
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
