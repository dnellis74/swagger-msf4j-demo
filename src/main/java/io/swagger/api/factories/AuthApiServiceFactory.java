package io.swagger.api.factories;

import io.swagger.api.AuthApiService;
import io.swagger.api.impl.AuthApiServiceImpl;

public class AuthApiServiceFactory {
    private final static AuthApiService service = new AuthApiServiceImpl();

    public static AuthApiService getAuthApi() {
        return service;
    }
}
