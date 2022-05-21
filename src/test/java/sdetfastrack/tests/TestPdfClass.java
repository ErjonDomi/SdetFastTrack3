package sdetfastrack.tests;

import org.testng.annotations.Test;
import sdetfastrack.utilities.Driver;
import sdetfastrack.utilities.PdfReader;

import static org.testng.AssertJUnit.assertTrue;

public class TestPdfClass {

    @Test
    public void testPDF(){

        String url="https://www.orimi.com/pdf-test.pdf";

        Driver.getDriver().get("file:///C:/Users/erjon/Desktop/pdf-test.pdf");

        String tex=  PdfReader.readPdfContent(Driver.getDriver().getCurrentUrl());
        assertTrue(tex.contains("Y1A 2C6 "));
        System.out.println("tex = " + tex);

    }

}
