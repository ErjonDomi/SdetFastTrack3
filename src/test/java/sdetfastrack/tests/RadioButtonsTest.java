package sdetfastrack.tests;

import org.testng.annotations.Test;
import sdetfastrack.pages.RadioButtonPage;
import sdetfastrack.utilities.Driver;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class RadioButtonsTest {
    RadioButtonPage radioButtonPage=new RadioButtonPage();

    @Test
    public void testRadioButtons(){
        //TC #1:radio buttons
        //1.GO TO: http://practice.cybertekschool.com/radio_buttons

        Driver.getDriver().get("http://practice.cybertekschool.com/radio_buttons");
        //2. Confirm radio button #Blue is enabled by default
        assertTrue("Blue button was selected",radioButtonPage.blueRadioButton.isSelected());
        //3. Confirm radio button #Red is NOT enabled by default
        assertTrue("Red button was not selected",!radioButtonPage.redRadioButton.isSelected());
        assertFalse("Red button was not selected",radioButtonPage.redRadioButton.isSelected());
        //4. Click radio button #Red to select it.
        radioButtonPage.redRadioButton.click();
        //5. Verify “Radio button 'Red' is selected.
        assertTrue("Red button was selected",radioButtonPage.redRadioButton.isSelected());
        //6. Verify “Radio button 'Blue' is NOT selected.
        assertFalse("Blue button was  selected",radioButtonPage.blueRadioButton.isSelected());
        //7. Select each sport verify each is selected.
        List<String> sports= Arrays.asList("basketball","football","hockey","water_polo");

        for (String sport : sports) {
            assertTrue(radioButtonPage.selectSport(sport));
        }
    }

}
