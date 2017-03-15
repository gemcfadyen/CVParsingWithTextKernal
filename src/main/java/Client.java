import exceptions.ClientException;
import exceptions.DocumentServiceException;
import request.Request;

public class Client {

    private final DocumentService processDocumentService;

    public Client(DocumentService processDocumentService) {
        this.processDocumentService = processDocumentService;
    }

    public String post(Request request) {

        try {
            return processDocumentService.executeWith(request);
        } catch (DocumentServiceException documentServiceException) {
            throw new ClientException();
        }
    }
}
