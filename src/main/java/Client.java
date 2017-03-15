import nl.textkernel.home.sourcebox.soap.documentprocessor.ProcessDocumentException_Exception;

import java.io.IOException;

public class Client {

    private final ProcessDocumentService processDocumentService;

    public Client(ProcessDocumentService processDocumentService) {
        this.processDocumentService = processDocumentService;
    }

    public String post(Request request) {

        try {
            return processDocumentService.executeWith(request);
        } catch (ProcessDocumentException_Exception | IOException e) {
            e.printStackTrace();
        }

        return "yo";
    }
}
