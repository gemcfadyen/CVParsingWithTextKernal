import config.EnvironmentProperties;
import exceptions.ClientException;
import org.junit.Test;
import request.Request;
import request.RequestBuilder;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class ClientIntegrationTest {

    @Test
    public void callsPostWithCvInDocForm() {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/main/resources/prod.properties");
        Client client = new Client(new ProcessDocumentService());

        Request request = RequestBuilder.aRequestBuilder()
                .withAbsolutePathToCv("src/test/resources/standardCv.doc")
                .withAccountName(prodProperties.getAccountName())
                .withUserName(prodProperties.getUserName())
                .withPassword(prodProperties.getPassword())
                .build();
        String response = client.post(request);

        assertThat(response, containsString("<Personal>"));
        assertThat(response, containsString("<EducationHistory>"));
        assertThat(response, containsString("<EmploymentHistory>"));
    }

    @Test
    public void callsPostWithCvInPdfForm() {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/main/resources/prod.properties");
        Client client = new Client(new ProcessDocumentService());

        Request request = RequestBuilder.aRequestBuilder()
                .withAbsolutePathToCv("src/test/resources/linkedIn.pdf")
                .withAccountName(prodProperties.getAccountName())
                .withUserName(prodProperties.getUserName())
                .withPassword(prodProperties.getPassword())
                .build();

        String response = client.post(request);

        assertThat(response, containsString("<Personal>"));
        assertThat(response, containsString("<EducationHistory>"));
        assertThat(response, containsString("<EmploymentHistory>"));
    }

    @Test
    public void callsPostWithUnstructuredCv() {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/main/resources/prod.properties");
        Client client = new Client(new ProcessDocumentService());

        Request request = RequestBuilder.aRequestBuilder()
                .withAbsolutePathToCv("src/test/resources/unstructured.pdf")
                .withAccountName(prodProperties.getAccountName())
                .withUserName(prodProperties.getUserName())
                .withPassword(prodProperties.getPassword())
                .build();

        String response = client.post(request);

        assertThat(response, containsString("<Personal>"));
        assertThat(response, containsString("<EducationHistory>"));
        assertThat(response, containsString("<EmploymentHistory>"));
    }

    @Test
    public void documentWithSentenceParsed() {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/main/resources/prod.properties");
        Client client = new Client(new ProcessDocumentService());

        Request request = RequestBuilder.aRequestBuilder()
                .withAbsolutePathToCv("src/test/resources/blank.doc")
                .withAccountName(prodProperties.getAccountName())
                .withUserName(prodProperties.getUserName())
                .withPassword(prodProperties.getPassword())
                .build();

        String response = client.post(request);

        assertThat(response, containsString("<Personal>"));
        assertThat(response, containsString("<EducationHistory>"));
        assertThat(response, containsString("<EmploymentHistory>"));
    }

    @Test(expected= ClientException.class)
    public void exceptionThrownWhenBlankDocumentParsed() {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/main/resources/prod.properties");
        Client client = new Client(new ProcessDocumentService());

        Request request = RequestBuilder.aRequestBuilder()
                .withAbsolutePathToCv("src/test/resources/blank.pdf")
                .withAccountName(prodProperties.getAccountName())
                .withUserName(prodProperties.getUserName())
                .withPassword(prodProperties.getPassword())
                .build();

        client.post(request);
    }

}
