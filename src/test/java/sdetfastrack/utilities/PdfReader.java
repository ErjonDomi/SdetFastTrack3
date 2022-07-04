package sdetfastrack.utilities;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class PdfReader {

    public static String readPdfContent(String url) {
        InputStream in = null;
        PDDocument document = null;
        URL pdfUrl =null;
        String content="";
        try {
            pdfUrl=new URL(url);
            in = pdfUrl.openStream();
            document = PDDocument.load(in);
            content =new PDFTextStripper().getText(document);
            document.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return content;
    }
//asfadfad
}
