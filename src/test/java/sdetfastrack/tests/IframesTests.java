package sdetfastrack.tests;

import org.testng.annotations.Test;
import sdetfastrack.pages.IframePage;
import sdetfastrack.utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class IframesTests {
IframePage iframePage=new IframePage();
    @Test
    public void testIframe(){
        //1. Go to website: http://practice.cybertekschool.com/iframe
        Driver.getDriver().get("http://practice.cybertekschool.com/iframe");
        //2. Locate as WebElement
        //Driver.getDriver().switchTo().frame(iframePage.iframe);
        //3.Pass index number
       // Driver.getDriver().switchTo().frame(iframePage.iframeIndex);
        //4.Pass id or name attribute value (IF THERE ARE ANY)
        Driver.getDriver().switchTo().frame(iframePage.iframeAsString);
        //5.Assert: "Your content goes here." Text is displayed.
        assertTrue("Did not switch to Iframe",iframePage.text.isDisplayed());
        //6.switch back to default frame
        Driver.getDriver().switchTo().parentFrame();

        Driver.getDriver().switchTo().f
    }


}
