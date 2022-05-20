package sdetfastrack.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sdetfastrack.pages.ActionPage;
import sdetfastrack.utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class ActionClassTests {
    ActionPage actionPage=new ActionPage();


    @Test
    public void testAction01() throws InterruptedException {
        //TC#1
        //1. Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        Actions actions=new Actions(Driver.getDriver());
        //2. Hover over to first image
        actions.moveToElement(actionPage.imageOne).perform();
        //3. Assert: “name: user1” is displayed
        //Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(actionPage.userOne));
        assertTrue(actionPage.userOne.isDisplayed());

        //4. Hover over to second image
        actions.moveToElement(actionPage.imageTwo).build().perform();
        //5. Assert: “name: user2” is displayed
        wait.until(ExpectedConditions.visibilityOf(actionPage.userTwo));
        assertTrue(actionPage.userTwo.isDisplayed());

        //6. Hover over to third image
        actions.moveToElement(actionPage.imageThree).perform();
        //7. Assert: “name: user2” is displayed
        wait.until(ExpectedConditions.visibilityOf(actionPage.userThree));
        assertTrue(actionPage.userThree.isDisplayed());
    }


    @Test
    public void testActions02(){
        //TC#3
        //1. Go	to https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        Actions actions=new Actions(Driver.getDriver());
        //2. Right click to the	box.
        actions.moveToElement(actionPage.hotSpotButton).contextClick().perform();
        //3. Alert will open.
        Alert alert =Driver.getDriver().switchTo().alert();
        //4. Accept	alert.
        alert.accept();

        actions.moveToElement(actionPage.hotSpotButton).clickAndHold().moveToElement(actionPage.imageThree).release().perform();
       //actions.dragAndDrop()
        //actions.doubleClick();
        ///actions.
    }

}
