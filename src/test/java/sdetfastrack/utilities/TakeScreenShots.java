package sdetfastrack.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenShots {
    public static void takeScreenShot() {

        File screen = ((TakesScreenshot)Driver.getDriver() ).getScreenshotAs(OutputType.FILE);
        String path =System.getProperty("user.dir");
        try {
            FileUtils.copyFile(screen, new File(path + "\\screenshots\\" + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
