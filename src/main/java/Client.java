import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentException_Exception;
import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentImplService;
import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Client {

    private EnvironmentProperties properties;

    public Client(EnvironmentProperties properties) {
       this.properties = properties;
    }

    public String post(String absolutePathToCv) {
        ProcessDocumentImplService service = new ProcessDocumentImplService();
        ProcessDocumentInterface processDocumentImplPort = service.getProcessDocumentImplPort();

        Path originalCvPath = Paths.get(absolutePathToCv);

        System.out.println(originalCvPath.toAbsolutePath());
        try {
            String response = processDocumentImplPort.processDocument(
                    properties.getAccountName(),
                    properties.getUserName(),
                    properties.getPassword(),
                    originalCvPath.getFileName().toString(),
                    Files.readAllBytes(originalCvPath),
                    new byte[0],
                    new byte[0],
                    new ArrayList<>()
            );

            System.out.println("The response is: " + response);
            return response;
        } catch (ProcessDocumentException_Exception e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "yo";
    }
}
