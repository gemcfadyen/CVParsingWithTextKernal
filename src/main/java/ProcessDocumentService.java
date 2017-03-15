import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentException_Exception;
import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentImplService;
import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessDocumentService {

    public String executeWith(Request request) throws IOException, ProcessDocumentException_Exception {
        ProcessDocumentImplService service = new ProcessDocumentImplService();
        ProcessDocumentInterface processDocumentImplPort = service.getProcessDocumentImplPort();
        Path originalCvPath = Paths.get(request.pathToCv());

       return processDocumentImplPort.processDocument(
                request.accountName(),
                request.userName(),
                request.password(),
                request.pathToCv(),
                Files.readAllBytes(originalCvPath),
                new byte[0],
                new byte[0],
                new ArrayList<>()
        );
    }
}
