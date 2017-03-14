import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentException_Exception;
import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentImplService;
import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Client {

    public String post(Request request) {
        ProcessDocumentImplService service = new ProcessDocumentImplService();
        ProcessDocumentInterface processDocumentImplPort = service.getProcessDocumentImplPort();

        Path originalCvPath = Paths.get(request.pathToCv());

        try {
            String response = processDocumentImplPort.processDocument(
                    request.accountName(),
                    request.userName(),
                    request.password(),
                    request.pathToCv(),
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
