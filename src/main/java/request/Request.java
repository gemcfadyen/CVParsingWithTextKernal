package request;

public class Request {
    private String pathToCv;
    private String accountName;
    private String userName;
    private String password;

    public Request(String accountName, String userName, String password, String pathToCv) {
        this.accountName = accountName;
        this.userName = userName;
        this.password = password;
        this.pathToCv = pathToCv;
    }

    public String pathToCv() {
       return pathToCv;
    }

    public String accountName() {
        return accountName;
    }

    public String userName() { return userName; }

    public String password() {
        return password;
    }
}
