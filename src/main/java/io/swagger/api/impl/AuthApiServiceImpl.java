package io.swagger.api.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ws.rs.core.Response;

import io.swagger.api.ApiResponseMessage;
import io.swagger.api.AuthApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.IsAvailable;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2016-12-07T16:49:05.689-07:00")
public class AuthApiServiceImpl extends AuthApiService {
    @Override
    public Response authCheckUsernameAvailabilityUsernameGet(String username
 ) throws NotFoundException {
    	//TODO this really isn't exposed
    	IsAvailable result = new IsAvailable();
    	List<Boolean> result2 = new ArrayList<Boolean>();
    	result2.add( new Boolean(new Random().nextBoolean()));
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, result2.toString())).build();
    }
}
