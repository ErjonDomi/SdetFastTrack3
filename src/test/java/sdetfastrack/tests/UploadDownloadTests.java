package sdetfastrack.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sdetfastrack.pages.UploadPage;
import sdetfastrack.utilities.Driver;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class UploadDownloadTests {

    UploadPage uploadPage=new UploadPage();

    @Test
    public void testUpload(){
        //1. Go to http://practice.cybertekschool.com/upload

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        String path="C:\\Users\\erjon\\Desktop\\download.jfif";
        //"C:\Users\erjon\Desktop\download.jfif"
        String macPath=":/Users/erjon/Desktop/download.jfif";

        String c="src/test/java/sdetfastrack/a/download.jfif";


        //2.Find any file that is not too big in size. And get the path of the file.
        uploadPage.chooseFile.sendKeys(path);
        //3.Upload the file
        uploadPage.submit.click();
        //4.Assert that file upload message is displayed
        assertTrue(uploadPage.uploadMessage.isDisplayed());
    }


    @Test
    public void testDownload(){

        Driver.getDriver().get("http://practice.cybertekschool.com/download");
        List<WebElement>list=uploadPage.allLinks;
        for (WebElement eachWebElement : list) {
            eachWebElement.click();
        }
    }



}
