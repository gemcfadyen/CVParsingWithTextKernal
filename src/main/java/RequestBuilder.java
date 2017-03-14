public class RequestBuilder {
    private String pathToCv;
    private String accountName;
    private String userName;
    private String password;

    public static RequestBuilder aRequestBuilder() {
        return new RequestBuilder();
    }

    public RequestBuilder withAbsolutePathToCv(String pathToCv) {
        this.pathToCv = pathToCv;
        return this;
    }

    public RequestBuilder withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public RequestBuilder withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public RequestBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public Request build() {
        return new Request(accountName, userName, password, pathToCv);
    }

}
