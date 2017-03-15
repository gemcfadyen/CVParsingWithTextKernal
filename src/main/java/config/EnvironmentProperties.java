package config;

import exceptions.InvalidPropertyFileException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentProperties {
    private Properties properties;

    public EnvironmentProperties(String fileName) {
        File configFile = new File(fileName);
        properties = new Properties();
        loadPropertiesFrom(configFile);
    }

    public String getHost() {
        return valueFor("host");
    }

    public String getAccountName() {
        return valueFor("accountName");
    }

    public String getUserName() {
        return valueFor("userName");
    }

    public String getPassword() {
        return valueFor("password");
    }

    private void loadPropertiesFrom(File configFile) {
        try {
            FileReader reader = new FileReader(configFile);
            properties.load(reader);
        } catch (IOException e) {
            throw new InvalidPropertyFileException();
        }
    }

    private String valueFor(String key) {
        return properties.getProperty(key);
    }
}
