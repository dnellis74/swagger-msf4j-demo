package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2016-12-07T16:49:05.689-07:00")
public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
