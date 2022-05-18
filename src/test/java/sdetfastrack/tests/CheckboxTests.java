package sdetfastrack.tests;

import org.testng.annotations.Test;
import sdetfastrack.pages.CheckBoxPage;
import sdetfastrack.utilities.Driver;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CheckboxTests {

    CheckBoxPage checkBoxPage =new CheckBoxPage();

    @Test
    public void testCheckBox() {
        //TC #1:checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        Driver.getDriver().get("http://practice.cybertekschool.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default
        assertTrue("Checkbox one was selected",!checkBoxPage.checkBoxOne.isSelected());
        assertFalse("Checkbox one was selected",checkBoxPage.checkBoxOne.isSelected());
        //3. Confirm checkbox #2 is SELECTED by default.
        assertTrue("Checkbox 2 was not selected",checkBoxPage.checkBoxTwo.isSelected());
        //4. Click checkbox #1 to select it.
        checkBoxPage.checkBoxOne.click();
        //5. Click checkbox #2 to deselect it.
        checkBoxPage.checkBoxTwo.click();
        //6. Confirm checkbox #1 is SELECTED.
        assertTrue("Checkbox 1 was not selected",checkBoxPage.checkBoxOne.isSelected());
        //7. Confirm checkbox #2 is NOT selected.
        assertFalse("Checkbox 2 was selected",checkBoxPage.checkBoxTwo.isSelected());
        assertTrue("Checkbox 2 was selected",!checkBoxPage.checkBoxTwo.isSelected());
    }


    @Test
    public void testCheckboxTwo() throws InterruptedException {
        //1. Go to http://automationpractice.com/index.php?id_category=3&controller=category#/

        Driver.getDriver().get("http://automationpractice.com/index.php?id_category=3&controller=category#/");
        //2. Click checkbox Size #S to select it.
        checkBoxPage.sizeSmallCheckbox.click();
        Thread.sleep(3000);
        //3. Assert that URL contains size-s.
        String expected="size-s";
        assertTrue("Size small was not in the url",Driver.getDriver().getCurrentUrl().contains(expected));
        //4.Click checkbox Size #M to select it.
        checkBoxPage.sizeMediumCheckbox.click();
        Thread.sleep(3000);
        //5. Assert that URL contains size-s-m.
        assertTrue("Size medium was not in the url",Driver.getDriver().getCurrentUrl().contains("size-s-m"));
        //6. Click checkbox Size #L to select it.
        checkBoxPage.sizeLargeCheckbox.click();
        Thread.sleep(3000);
        //7. Assert that URL contains size-s-m-l.
        assertTrue("Size large was not in the url",Driver.getDriver().getCurrentUrl().contains("size-s-m-l"));
        //8. Click checkbox Categories #Dresses to select it.
        checkBoxPage.dressCheckbox.click();
        Thread.sleep(3000);
        //9. Assert that URL contains categories-dresses.
        assertTrue("Category dress was not in the url",Driver.getDriver().getCurrentUrl().contains("categories-dresses"));

    }
}
