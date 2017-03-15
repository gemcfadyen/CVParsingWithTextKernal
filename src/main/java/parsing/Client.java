package parsing;

import parsing.exceptions.ClientException;
import parsing.exceptions.DocumentServiceException;
import parsing.request.Request;

public class Client {

    private final DocumentService processDocumentService;

    public Client(DocumentService processDocumentService) {
        this.processDocumentService = processDocumentService;
    }

    public String post(Request request) {

        try {
            String s = processDocumentService.executeWith(request);
            System.out.println(s);
            return s;
        } catch (DocumentServiceException documentServiceException) {
            throw new ClientException();
        }
    }
}
