package utils;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  // Declare Properties type variable, then the Properties class imported
    static Properties prop;

    public static Properties readProperties(String filePath)  {
    // We are reading file here

        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Creating new object of the Properties class
            prop = new Properties();
            // Assigning OR loading the values of the properties file to the Properties variable prop
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }
    // To get/retrieve/fetch value from the properties file, we use this method and pass as parameter needed key
    public static String getPropertiesValue(String key){
        return prop.getProperty(key);

    }
}
