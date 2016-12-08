package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AuthApiService;
import io.swagger.api.factories.AuthApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.IsAvailable;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/auth")
@Consumes({ "N/A" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the auth API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2016-12-07T16:49:05.689-07:00")
public class AuthApi  {
   private final AuthApiService delegate = AuthApiServiceFactory.getAuthApi();

    @GET
    @Path("/check-username-availability/{username}")
    @Consumes({ "N/A" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns wherther a username is available", response = IsAvailable.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns whether username is available", response = IsAvailable.class, responseContainer = "List") })
    public Response authCheckUsernameAvailabilityUsernameGet(@ApiParam(value = "username to check",required=true) @PathParam("username") String username
)
    throws NotFoundException {
        return delegate.authCheckUsernameAvailabilityUsernameGet(username);
    }
}
