package sdetfastrack.tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import sdetfastrack.pages.AlertClass;
import sdetfastrack.utilities.Driver;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTest {

    AlertClass alertClass=new AlertClass();

    @Test
    public void testAlert(){
        //1. Go to website: http://practice.cybertekschool.com/javascript_alerts
        Driver.getDriver().get("http://practice.cybertekschool.com/javascript_alerts");
        alertClass.clickForJs.click();
        Alert  alert1=Driver.getDriver().switchTo().alert();
        alert1.accept();
        String expected="You successfully clicked an alert";
        String actual=alertClass.text.getText();
        assertEquals(expected,actual);

        alertClass.confirmJs.click();
        Alert alert2=Driver.getDriver().switchTo().alert();
        alert2.accept();
        expected ="You clicked: Ok";
        actual=alertClass.text.getText();
        assertEquals(expected,actual);

        alertClass.promptJs.click();
        Alert alert3=Driver.getDriver().switchTo().alert();
        alert3.sendKeys("Test");
        alert3.accept();
        expected="You entered: Test";
        actual=alertClass.text.getText();

        assertEquals(expected,actual);
        //2.Clicking to the button for alert to be displayed
        //3. Click to OK button from the alert
        //4. Verify "You successfully clicked an alert" text is displayed.
    }

}
