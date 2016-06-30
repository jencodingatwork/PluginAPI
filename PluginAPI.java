package com.my.company.swagger.api;

import io.swagger.annotations.ApiParam;
import com.my.company.swagger.api.AnalyticApiService;
import com.my.company.MyApp;
import com.my.company.swagger.api.util.NotFoundException;

import java.io.InputStream;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;


@Path("/plugin")
@io.swagger.annotations.Api(value ="Plugin", description = "the Plugin API")
@javax.annotation.Generated(value = "class com.my.company.codegen.MyCodegenGenerator", date = "2016-06-28T11:12:52.731-04:00")
@RequiresPermissions("protected:read")
public class PluginApi  {
   private final PluginpiService delegate = (AnalyticApiService) MyApp.getApplicationContext().getBean("AnalyticApiService");

    @POST 
    @Produces({ "application/json", "application/xml", "application/avro" })
    @Consumes({"application/x-www-form-urlencoded"})
    @io.swagger.annotations.ApiOperation(value = "Upload Plugin", notes = "This can only be done by the logged in user.", response = void.class, tags={ "Plugin", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class) })
    public Response createAnalytic(@ApiParam(value = "Uploaded Plugin", required=true)@FormParam("json")  String json,
            @FormDataParam("jarfile") InputStream jarInputStream,
            @FormDataParam("jarfileinfo") FormDataContentDisposition jarFileDetail,
            @FormDataParam("configfile") InputStream configInputStream,
            @FormDataParam("configfileinfo") FormDataContentDisposition configFileDetail,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAnalytic(json,jarInputStream, jarFileDetail,configInputStream, configFileDetail,securityContext);
    }
   
}
