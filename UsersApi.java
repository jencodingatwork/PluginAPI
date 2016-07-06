/*
 * UNCLASSIFIED
 *
 * IAF 
 *
 * COPYRIGHT (c), 2014, RAYTHEON COMPANY
 * An Unpublished Work
 * This data was developed pursuant to a Raytheon IRAD.
 *
 * RAYTHEON PROPRIETARY
 * If the end user is not the U.S. Government or any agency thereof, use
 * or disclosure of data contained in this source code file is subject to
 * the proprietary restrictions set forth in the Master Rights File.
 *
 * U.S. GOVERNMENT RESTRICTED RIGHTS NOTICE
 * If the end user is the U.S. Government or any agency thereof, this source
 * code is provided to the U.S. Government with Restricted Rights.
 * Use or disclosure of data contained in this source code file is subject to
 * the Restricted Rights restriction in the Master Rights File.
 *
 * U.S. EXPORT CONTROLLED TECHNICAL DATA
 * Use or disclosure of data contained in this source code file is subject to
 * the export restrictions set forth in the Master Rights File.
 *
 */
package com.rtn.iaf.api;

import io.swagger.annotations.ApiParam;

import com.rtn.iaf.IAFApp;
import com.rtn.iaf.api.util.NotFoundException;

import java.io.File;
import java.io.InputStream;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//This class WILL be overwritten as part of the code generation process

@Path("/users")


@io.swagger.annotations.Api(value ="users", description = "the users API")
@javax.annotation.Generated(value = "class com.rtn.iaf.codegen.IafCodegenGenerator", date = "2016-07-06T15:43:51.053-04:00")
@RequiresPermissions("protected:read")
public class UsersApi  {
   private final Logger LOGGER = LoggerFactory.getLogger(UsersApi.class);
   private final UsersApiService delegate = (UsersApiService) IAFApp.getApplicationContext().getBean("UsersApiService");

    @POST
    
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class) })
	//Note: this is also the response returned in the SwaggerUI	
    public Response createUser(@ApiParam(value = "Created user object" ) User body,
            @FormDataParam("file") InputStream fileInputStream,
            @FormDataParam("file") FormDataContentDisposition fileDetail,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(body,fileInputStream, fileDetail,securityContext);
    }
    @DELETE
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Inv", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = void.class) })
	//Note: this is also the response returned in the SwaggerUI	
    public Response deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathParam("username") String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(username,securityContext);
    }
    @GET
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get user by user name", notes = "", response = User.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = User.class) })
	//Note: this is also the response returned in the SwaggerUI	
    public Response getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true) @PathParam("username") String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserByName(username,securityContext);
    }
    @PUT
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid user supplied", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = void.class) })
	//Note: this is also the response returned in the SwaggerUI	
    public Response updateUser(@ApiParam(value = "name that need to be deleted",required=true) @PathParam("username") String username,@ApiParam(value = "Updated user object" ) User body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(username,body,securityContext);
    }
}
