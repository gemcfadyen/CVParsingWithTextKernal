package parsing.config;

import parsing.exceptions.InvalidPropertyFileException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfigTest {

    @Test
    public void configHasUrl() {
        EnvironmentProperties environmentProperties = new EnvironmentProperties("src/test/resources/test.properties");

        assertEquals("www.test.host.com", environmentProperties.getHost());
    }

    @Test
    public void configHasAccountName() {
        EnvironmentProperties environmentProperties = new EnvironmentProperties("src/test/resources/test.properties");

        assertEquals("test-account-name", environmentProperties.getAccountName());
    }

    @Test
    public void configHasUserName() {
        EnvironmentProperties environmentProperties = new EnvironmentProperties("src/test/resources/test.properties");

        assertEquals("test-user-name", environmentProperties.getUserName());
    }

    @Test
    public void configHasPassword() {
        EnvironmentProperties environmentProperties = new EnvironmentProperties("src/test/resources/test.properties");

        assertEquals("test-password", environmentProperties.getPassword());
    }

    @Test(expected= InvalidPropertyFileException.class)
    public void exceptionThrownWhenPropertyFileDoesntExist() {
        new EnvironmentProperties("non-existing-filename");
    }
}
