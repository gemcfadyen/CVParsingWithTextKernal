package parsing;

import parsing.exceptions.ClientException;
import parsing.exceptions.DocumentServiceException;
import org.junit.Test;
import parsing.request.Request;
import parsing.request.RequestBuilder;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void documentServiceExecuted() {
        FakeDocumentService documentServiceSpy = new FakeDocumentService();
        Client client = new Client(documentServiceSpy);

        Request request =  RequestBuilder.aRequestBuilder()
                .withAccountName("test-account")
                .withPassword("test-pwd")
                .withAbsolutePathToCv("fake-path")
                .build();
        client.post(request);

        assertEquals(1, documentServiceSpy.numberOfTimesExecuteInvoked());
    }

    @Test
    public void documentServiceSuccessfullyReturnsResponse() {
        FakeDocumentService documentServiceSpy = new FakeDocumentService();
        Client client = new Client(documentServiceSpy);

        Request request =  RequestBuilder.aRequestBuilder()
                .withAccountName("test-account")
                .withPassword("test-pwd")
                .withAbsolutePathToCv("fake-path")
                .build();
        String response = client.post(request);

        assertEquals("Successful-Response-From-Document-Service", response);
    }

    @Test (expected = ClientException.class)
    public void exceptionThrownWhenErrorInDocumentProcessing() {
        DocumentService documentServiceWhichThrowsException = request -> {
            throw new DocumentServiceException();
        };

        Client client = new Client(documentServiceWhichThrowsException);

        Request request =  RequestBuilder.aRequestBuilder()
                .withAccountName("test-account")
                .withPassword("test-pwd")
                .withAbsolutePathToCv("fake-path")
                .build();

        client.post(request);
    }
}
