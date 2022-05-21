package sdetfastrack.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sdetfastrack.pages.SynchronizationPage;
import sdetfastrack.utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class SynchronizationTests {

    SynchronizationPage synchronizationPage=new SynchronizationPage();


    @Test
    public void testSynchronization(){

        //TC#1
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        //2. Click to start

        synchronizationPage.startButton.click();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);
        //3. Wait until loading bar disappears
        wait.until(ExpectedConditions.visibilityOf(synchronizationPage.username));

        //4. Assert username inputbox is displayed
        assertTrue("Username was not displayed",synchronizationPage.username.isDisplayed());

        //5. Enter username: tomsmith
        synchronizationPage.username.sendKeys("tomsmithasdaddffgdfhdehed");
        //6. Enter password: incorrectpassword
        synchronizationPage.password.sendKeys("incorrectpasswordafafafafafgeherherge");
        //7. Click to Submit button
        synchronizationPage.submitButton.click();

        wait.until(ExpectedConditions.visibilityOf(synchronizationPage.errorMessage));
        //8. Assert “Your password is invalid!” text is displayed.

        assertTrue("Message was not displayed",synchronizationPage.errorMessage.getText().contains("Your password is invalid!"));
    }

    @Test
    public void testSynchronizationTest02(){
        //TC#2
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);

        //2. Wait until title is “Dynamic title”
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        //3. Assert : Message “Done” is displayed.
        assertTrue("Was not displayed",synchronizationPage.doneMessage.isDisplayed());
        assertTrue("Did not contains done message",synchronizationPage.doneMessage.getText().contains("Done"));
        //4. Assert : Image is displayed.
        assertTrue("Image was not displayed",synchronizationPage.image.isDisplayed());
    }
}
