import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class HttpClientTest {

    @Test
    public void callsPostWithCvInDocForm() {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/test/resources/prod.properties");
        Client client = new Client();

        Request request = RequestBuilder.aRequestBuilder()
                .withAbsolutePathToCv("src/test/resources/TimBucksCv.doc")
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
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/test/resources/prod.properties");
        Client client = new Client();

        Request request = RequestBuilder.aRequestBuilder()
                .withAbsolutePathToCv("src/test/resources/dipaksCv.pdf")
                .withAccountName(prodProperties.getAccountName())
                .withUserName(prodProperties.getUserName())
                .withPassword(prodProperties.getPassword())
                .build();

        String response = client.post(request);

        assertThat(response, containsString("<Personal>"));
        assertThat(response, containsString("<EducationHistory>"));
        assertThat(response, containsString("<EmploymentHistory>"));
    }
}
