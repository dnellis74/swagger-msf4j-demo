package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2016-12-07T16:49:05.689-07:00")
public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
