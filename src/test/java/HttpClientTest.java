import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class HttpClientTest {

    @Test
    public void callsPostWithCvInDocForm() {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/test/resources/prod.properties");
        Client client = new Client(prodProperties);
        String response = client.post("src/test/resources/TimBucksCv.doc");
        System.out.println(response);

        assertThat(response, containsString("<Personal>"));
        assertThat(response, containsString("<EducationHistory>"));
        assertThat(response, containsString("<EmploymentHistory>"));
    }

    @Test
    public void callsPostWithCvInPdfForm() {
        EnvironmentProperties prodProperties = new EnvironmentProperties("src/test/resources/prod.properties");
        Client client = new Client(prodProperties);
        String response = client.post("src/test/resources/dipaksCv.pdf");
        System.out.println(response);

        assertThat(response, containsString("<Personal>"));
        assertThat(response, containsString("<EducationHistory>"));
        assertThat(response, containsString("<EmploymentHistory>"));
    }
}
