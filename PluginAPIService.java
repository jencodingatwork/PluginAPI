package com.my.company.swagger.api;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.io.InputStream;
import com.my.company.swagger.api.util.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class com.rtn.iaf.codegen.MyCodegenGenerator", date = "2016-06-28T11:12:52.731-04:00")
public interface PluginApiService {
    public Response createPlugin(String json, InputStream jarInputStream, FormDataContentDisposition jarFileDetail,InputStream configInputStream, FormDataContentDisposition configFileDetail,SecurityContext securityContext) throws NotFoundException;
    
    public String getPluginApi();
}
