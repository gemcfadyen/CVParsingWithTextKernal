package parsing;

import org.junit.Test;
import parsing.config.EnvironmentProperties;
import parsing.exceptions.ClientException;
import parsing.request.Request;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static parsing.request.RequestBuilder.aRequestBuilder;

public class ClientIntegrationTest {

    @Test
    public void callsPostWithCvInDocForm() {
        Client client = new Client(new ProcessDocumentService());
        Request request = buildRequestForCv("src/test/resources/standardCv.doc");

        String response = client.post(request);

        assertCvHasBeenParsed(response);
    }

    @Test
    public void callsPostWithCvInPdfForm() {
        Client client = new Client(new ProcessDocumentService());
        Request request = buildRequestForCv("src/test/resources/linkedIn.pdf");

        String response = client.post(request);

        assertCvHasBeenParsed(response);
    }

    @Test
    public void callsPostWithUnstructuredCv() {
        Client client = new Client(new ProcessDocumentService());
        Request request = buildRequestForCv("src/test/resources/unstructured.pdf");

        String response = client.post(request);

        assertCvHasBeenParsed(response);
    }

    @Test
    public void documentWithSentenceParsed() {
        Client client = new Client(new ProcessDocumentService());
        Request request = buildRequestForCv("src/test/resources/blank.doc");

        String response = client.post(request);

        assertCvHasBeenParsed(response);
    }

    @Test(expected= ClientException.class)
    public void exceptionThrownWhenBlankDocumentParsed() {
        Client client = new Client(new ProcessDocumentService());
        Request request = buildRequestForCv("src/test/resources/blank.pdf");

        client.post(request);
    }

    private Request buildRequestForCv(String pathToCv) {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/main/resources/prod.properties");

        return aRequestBuilder()
                .withAbsolutePathToCv(pathToCv)
                .withAccountName(prodProperties.getAccountName())
                .withUserName(prodProperties.getUserName())
                .withPassword(prodProperties.getPassword())
                .build();
    }

    private void assertCvHasBeenParsed(String response) {
        assertThat(response, containsString("<Personal>"));
        assertThat(response, containsString("<EducationHistory>"));
        assertThat(response, containsString("<EmploymentHistory>"));
    }
}
