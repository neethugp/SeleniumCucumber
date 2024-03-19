package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {
    public static Properties initializeProperties() {

        Properties prop = new Properties();
        File propFile = new File(System.getProperty("user.dir")+"/src/resources/config/Config.properties");
        try {
            FileInputStream fis = new FileInputStream(propFile);
            prop.load(fis);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return prop;
    }
}
