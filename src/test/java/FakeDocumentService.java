import request.Request;

public class FakeDocumentService implements DocumentService {

    private int executeInvoked = 0;
    @Override
    public String executeWith(Request request) {
        executeInvoked++;
        return "Successful-Response-From-Document-Service";
    }

    public int numberOfTimesExecuteInvoked() {
       return executeInvoked;
    }
}
