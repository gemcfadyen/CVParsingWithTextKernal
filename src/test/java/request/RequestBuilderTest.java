package request;

import org.junit.Assert;
import org.junit.Test;
import request.Request;
import request.RequestBuilder;

public class RequestBuilderTest {

    @Test
    public void requestBuiltWithPathToCv() {
        Request request = RequestBuilder.aRequestBuilder()
                .withAbsolutePathToCv("/path/to/Cv.pdf")
                .build();

        Assert.assertEquals("/path/to/Cv.pdf", request.pathToCv());
    }

    @Test
    public void requestHasAccountName() {
        Request request = RequestBuilder.aRequestBuilder()
                .withAccountName("account-name")
                .build();

        Assert.assertEquals("account-name", request.accountName());
    }

    @Test
    public void requestHasUserName() {
        Request request = RequestBuilder.aRequestBuilder()
                .withUserName("user-name")
                .build();

        Assert.assertEquals("user-name", request.userName());
    }

    @Test
    public void requestHasPassword() {
        Request request = RequestBuilder.aRequestBuilder()
                .withPassword("password")
                .build();

        Assert.assertEquals("password", request.password());
    }
}
