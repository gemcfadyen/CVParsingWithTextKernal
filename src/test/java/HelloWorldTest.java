import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void saysHello() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("hi", helloWorld.greet());
    }
}
