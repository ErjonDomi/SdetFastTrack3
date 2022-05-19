package sdetfastrack.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import sdetfastrack.pages.DropDownPage;
import sdetfastrack.utilities.Driver;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.*;

public class DropDownTests {
    DropDownPage dropDownPage = new DropDownPage();

    @Test
    public void testDropDown01() {
        //TC#1
        //1. Go to http://practice.cybertekschool.com/dropdown
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

        //2. Select Illinois --> select by visible text
        Select select = new Select(dropDownPage.stateDropdown);
        String expectedState = "Illinois";
        select.selectByVisibleText("Illinois");
        String actualState = select.getFirstSelectedOption().getText();
        assertEquals("Illinois was not selected", expectedState, actualState);

        //3. Select Virginia --> select by value
        select.selectByValue("VA");
        expectedState = "Virginia";
        actualState = select.getFirstSelectedOption().getText();
        assertEquals("Virginia was not selected", expectedState, actualState);

        //4. Select California --> select by index
        select.selectByIndex(5);
        //5. Verify final selected option is California.
        expectedState = "California";
        actualState = select.getFirstSelectedOption().getText();
        assertEquals("Virginia was not selected", expectedState, actualState);
    }

    @Test
    public void testDropDown02() {
        //TC#2
        //Select “December 1st, 1950g” and verify it is selected.
        //1. Go to http://practice.cybertekschool.com/dropdown
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        Select selectYear = new Select(dropDownPage.yearDropdown);
        //2. Select Year --> by visible text
        selectYear.selectByVisibleText("1950");

        //3. Select Month -->  by value
        Select selectMonth = new Select(dropDownPage.monthDropdown);
        selectMonth.selectByValue("11");

        //4. Select Day -->  by index

        Select selectDay = new Select(dropDownPage.dayDropdown);
        selectDay.selectByIndex(0);

        String expectedResult = "December 1 1950";
        String actualResult = selectMonth.getFirstSelectedOption().getText() + " " +
                selectDay.getFirstSelectedOption().getText() + " " +
                selectYear.getFirstSelectedOption().getText();

        assertEquals("Did not match,",expectedResult,actualResult);
    }

    @Test
    public void testDropDown03(){
        //TC#3
        //1.Go to http://practice.cybertekschool.com/dropdown
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        Select selectLanguages=new Select(dropDownPage.languageDropdown);
        //2. Select all the options from multiple select dropdown.
        List<WebElement>allOptions= selectLanguages.getOptions();
        List<String>text=allOptions.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println("text = " + text);
        //3. Print out all selected values and verify each is selected.
        for (WebElement eachWebelement : allOptions) {
            String eachText=eachWebelement.getText();
            selectLanguages.selectByVisibleText(eachText);
            System.out.println("selectLanguages = " +eachText);
            assertTrue(eachWebelement.isSelected());
        }
        //4.Deselect all values and verify each is deselected.

        selectLanguages.deselectAll();
        for (WebElement eachWeb : allOptions) {

            assertTrue(!eachWeb.isSelected());
            assertFalse(eachWeb.isSelected());
        }

    }

}
