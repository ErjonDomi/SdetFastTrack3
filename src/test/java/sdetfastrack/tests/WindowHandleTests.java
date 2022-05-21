package sdetfastrack.tests;

import org.testng.annotations.Test;
import sdetfastrack.pages.WindowHandlePage;
import sdetfastrack.utilities.Driver;

import java.util.Set;

import static org.testng.AssertJUnit.assertEquals;

public class WindowHandleTests {

WindowHandlePage windowHandlePage=new WindowHandlePage();
    @Test
    public void testWindowHandles(){

        //1. Go to website: http://practice.cybertekschool.com/windows
        Driver.getDriver().get("http://practice.cybertekschool.com/windows");

        //2. Assert: Title is “Practice”

        String expectedTitle="Windows";
        String actualTitle=Driver.getDriver().getTitle();
        assertEquals("Titles did not match ",expectedTitle,actualTitle);

        //3. Click to: “Click Here” text

        windowHandlePage.clickHereLink.click();

        String mainHandle=Driver.getDriver().getWindowHandle();
        Set<String> allHandles=Driver.getDriver().getWindowHandles();
        //List<String>list=new ArrayList<>(Driver.getDriver().getWindowHandles());
        //Driver.getDriver().switchTo().window(list.get(1));
        //4. Switch to new Window.

        for (String eachTab : allHandles) {
            Driver.getDriver().switchTo().window(eachTab);
            String currentTitle=Driver.getDriver().getTitle();
            if (currentTitle.equals("New Window")){
                break;
            }

        }

        expectedTitle ="New Window";
        actualTitle=Driver.getDriver().getTitle();

        //5. Assert: Title is “New Window”
        assertEquals("Titles did not match ",expectedTitle,actualTitle);
        //6.Switch back to main handle

        Driver.getDriver().switchTo().window(mainHandle);

    }


}
