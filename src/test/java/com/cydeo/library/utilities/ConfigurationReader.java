package com.cydeo.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    static {

        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(input);
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }

}

